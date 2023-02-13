package useful;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnection {
    private Connection connection;

    public boolean connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:db/pokedex.db");
            System.out.println("Conectado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean disconnect() {
        try {
            if (!this.connection.isClosed()) {
                this.connection.close();
            }
            System.out.println("Desconectado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Statement createStatement() {
        try {
            return this.connection.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public PreparedStatement createPreparedStatement(String sql, int RETURN_GENERATED_KEYS) {
        try {
        System.out.println("Executando: " + sql);
            return this.connection.prepareStatement(sql, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
