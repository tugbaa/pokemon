package com.sodexoplus.pokemon.ui.pokemondetail

import com.sodexoplus.pokemon.network.response.PokemonDetailResponse

interface PokemonDetailInteractor {
    interface PokemonDetailListener {

        fun onPokemonDetailFailed(e: Throwable, errorMessage: String)

        fun onPokemonDetailSuccess(response: PokemonDetailResponse)
    }

    fun getPokemonDetail(name: String?, listener: PokemonDetailListener)
}
