package space.beka.expandablelistview.utils

object MyData {

    val map=HashMap<String, ArrayList<String>>()
    val titleList=ArrayList<String>()

    fun addElement(){
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("TV")
        titleList.add("Computer Accessories")

        val phone=ArrayList<String>()
        phone.add("MI")
        phone.add("Samsung")
        phone.add("QB")
        phone.add("Maxvi")
        phone.add("Nokia")

        val laptops=ArrayList<String>()
        laptops.add("Acer")
        laptops.add("MackBook")
        laptops.add("Asus")
        laptops.add("VivoBook")

        val tv=ArrayList<String>()
        tv.add("LG")
        tv.add("Samsung")
        tv.add("Actavius")
        tv.add("UHD TV")

        val pcAcc=ArrayList<String>()
        pcAcc.add("A")
        pcAcc.add("B")
        pcAcc.add("C")
        pcAcc.add("D")

        map[titleList[0]]=phone
        map[titleList[1]]=laptops
        map[titleList[2]]=tv
        map[titleList[3]]=pcAcc
    }

}