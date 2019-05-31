package com.sodexoplus.pokemon.ui.pokemonlist

import com.sodexoplus.pokemon.network.response.PokemonListResponse
import com.sodexoplus.pokemon.ui.base.IView

interface PokemonListView : IView {
    fun setPokemonList(response: PokemonListResponse)
}
