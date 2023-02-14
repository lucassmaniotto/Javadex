package controller;

import DAO.DAOPokemon;
import model.WildPokemon;

public class ControllerPokemon {
    DAOPokemon daoPokemon = new DAOPokemon();

    /**
     * Salva um pokemon selvagem no banco de dados
     * @param pokemon
     * @return boolean
     */
    public boolean saveWildPokemonController(WildPokemon pokemon) {
        return this.daoPokemon.saveWildPokemon(pokemon);
    }

    /**
     * Retorna o próximo ID a ser inserido no banco de dados
     * @return int
     */
    public int getTheNextIdToInsertController() {
        return this.daoPokemon.getLastID() + 1;
    }

}
