package com.radroid.gridlist

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic(@StringRes val topic:Int,
                 @IntegerRes val number: Int,
                 @DrawableRes val image:Int)
