package controller;

import java.util.List;

import DAO.DAOTrainer;
import model.Trainer;

/**
 * Classe responsável por controlar as ações do usuário relacionadas ao Objeto Trainer.
 * @author Lucas Smaniotto e Valtemir Junior
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

    /**Retorna um treinador do banco de dados através do seu ID.
     * @param id ID do treinador a ser retornado.
     * @return Trainer - Treinador com o ID passado como parâmetro.
     */
    public Trainer getTrainerByIDController(int id) {
        return this.daoTrainer.getTrainer(id);
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

    /**
     * Remove um treinador do banco de dados através do seu ID
     * e torna seus pokemons treinados como selvagens
     * @param idTrainer ID do treinador a ser removido.
     */
    public void removeTrainerController(int idTrainer) {
        this.daoTrainer.removeTrainer(idTrainer);
        this.daoTrainer.removeTrainerPokemons(idTrainer);
    }

    /**
     * Atualiza um treinador no banco de dados
     * @param idTrainer - Treinador a ser atualizado
     * @param region - Região do treinador
     * @param age - Idade do treinador
     * @param badges - Quantidade de badges do treinador
     */
    public void updateTrainerController(int idTrainer, String region, int age, int badges) {
        this.daoTrainer.updateTrainer(idTrainer, region, age, badges);
    }
}