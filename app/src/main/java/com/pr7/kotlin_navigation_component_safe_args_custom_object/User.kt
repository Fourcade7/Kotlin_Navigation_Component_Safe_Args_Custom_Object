package com.pr7.kotlin_navigation_component_safe_args_custom_object

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User constructor(
    val uid:Int,
    val name:String
):Parcelable