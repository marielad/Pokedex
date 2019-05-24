package es.marieladorta.pokedex.models;

import java.util.ArrayList;

public class Pokemon {

    private ArrayList<Habilidades> abilities;
    private int height;
    private int id;
    private ArrayList<Movimientos> moves;
    private String name;
    private int weight;
    private ArrayList<NameUrl> species;
    private ArrayList<Sprites> sprites;
    private ArrayList<Stats> stats;
    private ArrayList<Tipos> types;

    public Pokemon(ArrayList<Habilidades> abilities, int height, int id, ArrayList<Movimientos> moves, ArrayList<Nombres> names, int weight, ArrayList<NameUrl> species, ArrayList<Sprites> sprites, ArrayList<Stats> stats, ArrayList<Tipos> types) {
        this.abilities = abilities;
        this.height = height;
        this.id = id;
        this.moves = moves;
        this.weight = weight;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Habilidades> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Habilidades> abilities) {
        this.abilities = abilities;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Movimientos> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Movimientos> moves) {
        this.moves = moves;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<NameUrl> getSpecies() {
        return species;
    }

    public void setSpecies(ArrayList<NameUrl> species) {
        this.species = species;
    }

    public ArrayList<Sprites> getSprites() {
        return sprites;
    }

    public void setSprites(ArrayList<Sprites> sprites) {
        this.sprites = sprites;
    }

    public ArrayList<Stats> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stats> stats) {
        this.stats = stats;
    }

    public ArrayList<Tipos> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Tipos> types) {
        this.types = types;
    }
}
