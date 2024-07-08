package dao;

import java.sql.*;

/**
 * Classe utilizada para padronizar a criacao de conexoes com o BD.
 */
public class ConnectionFactory {
    /*
     * LEMBRETE: Os valores
     * para o Usuario, Senha URL foram preenchidos com o que eh padrao para o
     * postgres, caso seja necessario faca a alteracao para que seja possivel se
     * conectar ao BD.
     */

    // Usuario do banco de dados postgres
    private static final String USERNAME = "postgres";

    // Senha do banco de dados postgres
    private static final String PASSWORD = "postgres";

    // Caminho do BD
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    /** Metodo utilizado para padronizar a criacao de conexoes do BD postgres. */
    private static Connection createConnection() {
        Connection conexao = null;

        try {
            /* Obtem o driver de conexao com o banco de dados */
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver carregado!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("O driver especificado nao foi encontrado.");
        }

        try {
            /* Tenta se conectar */
            conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Conexao realizada com sucesso!");

            /* Caso a conexao ocorra com sucesso, a conexao eh retornada */
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nao foi possivel conectar ao banco de dados.");
            return null;
        }
    }// fim do metodo createConnection

    /** Metodo utilizado para fazer uma conexao com o BD. */
    public Connection getConnection() {
        return createConnection();
    }// fim do metodo getConnection

}// fim da classe ConnectionFactory