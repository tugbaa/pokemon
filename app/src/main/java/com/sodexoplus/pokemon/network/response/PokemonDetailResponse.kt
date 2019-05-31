package com.sodexoplus.pokemon.network.response

import com.google.gson.annotations.SerializedName
import com.sodexoplus.pokemon.model.Ability
import com.sodexoplus.pokemon.model.Move
import com.sodexoplus.pokemon.model.Sprite

class PokemonDetailResponse : BaseResponse() {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("sprites")
    var sprites: Sprite? = null

    @SerializedName("moves")
    var moves: ArrayList<Move>? = null

    @SerializedName("weight")
    var weight: Int? = null

    @SerializedName("height")
    var height: Int? = null

    @SerializedName("abilities")
    var abilities: ArrayList<Ability>? = null
}