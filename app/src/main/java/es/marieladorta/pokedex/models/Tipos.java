package es.marieladorta.pokedex.models;

import java.util.ArrayList;

public class Tipos {
    private int slot;
    private ArrayList<NameUrl> type;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public ArrayList<NameUrl> getType() {
        return type;
    }

    public void setType(ArrayList<NameUrl> type) {
        this.type = type;
    }
}
