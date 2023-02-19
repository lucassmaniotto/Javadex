package controller;

import java.util.List;

import DAO.DAOTrainerParty;
import model.TrainedPokemon;

/**
 * Classe responsável por controlar as ações do usuário relacionadas ao Time do treinador.
 */
public class ControllerTrainerParty {
    DAOTrainerParty daoTrainerParty = new DAOTrainerParty();

    /**
     * Salva a lista de Pokémons do Time do treinador no banco de dados, recebendo a lista de Pokémons e o ID do treinador.
     * @param idTrainer ID do treinador.
     * @param pokemonList Lista de Pokémons do treinador.
     */
    public boolean saveTrainerPartyController(int idTrainer, List<TrainedPokemon> pokemonList) {
        return this.daoTrainerParty.saveTrainerParty(idTrainer, pokemonList);
    }

    /**
     * Retorna uma lista de Pokémons do Time do treinador, recebendo o ID do treinador.
     * @param idTrainer ID do treinador.
     * @return Lista de Pokémons do Time do treinador.
     */
    public List<TrainedPokemon> getTrainerPartyController(int idTrainer) {
        return this.daoTrainerParty.getTrainerParty(idTrainer);
    }

    /**
     * Remove o Pokémon do Time do treinador, recebendo o ID do treinador e o ID do Pokémon.
     * @param idTrainer ID do treinador.
     * @param idPokemon ID do Pokémon.
     */
    public boolean removePokemonFromTrainerPartyController(int idTrainer, int idPokemon) {
        return this.daoTrainerParty.removePokemonFromTrainerParty(idTrainer, idPokemon);
    }

    /**
     * Verifica se o Pokémon já existe no Time do treinador.
     * @param idPokemon ID do Pokémon.
     * @param idTrainer ID do treinador.
     * @return True se o Pokémon já existe no Time do treinador, False se não existe.
     */
    public boolean checkTrainerPartyController(int idPokemon, int idTrainer) {
        return this.daoTrainerParty.checkIfPokemonAlreadyExists(idPokemon, idTrainer);
    }

    public void removeAllTrainerPartyController(int idTrainer) {
        this.daoTrainerParty.removeAllTrainerParty(idTrainer);
    }
}
