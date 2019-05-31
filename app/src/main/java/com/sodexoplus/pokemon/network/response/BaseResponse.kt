package com.sodexoplus.pokemon.network.response

import android.os.Parcel
import android.os.Parcelable

open class BaseResponse : Parcelable {

    constructor() {}

    protected constructor(`in`: Parcel) {}

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {}

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<BaseResponse> = object : Parcelable.Creator<BaseResponse> {
            override fun createFromParcel(`in`: Parcel): BaseResponse {
                return BaseResponse(`in`)
            }

            override fun newArray(size: Int): Array<BaseResponse?> {
                return arrayOfNulls(size)
            }
        }
    }
}
