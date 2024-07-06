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

    private static Connection createConnection() {
        Connection conexao = null;

        try {
            /* Obtem o driver de conexao com o banco de dados */
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver carregado!");
        } catch (ClassNotFoundException e) {
            System.out.println("O driver especificado nao foi encontrado.");
        }

        try {
            /* Tenta se conectar */
            conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Conexao realizada com sucesso!");

            /* Caso a conexao ocorra com sucesso, a conexao eh retornada */
            return conexao;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao banco de dados.");
            return null;
        }

    }

    public Connection getConnection() {
        return createConnection();
    }

}