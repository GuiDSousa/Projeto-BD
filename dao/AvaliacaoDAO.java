package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Avaliacao;

public class AvaliacaoDAO {
    Connection connection;

    private AvaliacaoDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }

    public boolean insert(Avaliacao avaliacao) {
        String SQL = "INSERT INTO Avaliacao(comentario, titulo_jogo, nota_usuario, id_usuario) VALUES(?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, avaliacao.getComentario());
            pstmt.setString(2, avaliacao.getTituloDoJogo());
            pstmt.setDouble(3, avaliacao.getNotaDoUsuario());
            pstmt.setDouble(4, avaliacao.getIdUsuario());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public Avaliacao selectById(int id) {
        String SQL = "SELECT * FROM Avaliacao WHERE id_avaliacao = ?";
        Avaliacao avaliacao = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                avaliacao = new Avaliacao(
                        rs.getInt("id_avaliacao"),
                        rs.getInt("id_usuario"),
                        rs.getString("comentario"),
                        rs.getString("titulo_jogo"),
                        rs.getDouble("nota_usuario"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return avaliacao;
    }

    public List<Avaliacao> selectAll() {
        String SQL = "SELECT * FROM Avaliacao";
        List<Avaliacao> avaliacoes = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Avaliacao avaliacao = new Avaliacao(
                        rs.getInt("id_avaliacao"),
                        rs.getInt("id_usuario"),
                        rs.getString("comentario"),
                        rs.getString("titulo_jogo"),
                        rs.getDouble("nota_usuario"));
                avaliacoes.add(avaliacao);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return avaliacoes;
    }

    public boolean update(Avaliacao avaliacao) {
        String SQL = "UPDATE Avaliacao SET comentario = ?, titulo_jogo = ?, nota_usuario = ?, id_usuario = ? WHERE id_avaliacao = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, avaliacao.getComentario());
            pstmt.setString(2, avaliacao.getTituloDoJogo());
            pstmt.setDouble(3, avaliacao.getNotaDoUsuario());
            pstmt.setDouble(4, avaliacao.getIdUsuario());
            pstmt.setInt(5, avaliacao.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM Avaliacao WHERE id_avaliacao = ?";

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
