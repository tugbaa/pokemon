package com.sodexoplus.pokemon.model

import com.google.gson.annotations.SerializedName

class Pokemon {
    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("url")
    var url: String? = null
}