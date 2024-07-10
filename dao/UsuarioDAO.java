package dao;

import model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        this.connection = connectionFactory.getConnection();
    }

    public boolean insert(Usuario usuario) {
        String SQL = "INSERT INTO crypta_nostalgica.Usuario_Usu_logado_Usu_admin(nome, imag_usuario, e_mail, senha) VALUES(?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.setBytes(2, usuario.getImagemDePerfil());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setString(4, usuario.getSenha());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public Usuario selectById(int id) { // pode retornar nulo
        String SQL = "SELECT * FROM crypta_nostalgica.Usuario_Usu_logado_Usu_admin WHERE id_usuario = ?";
        Usuario usuario = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("nome"), rs.getString("e_mail"),
                        rs.getBytes("imag_usuario"), rs.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return usuario;
    }


    public Usuario validateCredentials(String email, String senha) { // pode retornar nulo
        String SQL = "SELECT * FROM crypta_nostalgica.Usuario_Usu_logado_Usu_admin WHERE e_mail and senha= ?";
        Usuario usuario = null;

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("nome"), rs.getString("e_mail"),
                        rs.getBytes("imag_usuario"), rs.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return usuario;
    }

    public List<Usuario> selectAll() {
        String SQL = "SELECT * FROM crypta_nostalgica.Usuario_Usu_logado_Usu_admin";
        List<Usuario> usuarios = new ArrayList<>();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("nome"), rs.getString("e_mail"),
                        rs.getBytes("imag_usuario"), rs.getString("senha"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return usuarios;
    }

    public boolean update(Usuario usuario) {
        String SQL = "UPDATE crypta_nostalgica.Usuario_Usu_logado_Usu_admin SET nome = ?, imag_usuario = ?, e_mail = ?, senha = ? WHERE id_usuario = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.setBytes(2, usuario.getImagemDePerfil());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setString(4, usuario.getSenha());
            pstmt.setInt(5, usuario.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String SQL = "DELETE FROM crypta_nostalgica.Usuario_Usu_logado_Usu_admin WHERE id_usuario = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}// fim da classe UsuarioDAO