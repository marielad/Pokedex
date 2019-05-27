package es.marieladorta.pokedex.models;

import com.google.gson.annotations.SerializedName;

public class Movimientos {

    @SerializedName("move")
    private NameUrl move;

    public NameUrl getMove() {
        return move;
    }
}
