package space.beka.expandablelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import space.beka.expandablelistview.databinding.ActivityMainBinding
import space.beka.expandablelistview.utils.ExpandableAdapter
import space.beka.expandablelistview.utils.MyData
import space.beka.expandablelistview.utils.MyData.titleList

class MainActivity : AppCompatActivity() {

    private  val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var expandableAdapter: ExpandableAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addElement()

        expandableAdapter= ExpandableAdapter(MyData.titleList, MyData.map)
        binding.myExpandView.setAdapter(expandableAdapter)

        binding.myExpandView.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->

        Toast.makeText(this, "${MyData.map[titleList[groupPosition]]?.get(childPosition)}", Toast.LENGTH_SHORT).show()

            true
        }
    }
}