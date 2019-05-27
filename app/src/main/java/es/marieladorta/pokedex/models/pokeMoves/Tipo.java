package es.marieladorta.pokedex.models.pokeMoves;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import es.marieladorta.pokedex.models.general.Nombres;

public class Tipo {

    @SerializedName("names")
    private ArrayList<Nombres> names;

    public ArrayList<Nombres> getNames() {
        return names;
    }
}
