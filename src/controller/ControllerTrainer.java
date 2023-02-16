package controller;

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
}
