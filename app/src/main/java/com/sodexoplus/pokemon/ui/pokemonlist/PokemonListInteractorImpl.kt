package com.sodexoplus.pokemon.ui.pokemonlist

import com.sodexoplus.pokemon.network.core.NetworkService
import com.sodexoplus.pokemon.network.observer.PokemonListObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonListInteractorImpl : PokemonListInteractor {
    override fun getPokemonList(listener: PokemonListInteractor.PokemonListListener) {
        NetworkService.service()!!.getPokemonList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(PokemonListObserver(listener))
    }

}
