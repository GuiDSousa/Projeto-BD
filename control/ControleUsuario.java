package control;

import model.Usuario;

public class ControleUsuario {
    /** Faz a validação dos campos antes de cadastrar um usuario*/
    public boolean cadastrarUsuario(String email, String senha, byte[] iconeDePerfil) {

        if(email != null && email.length() > 0 && senha != null && senha.length() > 0 && iconeDePerfil != null && iconeDePerfil.length > 0){
            Usuario usuario = new Usuario(senha, email, iconeDePerfil);
            usuario.cadastrarUsuario(usuario);
            return true;
        }
        return false;
    }

}// fim da classe ControleUsuario