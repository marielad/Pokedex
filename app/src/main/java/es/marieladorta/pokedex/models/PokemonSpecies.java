package es.marieladorta.pokedex.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PokemonSpecies {

    @SerializedName("flavor_text_entries")
    ArrayList<Lenguaje> flavor_text_entries;

    public ArrayList<Lenguaje> getFlavor_text_entries() {
        return flavor_text_entries;
    }
}
