package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um treinador Pokémon.
 * @author Lucas Smaniotto e Valtemir Junior
 */
public class Trainer {
    private int id;
    private String name;
    private int age;
    private int badges;
    private String region;
    private List<TrainedPokemon> pokemonList = new ArrayList<TrainedPokemon>();
    private TrainedPokemon[] party = new TrainedPokemon[6];
    
    public Trainer(String name, int age, int badges, String region) {
        this.name = name;
        this.age = age;
        this.badges = badges;
        this.region = region;
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

    public List<TrainedPokemon> getPokemonList() {
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

    public void setPokemonList(List<TrainedPokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void setParty(TrainedPokemon[] party) {
        this.party = party;
    }
}
