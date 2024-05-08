package com.radroid.gridlist

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val topic:Int,
                 val number: Long,
                 @DrawableRes val image:Int)
