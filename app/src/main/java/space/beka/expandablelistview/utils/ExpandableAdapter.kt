package space.beka.expandablelistview.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import space.beka.expandablelistview.databinding.ItemChildBinding
import space.beka.expandablelistview.databinding.ItemParentBinding

class ExpandableAdapter(val titleList:ArrayList<String>, val map:HashMap<String, ArrayList<String>>): BaseExpandableListAdapter() {
    override fun getGroupCount(): Int =titleList.size

    override fun getChildrenCount(groupPosition: Int): Int {
        return map[titleList[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return titleList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        val list= map[titleList[groupPosition]]!!
        return list[childPosition]

    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean=true

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val itemParentBinding=ItemParentBinding.inflate(LayoutInflater.from(parent?.context), parent,false)
        itemParentBinding.tvName.text=titleList[groupPosition]
        return itemParentBinding.root
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val itemChildBinding=ItemChildBinding.inflate(LayoutInflater.from(parent?.context), parent,false)
        itemChildBinding.tvName.text=map[titleList[groupPosition]]?.get(childPosition)
        return itemChildBinding.root
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
       return true
    }
}