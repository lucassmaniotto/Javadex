package src.models;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
    
    public void registerPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemons.remove(pokemon);
    }

}
