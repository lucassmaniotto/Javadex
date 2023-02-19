package controller;

import java.util.List;

import DAO.DAOTrainerParty;
import model.TrainedPokemon;

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
}
