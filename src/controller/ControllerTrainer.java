package controller;

import java.util.List;

import DAO.DAOTrainer;
import model.Trainer;

/**
 * Classe responsável por controlar as ações do usuário relacionadas ao Objeto Trainer.
 */
public class ControllerTrainer {
    DAOTrainer daoTrainer = new DAOTrainer();

    /**
     * Método responsável por salvar um novo treinador no banco de dados.
     * @param trainer Objeto do tipo Trainer.
     * @return Retorna um booleano indicando se o treinador foi salvo com sucesso.
     */
    public boolean saveTrainerController(Trainer trainer) {
        return this.daoTrainer.saveTrainer(trainer);    
    }

    /**
     * Método responsável por retornar o próximo ID a ser inserido no banco de dados.
     * @return int - ID a ser inserido.
     */
    public int getTheNextIdToInsertController() {
        return this.daoTrainer.getLastID() + 1;
    }

    /**
     * Retorna uma lista de treinadores do banco de dados
     * @return List - Lista de treinadores do Tipo Treinadores
     */
    public List<Trainer> getTrainersController() {
        return this.daoTrainer.getTrainers();
    }
}
