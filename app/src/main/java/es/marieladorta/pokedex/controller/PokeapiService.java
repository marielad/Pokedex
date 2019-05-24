package es.marieladorta.pokedex.controller;

import es.marieladorta.pokedex.models.Pokemon;
import es.marieladorta.pokedex.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit,@Query("offset") int offset);

    @GET("pokemon/{id}")
    Call<Pokemon> obtenerPokemon(@Path("id") int pokemonId);

}
