package dao;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasAvancadasDAO {
    private Connection connection;
  
    public ConsultasAvancadasDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }
  
    // Consulta 1: Jogo com a maior nota de um determinado genero em uma determinada plataforma
    public Jogo buscarJogoComMaiorNotaEmPlataformaEGenero(String genero, String plataforma) {
        String SQL = "SELECT j.* FROM crypta_nostalgica.Jogo j " +
                     "JOIN crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo " +
                     "JOIN crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero " +
                     "JOIN crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo " +
                     "JOIN crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma " +
                     "WHERE g.nome_genero = ? AND p.nome_plataforma = ? " +
                     "ORDER BY j.nota_critica DESC LIMIT 1";

        Jogo jogo = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, genero);
            pstmt.setString(2, plataforma);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                jogo = new Jogo(
                    rs.getString("titulo_jogo"),
                    rs.getString("data_lancamento"),
                    rs.getString("produtora"),
                    rs.getString("sinopse"),                    
                    rs.getBytes("imag_jogo"),                    
                    rs.getDouble("nota_critica"),
                    rs.getString("comentario_critico"),
                    rs.getDate("data_publicacao"),
                    rs.getDouble("nota_media_usuario")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return jogo;
    }

    // Consulta 2: Jogos de uma produtora especifica para uma plataforma especifica e de um genero especifico
    public List<Jogo> buscarJogoEmPlataformaEGenero(String produtora, String plataforma, String genero) {
        String SQL = "SELECT j.* FROM crypta_nostalgica.Jogo j " +
                     "JOIN crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo " +
                     "JOIN crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero " +
                     "JOIN crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo " +
                     "JOIN crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma " +
                     "WHERE j.produtora = ? AND p.nome_plataforma = ? AND g.nome_genero = ?";

        List<Jogo> jogos = new ArrayList<>();

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, produtora);
            pstmt.setString(2, plataforma);
            pstmt.setString(3, genero);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Jogo jogo = new Jogo(
                        rs.getString("titulo_jogo"),
                        rs.getString("data_lancamento"),
                        rs.getString("produtora"),
                        rs.getString("sinopse"),                    
                        rs.getBytes("imag_jogo"),                    
                        rs.getDouble("nota_critica"),
                        rs.getString("comentario_critico"),
                        rs.getDate("data_publicacao"),
                        rs.getDouble("nota_media_usuario")
                );
                jogos.add(jogo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return jogos;
    }

    // Consulta 3: Numero de jogos por genero em uma determinada plataforma
    public List<GeneroPlataformaCount> numeroDeJogosPorGeneroEPlataforma(String plataforma) {
        String SQL = "SELECT g.nome_genero, COUNT(*) as count FROM crypta_nostalgica.Jogo j " +
                     "JOIN crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo " +
                     "JOIN crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero " +
                     "JOIN crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo " +
                     "JOIN crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma " +
                     "WHERE p.nome_plataforma = ? " +
                     "GROUP BY g.nome_genero";

        List<GeneroPlataformaCount> counts = new ArrayList<>();

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, plataforma);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                GeneroPlataformaCount count = new GeneroPlataformaCount(
                    rs.getString("nome_genero"),
                    rs.getInt("count")
                );
                counts.add(count);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return counts;
    }
}
