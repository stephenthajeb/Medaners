package com.example.medaners

object FoodData {
    private val foodNames = arrayOf(
        "Leng Hong Kien",
        "Kwetiau Goreng Beras",
        "Mie Pangsit Keriting",
        "Nasi Ayam Hainam",
        "Nasi Goreng Yangchow",
        "Nasi Kombinasi Tiga Rasa",
        "Nasi Gurih",
        "Sate Padang",
        "Soto Medan",
        "Wokfen"
    )

    private val foodDetails = arrayOf(
        "Dimsum dengan campuran daging udang, kepiting, dan ayam",
        "Kwetiau goreng beras khas Medan yang dilengkapi dengan seafood dan daging",
        "Mie pangsit keriting khas Medan dengan tekstur sangat baik dan gurih",
        "Nasi ayam khas Singapura dengan pilihan ayam Panggang atau kukus",
        "Nasi goreng khas YangChow yang dilengkapi dengan potongan udang, daging, bakso, dan kepiting",
        "Nasi dengan kombinasi 3 jenis daging (pork, duck, chicken)",
        "Nasi gurih yang wangi, gurih, dan dilengkapi sayuran dan sambal yang lezat",
        "Soto khas medan dengan santan dan potongan ayam, tauge",
        "Sate padang dengan berbagai pilihan daging, kulit, usus",
        "Kwetiau Siram dengan kuah telor yang kental, dilengkapi juga dengan seafood dan daging"
    )

    private val foodImages =
        intArrayOf(
            R.drawable.leng_hong_kien,
            R.drawable.kwetiau_goreng,
            R.drawable.mie_pangsit,
            R.drawable.nasi_ayam_hainam,
            R.drawable.nasi_goreng_yang_chow,
            R.drawable.nasi_kombinasi_tiga_rasa,
            R.drawable.nasi_gurih,
            R.drawable.sate_padang,
            R.drawable.soto_medan,
            R.drawable.wakfen
        )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (idx in foodNames.indices) {
                val food = Food()
                food.name = foodNames[idx]
                food.detail = foodDetails[idx]
                food.photo = foodImages[idx]
                list.add(food)
            }
            return list
        }

}