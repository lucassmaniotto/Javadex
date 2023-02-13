package DAO;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.WildPokemon;
import useful.SQLiteConnection;

/**
 * Classe responsável por realizar as operações de CRUD no banco de dados com o Objeto Pokemon
 */
public class DAOPokemon extends SQLiteConnection {
    
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
}