package com.sodexoplus.pokemon.ui.pokemonlist

import com.sodexoplus.pokemon.network.response.PokemonListResponse

class PokemonListPresenterImpl(private var view: PokemonListView?, private var interactor: PokemonListInteractor?) :
    PokemonListPresenter, PokemonListInteractor.PokemonListListener {
    override fun onPokemonListFailed(e: Throwable, errorMessage: String) {
        view?.showErrorMessage(errorMessage)
    }

    override fun onPokemonListSuccess(response: PokemonListResponse) {
        view?.setPokemonList(response)
    }

    override fun getPokemonList() {
        interactor?.getPokemonList(this)
    }

    override fun onDestroy() {
        view = null
    }

}
