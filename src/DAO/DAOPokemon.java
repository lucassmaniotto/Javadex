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

import model.WildPokemon;
import useful.SQLiteConnection;

/**
 * Classe responsável por realizar as operações de CRUD no banco de dados com o Objeto Pokemon
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
}