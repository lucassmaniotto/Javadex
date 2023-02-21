package DAO;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.SQLiteConnection;
import model.TrainedPokemon;

/**
 * Classe responsável por realizar as operações de CRUD no banco de dados para a tabela T_TRAINER_PARTY.
 * @author Lucas Smaniotto & Valtemir Junior
 */
public class DAOTrainerParty extends SQLiteConnection {
    
    /**
     * Salva a lista de Pokémons do Time do treinador no banco de dados, recebendo a lista de Pokémons e o ID do treinador.
     * @param idTrainer ID do treinador.
     * @param pokemonList Lista de Pokémons do treinador.
     */
    public boolean saveTrainerParty(int idTrainer, List<TrainedPokemon> pokemonList) {
        connect();

        String sql = "INSERT INTO T_TRAINER_PARTY ("
                + "FK_POKEMON_ID, "
                + "POKEMON_NAME, "
                + "POKEMON_TYPE1, "
                + "POKEMON_TYPE2, "
                + "POKEMON_TOTAL, "
                + "FK_TRAINER_ID ) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = createPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);

        try {
            for (TrainedPokemon pokemon : pokemonList) {
                preparedStatement.setInt(1, pokemon.getId());
                preparedStatement.setString(2, pokemon.getName());
                preparedStatement.setString(3, pokemon.getFirstType());
                preparedStatement.setString(4, pokemon.getSecondType());
                preparedStatement.setInt(5, pokemon.getTotal());
                preparedStatement.setInt(6, idTrainer);

                preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            disconnect();
        }
        return true;
    }

    /**
     * Retorna uma lista de Pokémons do Time do treinador, recebendo o ID do treinador.
     * @param idTrainer ID do treinador.
     * @return Lista de Pokémons do Time do treinador.
     */
    public List<TrainedPokemon> getTrainerParty(int idTrainer) {
        connect();
        List<TrainedPokemon> pokemonList = new ArrayList<>();
        String sql = "SELECT * FROM T_TRAINER_PARTY WHERE FK_TRAINER_ID = ?";

        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, idTrainer);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                TrainedPokemon pokemon = new TrainedPokemon("", "", "", 0, 0, 0, 0, 0, 0, 0, 0);
                pokemon.setId(resultSet.getInt("FK_POKEMON_ID"));
                pokemon.setName(resultSet.getString("POKEMON_NAME"));
                pokemon.setFirstType(resultSet.getString("POKEMON_TYPE1"));
                pokemon.setSecondType(resultSet.getString("POKEMON_TYPE2"));
                pokemon.setTotal(resultSet.getInt("POKEMON_TOTAL"));
                pokemonList.add(pokemon);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
        return pokemonList;
    }

    /**
     * Remove o Pokémon do Time do treinador, recebendo o ID do treinador e o ID do Pokémon.
     * @param idTrainer ID do treinador.
     * @param idPokemon ID do Pokémon.
     */
    public boolean removePokemonFromTrainerParty(int idTrainer, int idPokemon) {
        connect();
        String sql = "DELETE FROM T_TRAINER_PARTY WHERE FK_TRAINER_ID = ? AND FK_POKEMON_ID = ?";

        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, idTrainer);
            preparedStatement.setInt(2, idPokemon);
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
     * Verifica se o Pokémon já existe no Time do treinador.
     * @param idPokemon int ID do Pokémon.
     * @param idTrainer int ID do treinador.
     * @return boolean Retorna true se o Pokémon já existe no Time do treinador.
     */
    public boolean checkIfPokemonAlreadyExists(int idPokemon, int idTrainer){
        connect();
        String sql = "SELECT * FROM T_TRAINER_PARTY WHERE FK_TRAINER_ID = ? AND FK_POKEMON_ID = ?";

        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, idTrainer);
            preparedStatement.setInt(2, idPokemon);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
        return false;
    }

    /**
     * Remove todos os Pokémons do Time do treinador, recebendo o ID do treinador
     * @param idTrainer ID do treinador.
     */
    public void removeAllTrainerParty(int idTrainer) {
        connect();
        String sql = "DELETE FROM T_TRAINER_PARTY WHERE FK_TRAINER_ID = ?";

        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql);
            preparedStatement.setInt(1, idTrainer);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPokemon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }
    }
}
