package es.marieladorta.pokedex.models;

import java.util.ArrayList;

public class Habilidades {

    private ArrayList<NameUrl> ability;
    private String is_hidden;
    private int slot;

    public ArrayList<NameUrl> getAbility() {
        return ability;
    }

    public void setAbility(ArrayList<NameUrl> ability) {
        this.ability = ability;
    }

    public String getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(String is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
