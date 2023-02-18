package model;

import java.util.ArrayList;

/**
 * Classe que representa um treinador Pokémon.
 */
public class Trainer {
    private int id;
    private String name;
    private int age;
    private int badges;
    private String region;
    private int pokemonCount;
    private ArrayList<TrainedPokemon> pokemonList = new ArrayList<TrainedPokemon>();
    private TrainedPokemon[] party = new TrainedPokemon[6];
    
    public Trainer(String name, int age, int badges, String region, int pokemonCount) {
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

    public ArrayList<TrainedPokemon> getPokemonList() {
        return pokemonList;
    }

    public Pokemon[] getParty() {
        return party;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPokemonCount(int pokemonCount) {
        this.pokemonCount = pokemonCount;
    }

    public void setPokemonList(ArrayList<TrainedPokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void setParty(TrainedPokemon[] party) {
        this.party = party;
    }
}
