package com.radroid.gridlist

class DataSource {
    fun topic():List<Topic>{
    return listOf(
        Topic(R.string.architecture, R.integer.architecture, R.drawable.img_1),
        Topic(R.string.crafts, R.integer.crafts, R.drawable.img_2),
        Topic(R.string.business, R.integer.business, R.drawable.img_3),
        Topic(R.string.culinary, R.integer.culinary, R.drawable.img_4),
        Topic(R.string.design, R.integer.design, R.drawable.img_5),
        Topic(R.string.fashion, R.integer.fashion, R.drawable.img_6),
        Topic(R.string.film, R.integer.film, R.drawable.img_7),
        Topic(R.string.gaming, R.integer.gaming, R.drawable.img_8),
        Topic(R.string.drawing, R.integer.drawing, R.drawable.img_9),
        Topic(R.string.photography, R.integer.photography, R.drawable.img_10),
        Topic(R.string.drawing, R.integer.drawing, R.drawable.img_11),
        Topic(R.string.painting, R.integer.painting, R.drawable.img_12),
        Topic(R.string.photography, R.integer.photography, R.drawable.img_13),
        Topic(R.string.tech, R.integer.tech, R.drawable.img_14),
    )
}
    }