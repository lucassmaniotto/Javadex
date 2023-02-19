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
 * Classe responsável por fazer as operações de CRUD no banco de dados para a tabela T_TRAINER.
 * @author Lucas Smaniotto & Valtemir Junior
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
     * Retorna um treinador do banco de dados através do seu ID
     * @param id int - ID do treinador a ser retornado
     * @return Trainer - Treinador do tipo Trainer
     */
    public Trainer getTrainer(int id) {
        connect();

        String sql = "SELECT * FROM T_TRAINER WHERE PK_TRAINER_ID = ?";

        PreparedStatement preparedStatement = createPreparedStatement(sql);
        Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
        try {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            trainer.setId(resultSet.getInt("PK_TRAINER_ID"));
            trainer.setName(resultSet.getString("TRAINER_NAME"));
            trainer.setAge(resultSet.getInt("TRAINER_AGE"));
            trainer.setBadges(resultSet.getInt("TRAINER_BADGES"));
            trainer.setRegion(resultSet.getString("TRAINER_REGION"));
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            disconnect();
        }

        return trainer;
    }

    /**
     * Retorna o último ID inserido no banco de dados
     * @return int - ID a ser inserido
     */
    public int getLastID() {
        connect();

        String sql = "SELECT PK_TRAINER_ID FROM T_TRAINER ORDER BY PK_TRAINER_ID DESC LIMIT 1";

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
                Trainer trainer = new Trainer("", 0, 0, Regions.UNKNOWN.toString());
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

    /**
     * Remove um treinador do banco de dados através do seu ID
     * @param id int - ID do treinador a ser removido
     */
    public void removeTrainer(int id) {
        connect();

        String sql = "DELETE FROM T_TRAINER WHERE PK_TRAINER_ID = ?";

        PreparedStatement preparedStatement = createPreparedStatement(sql);

        try {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
    }

    /**
     * Remove o vinculo de um treinador com seus pokemons
     * quando é excluido pelo seu ID
     * @param id int - ID do treinador a ser removido
     */
    public void removeTrainerPokemons(int id) {
        connect();

        String sql = "UPDATE T_POKEMON SET FK_TRAINER_ID = NULL, PW_ISWILD = 1 WHERE FK_TRAINER_ID = ?";

        PreparedStatement preparedStatement = createPreparedStatement(sql);

        try {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
    }

    /**
     * Atualiza um treinador no banco de dados
     * @param int idTrainer - Treinador a ser atualizado
     * @param String region - Região do treinador
     * @param int age - Idade do treinador
     * @param int badges - Quantidade de badges do treinador
     */
    public void updateTrainer(int idTrainer, String region, int age, int badges) {
        connect();

        String sql = "UPDATE T_TRAINER SET "
                    + "TRAINER_REGION = ?, "
                    + "TRAINER_AGE = ?, "
                    + "TRAINER_BADGES = ? "
                    + "WHERE PK_TRAINER_ID = ?";

        PreparedStatement preparedStatement = createPreparedStatement(sql);

        try {
            preparedStatement.setString(1, region);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, badges);
            preparedStatement.setInt(4, idTrainer);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
    }
}
