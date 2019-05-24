package es.marieladorta.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import es.marieladorta.pokedex.controller.PokeapiService;
import es.marieladorta.pokedex.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonActivity extends AppCompatActivity {

    private static final String TAG = "Poke ";

    private Retrofit retrofit;

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            id = extras.getInt("id");
        }

//        obtenerPokemon(id);
    }

    private void obtenerPokemon(int id){
        PokeapiService pokeapiService = retrofit.create(PokeapiService.class);
        Call<PokemonRespuesta> pokemonRespuestaCall = pokeapiService.obtenerPokemon(id);

        pokemonRespuestaCall.enqueue(new Callback<PokemonRespuesta>() {
            @Override
            public void onResponse(Call<PokemonRespuesta> call, Response<PokemonRespuesta> response) {
                if (response.isSuccessful()){



                }else{

                }

            }

            @Override
            public void onFailure(Call<PokemonRespuesta> call, Throwable t) {

            }
        });
    }
}
