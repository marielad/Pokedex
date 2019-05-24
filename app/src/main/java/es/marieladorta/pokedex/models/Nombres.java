package es.marieladorta.pokedex.models;

import java.util.ArrayList;

public class Nombres {

    private String name;
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
