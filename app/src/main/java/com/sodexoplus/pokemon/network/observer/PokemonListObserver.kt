package com.sodexoplus.pokemon.network.observer

import android.text.TextUtils
import com.sodexoplus.pokemon.network.response.PokemonListResponse
import com.sodexoplus.pokemon.ui.pokemonlist.PokemonListInteractor

class PokemonListObserver(private var listener: PokemonListInteractor.PokemonListListener) :
    BaseObserver<PokemonListResponse>() {

    override fun onNext(response: PokemonListResponse) {
        listener.onPokemonListSuccess(response)
    }

    override fun onError(e: Throwable) {
        super.onError(e)
        if (!TextUtils.isEmpty(errorMessage)) {
            listener.onPokemonListFailed(e, errorMessage)
        }
    }

}