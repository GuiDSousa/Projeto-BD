package controller;

import java.sql.SQLException;
import java.time.LocalDateTime;

import dao.UsuarioDAO;
import model.Usuario;

public class ControleUsuario {
    public Usuario validarUsuario(String email, String senha) {
    Usuario usuarioValidado = new UsuarioDAO().validateCredentials(email, senha);
    return usuarioValidado;
}

public boolean cadastrarNovoUsuario(String nome, String email, String senha, byte[] imagemDePerfil) {
    // Verificação dos parâmetros
    if ((nome != null && nome.length() > 0)
            && (email != null && email.length() > 0)
            && (senha != null && senha.length() > 0)
            && (imagemDePerfil != null && imagemDePerfil.length > 0)) {

        try {
            // Instancia a data de registro como a data atual
            LocalDateTime dataRegistro = LocalDateTime.now();
            java.sql.Date dataRegistroSQL = java.sql.Date.valueOf(dataRegistro.toLocalDate());

            // Cria um novo objeto de usuário com os dados fornecidos
            Usuario novoUsuario = new Usuario(nome, email, senha, imagemDePerfil, dataRegistroSQL);

            // Tenta inserir o novo usuário no BD
            UsuarioDAO usuarioDAO = new UsuarioDAO(); // Supondo que UsuarioDAO tenha um método insert como mostrado

            if (usuarioDAO.insert(novoUsuario)) {
                return true; // Retorna verdadeiro se o usuário for criado corretamente
            } else {
                return false; // Retorna falso se não inserir o usuário no BD
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false; // Retorna falso em caso de exceção SQL
        }
    }
    return false; // Retorna falso se os parâmetros não estiverem válidos
}




}
