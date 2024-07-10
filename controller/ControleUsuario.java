package controller;


import dao.UsuarioDAO;
import model.Usuario;

public class ControleUsuario {
    public Usuario validarUsuario(String email, String senha) {
    Usuario usuarioValidado = new UsuarioDAO().validateCredentials(email, senha);
    return usuarioValidado;
}

public boolean cadastrarNovoUsuario(int id, String nome, String email, byte[] imagemDePerfil, String senha) {
    // Verificação dos parâmetros
    if ((nome != null && nome.length() > 0)
            && (email != null && email.length() > 0)
            && (senha != null && senha.length() > 0)) {

        // Cria um novo objeto de usuário com os dados fornecidos
        Usuario novoUsuario = new Usuario(id, nome, email, imagemDePerfil, senha);

        // Tenta inserir o novo usuário no BD
        UsuarioDAO usuarioDAO = new UsuarioDAO(); // Supondo que UsuarioDAO tenha um método insert como mostrado

        if (usuarioDAO.insert(novoUsuario)) {
            return true; // Retorna verdadeiro se o usuário for criado corretamente
        } else {
            return false; // Retorna falso se não inserir o usuário no BD
        }
    }
    return false; // Retorna falso se os parâmetros não estiverem válidos

}
public boolean realizarLogin(String email, String senha) {
    Usuario usuario = new UsuarioDAO().validateCredentials(email, senha);
    if (usuario != null) {
        return true;
    } else {
        return false;
    }

}
}