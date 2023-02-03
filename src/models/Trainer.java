package src.models;

import java.util.ArrayList;

public class Trainer {
    private int id;
    private String name;
    private int age;
    private int badges;
    private String region;
    private int pokemonCount;
    private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
    private Pokemon[] party = new Pokemon[6];

    public Trainer(int id, String name, int age, int badges, String region, int pokemonCount) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.badges = badges;
        this.region = region;
        this.pokemonCount = pokemonCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBadges() {
        return badges;
    }

    public String getRegion() {
        return region;
    }

    public int getPokemonCount() {
        return pokemonCount;
    }

    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Pokemon[] getParty() {
        return party;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemonList.remove(pokemon);
    }

    public void addBadge() {
        if(badges <= 8) {
            badges++;
        }
    }

    public void addToParty(Pokemon pokemon) {
        for(int i = 0; i < party.length; i++) {
            if(party[i] == null && i < 6) {
                party[i] = pokemon;
                break;
            } else if(i == 5) {
                // alerta treinador que o party está cheia
            }
        }
    }

    public void removeFromParty(Pokemon pokemon) {
        for(int i = 0; i < party.length; i++) {
            if(party[i] == pokemon) {
                party[i] = null;
                break;
            }
        }
    }
}
