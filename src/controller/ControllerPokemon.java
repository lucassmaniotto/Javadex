package controller;

import java.util.List;

import DAO.DAOPokemon;
import model.TrainedPokemon;
import model.WildPokemon;

/**
 * Classe responsável por controlar as ações do usuário relacionadas ao Objetos WildPokemon e TrainedPokemon
 * @author Lucas Smaniotto & Valtemir Junior
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
        return this.daoPokemon.getLastID() + 1;
    }

    /**
     * Retorna uma lista de pokemons selvagens do banco de dados
     * @return List - Lista de pokemons selvagens do Tipo WildPokemon
     */
    public List<WildPokemon> getWildPokemonsController() {
        return this.daoPokemon.getWildPokemons();
    }

    /**
     * Retorna o pokemon selvagem com o ID passado como parâmetro
     * @param id int - ID do pokemon selvagem
     * @return WildPokemon - Pokemon selvagem com o ID passado como parâmetro
     */
    public WildPokemon getWildPokemonByIdController(int id) {
        return this.daoPokemon.getWildPokemonById(id);
    }

    /**
     * Retorna uma lista de pokemons treinados do banco de dados
     * @param id int - ID do treinador
     * @return List - Lista de pokemons treinados do Tipo TrainedPokemon
     */
    public List<TrainedPokemon> getTrainedPokemonsController(int id) {
        return this.daoPokemon.getTrainedPokemons(id);
    }

    /**
     * Atualiza o pokemon selvagem no banco de dados
     * para um pokemon treinado através do ID
     * @param idPokemon int - ID do pokemon selvagem
     * @param idTrainer int - ID do treinador
     */
    public boolean setWildPokemonToTrainedPokemonController(int idPokemon, int idTrainer) {
        if (this.daoPokemon.setWildPokemonToTrainedPokemon(idPokemon, idTrainer)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Atualiza o pokemon treinado no banco de dados
     * para um pokemon selvagem através do ID
     * @param idPokemon int - ID do pokemon treinado
     */
    public boolean setTrainedPokemonToWildPokemonController(int idPokemon) {
        if (this.daoPokemon.setTrainedPokemonToWildPokemon(idPokemon)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o pokemon treinado com o ID passado como parâmetro
     * @param idPokemon int - ID do pokemon treinado
     * @param idTrainer int - ID do treinador
     * @return TrainedPokemon - Pokemon treinado do banco de dados
     */
    public TrainedPokemon getTrainedPokemonByIdController(int idPokemon, int idTrainer) {
        return this.daoPokemon.getTrainedPokemonById(idPokemon, idTrainer);
    }
}

