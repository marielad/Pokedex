package es.marieladorta.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.marieladorta.pokedex.controller.PokeapiService;
import es.marieladorta.pokedex.models.Pokemon;
import es.marieladorta.pokedex.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonActivity extends AppCompatActivity {

    private static final String TAG = "Poke ";

    private Retrofit retrofit;

    private int id;

    private TextView nombre;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            id = extras.getInt("id");
        }

        nombre = findViewById(R.id.nombrePokemon);


        retrofit =  new Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Log.e(TAG, id+"");
        obtenerPokemon(id);
    }

    private void obtenerPokemon(int pokeId){
        PokeapiService pokeapiService = retrofit.create(PokeapiService.class);
        Call<Pokemon> pokemonCall = pokeapiService.obtenerPokemon(pokeId);

        pokemonCall.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if (response.isSuccessful()){
                        Pokemon pokemonResponse = response.body();
//                        nombre.setText(pokemonResponse.getName());
                            name = pokemonResponse.getName();

                    Log.e(TAG, pokemonResponse+"");
                }else{
                    Log.e(TAG, "" + response.errorBody());
                }

                Log.e(TAG, name);
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {

            }
        });
    }
}
