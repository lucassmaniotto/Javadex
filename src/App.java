package src;

import src.models.Pokemon;
import src.models.Trainer;
import src.models.Types;

public class App {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(1, "Bulbasaur", Types.GRASS, Types.POISON, 45, 49, 49, 45, 65, 65);
        Pokemon pokemon2 = new Pokemon(2, "Ivysaur", Types.GRASS, Types.POISON, 60, 62, 63, 60, 80, 80);
        Pokemon pokemon3 = new Pokemon(3, "Venusaur", Types.GRASS, Types.POISON, 80, 82, 83, 80, 100, 100);
        Pokemon pokemon4 = new Pokemon(4, "Charmander", Types.FIRE, null, 39, 52, 43, 65, 60, 50);
        Pokemon pokemon5 = new Pokemon(5, "Charmeleon", Types.FIRE, null, 58, 64, 58, 80, 80, 65);
        Pokemon pokemon6 = new Pokemon(6, "Charizard", Types.FIRE, Types.FLYING, 78, 84, 78, 100, 109, 85);

        Trainer ash = new Trainer(1, "Ash", 10, 0, "Kanto", 6);
        
        ash.addPokemon(pokemon);
        ash.addPokemon(pokemon2);
        ash.addPokemon(pokemon3);
        ash.addPokemon(pokemon4);
        ash.addPokemon(pokemon5);
        ash.addPokemon(pokemon6);
        
    }    
}