package com.sodexoplus.pokemon.ui.pokemondetail

import com.sodexoplus.pokemon.network.response.PokemonDetailResponse
import com.sodexoplus.pokemon.ui.base.IView

interface PokemonDetailView : IView {
    fun setPokemonDetail(response: PokemonDetailResponse)
}