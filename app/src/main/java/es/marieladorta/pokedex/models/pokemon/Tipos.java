package es.marieladorta.pokedex.models.pokemon;

import com.google.gson.annotations.SerializedName;

import es.marieladorta.pokedex.models.general.NameUrl;

public class Tipos {

    @SerializedName("slot")
    private double slot;

    private NameUrl type;

    public double getSlot() {
        return slot;
    }

    public NameUrl getType() {
        return type;
    }
}
