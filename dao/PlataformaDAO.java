package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Plataforma;

public class PlataformaDAO {
    private Connection  connection;

    private PlataformaDAO()  {
      ConnectionFactory connectionFactory = new ConnectionFactory();
      this.connection = connectionFactory.getConnection();
    }

    public boolean insert(Plataforma plataforma) {
        String SQL = "INSERT INTO Plataforma(nome_plataforma, jogabilidade) VALUES(?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, plataforma.getNome());
            pstmt.setString(2, plataforma.getJogabilidade());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public Plataforma selectById(int id) {
        String SQL = "SELECT * FROM Plataforma WHERE id_plataforma = ?";
        Plataforma plataforma = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                plataforma = new Plataforma(
                    rs.getString("nome_plataforma"),
                    rs.getString("jogabilidade")
                );
                plataforma.setId(rs.getInt("id_plataforma"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return plataforma;
    }

    public List<Plataforma> selectAll() {
        String SQL = "SELECT * FROM Plataforma";
        List<Plataforma> plataformas = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Plataforma plataforma = new Plataforma(
                    rs.getString("nome_plataforma"),
                    rs.getString("jogabilidade")
                );
                plataforma.setId(rs.getInt("id_plataforma"));
                plataformas.add(plataforma);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return plataformas;
    }

    public boolean update(Plataforma plataforma) {
        String SQL = "UPDATE Plataforma SET nome_plataforma = ?, jogabilidade = ? WHERE id_plataforma = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, plataforma.getNome());
            pstmt.setString(2, plataforma.getJogabilidade());
            pstmt.setInt(3, plataforma.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM Plataforma WHERE id_plataforma = ?";

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
