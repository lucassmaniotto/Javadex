package DAO;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.SQLiteConnection;
import model.TrainedPokemon;
import model.WildPokemon;

/**
 * Classe responsável por realizar as operações de CRUD no banco de dados para a tabela T_POKEMON.
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class DAOPokemon extends SQLiteConnection {
    
    /**
     * Salva um pokemon selvagem no banco de dados
     * @param pokemon WildPokemon - Pokemon selvagem a ser salvo
     * @return boolean - true se salvou, false se não salvou
     */
    public boolean saveWildPokemon(WildPokemon pokemon){
        connect();
        
        String sql = "INSERT INTO T_POKEMON ("
                + "PW_NAME, "
                + "PW_TYPE1, "
                + "PW_TYPE2, "
                + "PW_SHINY, "
                + "PW_HP, "
                + "PW_ATQ, "
                + "PW_DEF, "
                + "PW_SPEED, "
                + "PW_SP_ATQ, "
                + "PW_SP_DEF, "
                + "PW_TOTAL, "
                + "PW_HEIGHT, "
                + "PW_WEIGHT, "
                + "PW_ISWILD, "
                + "FK_TRAINER_ID ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?, NULL)";
                
        PreparedStatement preparedStatement = createPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        try {    
            preparedStatement.setString(1, pokemon.getName());
            preparedStatement.setString(2, pokemon.getFirstType());
            preparedStatement.setString(3, pokemon.getSecondType());
            preparedStatement.setBoolean(4, pokemon.getShiny());
            preparedStatement.setInt(5, pokemon.getHp());
            preparedStatement.setInt(6, pokemon.getAttack());
            preparedStatement.setInt(7, pokemon.getDefense());
            preparedStatement.setInt(8, pokemon.getSpeed());
            preparedStatement.setInt(9, pokemon.getSpAttack());
            preparedStatement.setInt(10, pokemon.getSpDefense());
            preparedStatement.setInt(11, pokemon.getTotal());
            preparedStatement.setFloat(12, pokemon.getHeight());
            preparedStatement.setFloat(13, pokemon.getWeight());
            preparedStatement.setBoolean(14, pokemon.getIsWild());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
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

        String sql = "SELECT MAX(PK_PW_ID) FROM T_POKEMON";

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
     * Retorna uma lista com todos os pokemons selvagens do banco de dados
     * @return List - Lista de pokemons do tipo WildPokemon
     */
    public List<WildPokemon> getWildPokemons() {
        List<WildPokemon> wildPokemonsList = new ArrayList<>();
        
        connect();
        String sql = "SELECT * FROM T_POKEMON WHERE PW_ISWILD = 1";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                WildPokemon wildPokemon = new WildPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
                wildPokemon.setId(resultSet.getInt(1));
                wildPokemon.setName(resultSet.getString(2));
                wildPokemon.setFirstType(resultSet.getString(3));
                wildPokemon.setSecondType(resultSet.getString(4));
                wildPokemon.setShiny(resultSet.getBoolean(5));
                wildPokemon.setHp(resultSet.getInt(6));
                wildPokemon.setAttack(resultSet.getInt(7));
                wildPokemon.setDefense(resultSet.getInt(8));
                wildPokemon.setSpeed(resultSet.getInt(9));
                wildPokemon.setSpAttack(resultSet.getInt(10));
                wildPokemon.setSpDefense(resultSet.getInt(11));
                wildPokemon.setTotal(resultSet.getInt(12));
                wildPokemon.setHeight(resultSet.getFloat(13));
                wildPokemon.setWeight(resultSet.getFloat(14));
                wildPokemon.setIsWild(resultSet.getBoolean(15));
                wildPokemonsList.add(wildPokemon);
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
     * Retorna um pokemon selvagem do banco de dados a partir do ID
     * @param id int - ID do pokemon a ser retornado
     * @return WildPokemon - Pokemon selvagem
     */
    public WildPokemon getWildPokemonById(int id) {
        WildPokemon wildPokemon = new WildPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
        
        connect();
        String sql = "SELECT * FROM T_POKEMON WHERE PK_PW_ID = ?";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                wildPokemon.setId(resultSet.getInt(1));
                wildPokemon.setName(resultSet.getString(2));
                wildPokemon.setFirstType(resultSet.getString(3));
                wildPokemon.setSecondType(resultSet.getString(4));
                wildPokemon.setShiny(resultSet.getBoolean(5));
                wildPokemon.setHp(resultSet.getInt(6));
                wildPokemon.setAttack(resultSet.getInt(7));
                wildPokemon.setDefense(resultSet.getInt(8));
                wildPokemon.setSpeed(resultSet.getInt(9));
                wildPokemon.setSpAttack(resultSet.getInt(10));
                wildPokemon.setSpDefense(resultSet.getInt(11));
                wildPokemon.setTotal(resultSet.getInt(12));
                wildPokemon.setHeight(resultSet.getFloat(13));
                wildPokemon.setWeight(resultSet.getFloat(14));
                wildPokemon.setIsWild(resultSet.getBoolean(15));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            disconnect();
        }

        return wildPokemon;
    }

    /**
     * Retorna uma lista com todos os pokemons treinados do banco de dados
     * @param int - ID do treinador
     * @return List - Lista de pokemons do tipo TrainedPokemon
     */
    public List<TrainedPokemon> getTrainedPokemons(int trainerID) {
        List<TrainedPokemon> trainedPokemonsList = new ArrayList<>();
        
        connect();
        String sql = "SELECT * FROM T_POKEMON WHERE FK_TRAINER_ID = ?";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, trainerID);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                TrainedPokemon trainedPokemon = new TrainedPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
                trainedPokemon.setId(resultSet.getInt(1));
                trainedPokemon.setName(resultSet.getString(2));
                trainedPokemon.setFirstType(resultSet.getString(3));
                trainedPokemon.setSecondType(resultSet.getString(4));
                trainedPokemon.setShiny(resultSet.getBoolean(5));
                trainedPokemon.setHp(resultSet.getInt(6));
                trainedPokemon.setAttack(resultSet.getInt(7));
                trainedPokemon.setDefense(resultSet.getInt(8));
                trainedPokemon.setSpeed(resultSet.getInt(9));
                trainedPokemon.setSpAttack(resultSet.getInt(10));
                trainedPokemon.setSpDefense(resultSet.getInt(11));
                trainedPokemon.setTotal(resultSet.getInt(12));
                trainedPokemon.setHeight(resultSet.getFloat(13));
                trainedPokemon.setWeight(resultSet.getFloat(14));
                trainedPokemon.setIsWild(resultSet.getBoolean(15));
                trainedPokemonsList.add(trainedPokemon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return Collections.emptyList();
        } finally {
            disconnect();
        }

        return trainedPokemonsList;
    }

    /**
     * Vincula um pokemon selvagem a um treinador
     * através do ID do pokemon e do ID do treinador
     * com um UPDATE no banco de dados
     * @param int - ID do pokemon
     * @param int - ID do treinador
     */
    public boolean setWildPokemonToTrainedPokemon(int pokemonID, int trainerID) {
        connect();
        String sql = "UPDATE T_POKEMON SET FK_TRAINER_ID = ? , PW_ISWILD = 0 WHERE PK_PW_ID = ?";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, trainerID);
            preparedStatement.setInt(2, pokemonID);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            disconnect();
        }

        return true;
    }

    /**
     * O pokemon vinculado a um treinador
     * é desvinculado e vira um pokemon selvagem
     * @param int - ID do pokemon
     */
     public boolean setTrainedPokemonToWildPokemon(int pokemonID){
        connect();
        String sql = "UPDATE T_POKEMON SET FK_TRAINER_ID = NULL , PW_ISWILD = 1 WHERE PK_PW_ID = ?";

        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, pokemonID);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            disconnect();
        }

        return true;
     }

     /**
      * Retorna um pokemon treinado pelo ID do pokemon e do treinador
      * @param idPokemon int - ID do pokemon
      * @param idTrainer int - ID do treinador
      * @return TrainedPokemon - Pokemon treinado
      */
     public TrainedPokemon getTrainedPokemonById(int idPokemon, int idTrainer) {
        TrainedPokemon trainedPokemon = new TrainedPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
        
        connect();
        String sql = "SELECT * FROM T_POKEMON WHERE PK_PW_ID = ? AND FK_TRAINER_ID = ?";
        
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, idPokemon);
            preparedStatement.setInt(2, idTrainer);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                trainedPokemon.setId(resultSet.getInt(1));
                trainedPokemon.setName(resultSet.getString(2));
                trainedPokemon.setFirstType(resultSet.getString(3));
                trainedPokemon.setSecondType(resultSet.getString(4));
                trainedPokemon.setShiny(resultSet.getBoolean(5));
                trainedPokemon.setHp(resultSet.getInt(6));
                trainedPokemon.setAttack(resultSet.getInt(7));
                trainedPokemon.setDefense(resultSet.getInt(8));
                trainedPokemon.setSpeed(resultSet.getInt(9));
                trainedPokemon.setSpAttack(resultSet.getInt(10));
                trainedPokemon.setSpDefense(resultSet.getInt(11));
                trainedPokemon.setTotal(resultSet.getInt(12));
                trainedPokemon.setHeight(resultSet.getFloat(13));
                trainedPokemon.setWeight(resultSet.getFloat(14));
                trainedPokemon.setIsWild(resultSet.getBoolean(15));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            disconnect();
        }

        return trainedPokemon;
    }
}