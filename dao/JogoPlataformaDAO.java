package dao;

import model.JogoPlataforma;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogoPlataformaDAO {
    private Connection connection;
  
    private JogoPlataformaDAO() {
      ConnectionFactory connectionFactory = new ConnectionFactory();
      this.connection = connectionFactory.getConnection();
    }
  
    public boolean insert(JogoPlataforma jogoPlataforma) {
        String SQL = "INSERT INTO Jogo_plataforma(id_plataforma, titulo_jogo) VALUES(?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, jogoPlataforma.getIdPlataforma());
            pstmt.setString(2, jogoPlataforma.getTituloDoJogo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public JogoPlataforma selectById(int id) {
        String SQL = "SELECT * FROM Jogo_plataforma WHERE id = ?";
        JogoPlataforma jogoPlataforma = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                jogoPlataforma = new JogoPlataforma(
                    rs.getInt("id"),
                    rs.getInt("id_plataforma"),
                    rs.getString("titulo_jogo")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogoPlataforma;
    }

    public List<JogoPlataforma> selectAll() {
        String SQL = "SELECT * FROM Jogo_plataforma";
        List<JogoPlataforma> jogoPlataformas = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                JogoPlataforma jogoPlataforma = new JogoPlataforma(
                    rs.getInt("id"),
                    rs.getInt("id_plataforma"),
                    rs.getString("titulo_jogo")
                );
                jogoPlataformas.add(jogoPlataforma);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogoPlataformas;
    }

    public boolean update(JogoPlataforma jogoPlataforma) {
        String SQL = "UPDATE Jogo_plataforma SET id_plataforma = ?, titulo_jogo = ? WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, jogoPlataforma.getIdPlataforma());
            pstmt.setString(2, jogoPlataforma.getTituloDoJogo());
            pstmt.setInt(3, jogoPlataforma.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM Jogo_plataforma WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
