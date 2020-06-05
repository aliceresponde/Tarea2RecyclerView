package com.aliceresponde.tarea2recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class City(val name: String, val description: String) : Parcelable
