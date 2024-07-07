package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Jogo;

public class JogoDAO {
    private Connection connection;

    private JogoDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }

    public boolean insert(Jogo jogo) {
        String SQL = "INSERT INTO Jogo(titulo_jogo, data_lancamento, imag_jogo, sinopse, produtora, nota_critica, data_publicacao, nota_media_usuario, comentatio_critico) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, jogo.getTitulo());
            pstmt.setDate(2, jogo.getDataDeLancamento());
            pstmt.setBytes(3, jogo.getImagemDeCapa());
            pstmt.setString(4, jogo.getSinopse());
            pstmt.setString(5, jogo.getProdutora());
            pstmt.setDouble(6, jogo.getNotaDaCritica());
            pstmt.setDate(7, jogo.getDataDePublicacao());
            pstmt.setDouble(8, jogo.getNotaMediaDasAvaliacoes());
            pstmt.setString(9, jogo.getComentarioDaCritica());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public Jogo selectByTitulo(String titulo) {
        String SQL = "SELECT * FROM Jogo WHERE titulo_jogo = ?";
        Jogo jogo = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, titulo);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                jogo = new Jogo(
                        rs.getString("titulo_jogo"),
                        rs.getDate("data_lancamento"),
                        rs.getString("produtora"),
                        rs.getString("sinopse"),
                        rs.getBytes("imag_jogo"),
                        rs.getDouble("nota_critica"),
                        rs.getString("comentatio_critico"),
                        rs.getDate("data_publicacao"),
                        rs.getDouble("nota_media_usuario"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogo;
    }

    public List<Jogo> selectAll() {
        String SQL = "SELECT * FROM Jogo";
        List<Jogo> jogos = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Jogo jogo = new Jogo(
                        rs.getString("titulo_jogo"),
                        rs.getDate("data_lancamento"),
                        rs.getString("produtora"),
                        rs.getString("sinopse"),
                        rs.getBytes("imag_jogo"),
                        rs.getDouble("nota_critica"),
                        rs.getString("comentatio_critico"),
                        rs.getDate("data_publicacao"),
                        rs.getDouble("nota_media_usuario"));
                jogos.add(jogo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return jogos;
    }

    public boolean update(Jogo jogo) {
        String SQL = "UPDATE Jogo SET data_lancamento = ?, imag_jogo = ?, sinopse = ?, produtora = ?, nota_critica = ?, data_publicacao = ?, nota_media_usuario = ?, comentatio_critico = ? WHERE titulo_jogo = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setDate(1, jogo.getDataDeLancamento());
            pstmt.setBytes(2, jogo.getImagemDeCapa());
            pstmt.setString(3, jogo.getSinopse());
            pstmt.setString(4, jogo.getProdutora());
            pstmt.setDouble(5, jogo.getNotaDaCritica());
            pstmt.setDate(6, jogo.getDataDePublicacao());
            pstmt.setDouble(7, jogo.getNotaMediaDasAvaliacoes());
            pstmt.setString(8, jogo.getComentarioDaCritica());
            pstmt.setString(9, jogo.getTitulo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(String titulo) {
        String SQL = "DELETE FROM Jogo WHERE titulo_jogo = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, titulo);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
