package DAO;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Trainer;
import useful.SQLiteConnection;

/**
 * Classe responsável por fazer as operações de CRUD no banco de dados com o Objeto Trainer
 */
public class DAOTrainer extends SQLiteConnection {
    
    /**
     * Salva um treinador no banco de dados
     * @param trainer Trainer - Treinador a ser salvo
     * @return boolean - true se salvou, false se não salvou
     */
    public boolean saveTrainer(Trainer trainer) {
        connect();

        String sql = "INSERT INTO T_TRAINER ("
                    + "TRAINER_NAME, "
                    + "TRAINER_AGE ,"
                    + "TRAINER_BADGES ,"
                    + "TRAINER_REGION )"
                    + "VALUES (?,?,?,?)";

        PreparedStatement preparedStatement = createPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);

        try {
            preparedStatement.setString(1, trainer.getName());
            preparedStatement.setInt(2, trainer.getAge());
            preparedStatement.setInt(3, trainer.getBadges());
            preparedStatement.setString(4, trainer.getRegion());

            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            disconnect();
        }
        return true;
    }
}
