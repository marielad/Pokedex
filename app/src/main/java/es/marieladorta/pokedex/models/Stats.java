package es.marieladorta.pokedex.models;

import java.util.ArrayList;

public class Stats {

    private int base_stat;
    private int effort;
    private ArrayList<NameUrl> stat;

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public ArrayList<NameUrl> getStat() {
        return stat;
    }

    public void setStat(ArrayList<NameUrl> stat) {
        this.stat = stat;
    }
}
