package dao;

import model.JogoGenero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogoGeneroDAO {
    private Connection connection;

    public JogoGeneroDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }

    public boolean insert(JogoGenero jogoGenero) {
        String SQL = "INSERT INTO crypta_nostalgica.jogo_genero(titulo_jogo, id_genero) VALUES(?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, jogoGenero.getTituloJogo());
            pstmt.setInt(2, jogoGenero.getIdGenero());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public JogoGenero selectById(int id) {
        String SQL = "SELECT * FROM crypta_nostalgica.jogo_genero WHERE id = ?";
        JogoGenero jogoGenero = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                jogoGenero = new JogoGenero(
                        rs.getInt("id"),
                        rs.getString("titulo_jogo"),
                        rs.getInt("id_genero"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogoGenero;
    }

    public List<JogoGenero> selectAll() {
        String SQL = "SELECT * FROM crypta_nostalgica.jogo_genero";
        List<JogoGenero> jogoGeneros = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                JogoGenero jogoGenero = new JogoGenero(
                        rs.getInt("id"),
                        rs.getString("titulo_jogo"),
                        rs.getInt("id_genero"));
                jogoGeneros.add(jogoGenero);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogoGeneros;
    }

    public boolean update(JogoGenero jogoGenero) {
        String SQL = "UPDATE crypta_nostalgica.jogo_genero SET titulo_jogo = ?, id_genero = ? WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, jogoGenero.getTituloJogo());
            pstmt.setInt(2, jogoGenero.getIdGenero());
            pstmt.setInt(3, jogoGenero.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM crypta_nostalgica.jogo_genero WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}// fim da classe JogoGeneroDAO