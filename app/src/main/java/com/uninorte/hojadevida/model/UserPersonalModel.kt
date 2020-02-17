package com.uninorte.hojadevida.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserPersonalModel (val name: String ,
                         val estado: String,
                         val edad : Int,
                         val hobby : String,
                         val numeroHermanos: Int,
                         val imagen: Int) : Parcelable {
}