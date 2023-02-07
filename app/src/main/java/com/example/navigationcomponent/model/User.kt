package com.example.navigationcomponent.model

import android.os.Parcelable
import android.widget.ImageView
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val userName:String,val passwrd:String):Parcelable
