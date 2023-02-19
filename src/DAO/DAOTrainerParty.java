package DAO;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.SQLiteConnection;
import model.TrainedPokemon;

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
}
