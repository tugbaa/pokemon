package com.sodexoplus.pokemon.model

import com.google.gson.annotations.SerializedName

class Ability {

    @SerializedName("ability")
    var ability: AbilityDetail? = null

    @SerializedName("is_hidden")
    var is_hidden: Boolean? = null

    @SerializedName("slot")
    var slot: Int? = null

}