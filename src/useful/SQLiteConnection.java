package useful;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe que representa uma conexão com o banco de dados SQLite.
 */
public class SQLiteConnection {
    private Connection connection;

    /**
     * Método de conexão com o banco de dados.
     * @return true se a conexão for bem sucedida, false caso contrário.
     */
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

    /**
     * Método de desconexão com o banco de dados.
     * @return true se a desconexão for bem sucedida, false caso contrário.
     */
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

    /**
     * Método que cria um Statement para execução de comandos SQL.
     * @return Statement para execução de comandos SQL.
     */
    public Statement createStatement() {
        try {
            return this.connection.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Método que cria um PreparedStatement para execução de comandos SQL.
     * @param sql Comando SQL a ser executado.
     * @param RETURN_GENERATED_KEYS Constante que indica que o PreparedStatement deve retornar as chaves primárias geradas.
     * @return PreparedStatement para execução de comandos SQL.
     */
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

    /**
     * Método que cria um PreparedStatement para execução de comandos SQL sem chave primária.
     * @param sql Comando SQL a ser executado.
     * @return PreparedStatement para execução de comandos SQL.
     */
    public PreparedStatement createPreparedStatement(String sql) {
        try {
            System.out.println("Executando: " + sql);
            return this.connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que retorna a conexão com o banco de dados.
     * @return Conexão com o banco de dados.
     */
    public Connection getConnection() {
        return this.connection;
    }
}
