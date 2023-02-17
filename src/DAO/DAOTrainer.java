package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.SQLiteConnection;
import model.Regions;
import model.Trainer;

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
                    + "TRAINER_REGION ,"
                    + "TRAINER_POKEMON_COUNT ) "
                    + "VALUES (?,?,?,?,0)";

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

    /**
     * Retorna o último ID inserido no banco de dados
     * @return int - ID a ser inserido
     */
    public int getLastID() {
        connect();

        String sql = "SELECT MAX(PK_TRAINER_ID) FROM T_TRAINER";

        PreparedStatement preparedStatement = createPreparedStatement(sql);
        int ID = 0;
        try {
            ID = preparedStatement.executeQuery().getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            disconnect();
        }

        return ID;
    }

    /**
     * Retorna uma lista com todos os treinadores do banco de dados
     * @return List - Lista de treinadores do tipo Trainer
     */
    public List<Trainer> getTrainers() {
        List<Trainer> wildPokemonsList = new ArrayList<>();
        
        connect();
        String sql = "SELECT * FROM T_TRAINER";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString(), 0);
                trainer.setId(resultSet.getInt("PK_TRAINER_ID"));
                trainer.setName(resultSet.getString("TRAINER_NAME"));
                trainer.setAge(resultSet.getInt("TRAINER_AGE"));
                trainer.setBadges(resultSet.getInt("TRAINER_BADGES"));
                trainer.setRegion(resultSet.getString("TRAINER_REGION"));
                wildPokemonsList.add(trainer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return Collections.emptyList();
        } finally {
            disconnect();
        }

        return wildPokemonsList;
    } 
}
