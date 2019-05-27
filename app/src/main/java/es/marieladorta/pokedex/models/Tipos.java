package es.marieladorta.pokedex.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

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
