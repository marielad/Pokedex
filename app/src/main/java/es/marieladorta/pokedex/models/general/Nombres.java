package es.marieladorta.pokedex.models.general;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import es.marieladorta.pokedex.models.general.NameUrl;

public class Nombres {

    @SerializedName("name")
    private String name;

    @SerializedName("lenguage")
    private ArrayList<NameUrl> lenguage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<NameUrl> getLenguage() {
        return lenguage;
    }

    public void setLenguage(ArrayList<NameUrl> lenguage) {
        this.lenguage = lenguage;
    }
}
