package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* Classe para padronizar a criacao de conexoes com o BD
 *
 *
 * ATENÇÃO!!! Preencher as Strings com o nome do usuario do BD, a senha do BD e a URL do BD
*/
public class ConnectionFactory {
    // Usuario do banco de dados postgres
    private static final String USERNAME = "";

    // Senha do banco de dados postgres
    private static final String PASSWORD = "";

    // Caminho do BD
    private static final String DB_URL = "";

    // Conexao do BD postgres
    public Connection getConnection() throws SQLException {
        try {
            Connection conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}