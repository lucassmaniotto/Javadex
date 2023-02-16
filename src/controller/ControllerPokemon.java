package controller;

import java.util.List;

import DAO.DAOPokemon;
import model.WildPokemon;

/**
 * Classe responsável por controlar as ações do usuário relacionadas ao Objeto Pokemon
 */
public class ControllerPokemon {
    DAOPokemon daoPokemon = new DAOPokemon();

    /**
     * Salva um pokemon selvagem no banco de dados
     * @param pokemon WildPokemon - Pokemon selvagem a ser salvo
     * @return boolean - true se salvou, false se não salvou
     */
    public boolean saveWildPokemonController(WildPokemon pokemon) {
        return this.daoPokemon.saveWildPokemon(pokemon);
    }

    /**
     * Retorna o próximo ID a ser inserido no banco de dados
     * @return int - ID a ser inserido
     */
    public int getTheNextIdToInsertController() {
        if (this.daoPokemon.getLastID() != 0) {
            return this.daoPokemon.getLastID() + 1;
        }
        return 1;
    }

    /**
     * Retorna uma lista de pokemons selvagens do banco de dados
     * @return List - Lista de pokemons selvagens do Tipo WildPokemon
     */
    public List<WildPokemon> getWildPokemonsController() {
        return this.daoPokemon.getWildPokemons();
    }
}
