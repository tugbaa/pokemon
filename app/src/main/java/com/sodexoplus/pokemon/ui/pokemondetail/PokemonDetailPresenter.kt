package com.sodexoplus.pokemon.ui.pokemondetail

import com.sodexoplus.pokemon.ui.base.IPresenter

interface PokemonDetailPresenter : IPresenter {
    fun getPokemonDetail(name: String?)
}