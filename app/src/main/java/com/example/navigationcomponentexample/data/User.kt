package com.example.navigationcomponentexample.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val email: String, val name: String, val surname: String) : Parcelable