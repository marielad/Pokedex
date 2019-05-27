package es.marieladorta.pokedex.controller;

import es.marieladorta.pokedex.models.pokeMoves.Tipo;
import es.marieladorta.pokedex.models.pokeStats.Ability;
import es.marieladorta.pokedex.models.pokemon.Pokemon;
import es.marieladorta.pokedex.models.pokemon.PokemonRespuesta;
import es.marieladorta.pokedex.models.pokeSpecies.PokemonSpecies;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit,@Query("offset") int offset);

    @GET("pokemon/{id}")
    Call<Pokemon> obtenerPokemon(@Path("id") int id);

    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> obtenerPokemonSpecies(@Path("id") int id);

    @GET("/ability/{id}")
    Call<Ability> obtenerHabilidad(@Path("id") int id);

    @GET("/type/{id}")
    Call<Tipo> obtenerTipo(@Path("id") int id);
}
