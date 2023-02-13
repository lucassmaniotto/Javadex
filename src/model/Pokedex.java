package model;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
