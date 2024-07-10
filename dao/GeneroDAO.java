package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Genero;

public class GeneroDAO {
    private Connection connection;

    public GeneroDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }

    public boolean insert(Genero genero) {
        String SQL = "INSERT INTO crypta_nostalgica.Genero(nome_genero) VALUES(?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, genero.getNome());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public Genero selectById(int id) {
        String SQL = "SELECT * FROM crypta_nostalgica.Genero WHERE id_genero = ?";
        Genero genero = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                genero = new Genero(rs.getInt("id_genero"), rs.getString("nome_genero"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return genero;
    }

    public List<Genero> selectAll() {
        String SQL = "SELECT * FROM crypta_nostalgica.Genero";
        List<Genero> generos = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Genero genero = new Genero(rs.getInt("id_genero"), rs.getString("nome_genero"));
                generos.add(genero);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return generos;
    }

    public boolean update(Genero genero) {
        String SQL = "UPDATE crypta_nostalgica.Genero SET nome_genero = ? WHERE id_genero = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, genero.getNome());
            pstmt.setInt(2, genero.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM crypta_nostalgica.Genero WHERE id_genero = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}// fim da classe GeneroDAO