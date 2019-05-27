package es.marieladorta.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import es.marieladorta.pokedex.models.general.NameUrl;

public class Movimientos {

    @SerializedName("move")
    private NameUrl move;

    public NameUrl getMove() {
        return move;
    }
}
