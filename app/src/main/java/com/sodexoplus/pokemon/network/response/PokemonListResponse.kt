package com.sodexoplus.pokemon.network.response

import com.google.gson.annotations.SerializedName
import com.sodexoplus.pokemon.model.Pokemon

class PokemonListResponse : BaseResponse() {

    @SerializedName("count")
    var count: Int? = null

    @SerializedName("results")
    var results: ArrayList<Pokemon>? = null

}