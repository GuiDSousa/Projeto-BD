package model;

import java.util.ArrayList;

/**
 * Classe utilizada para representar um usuario cadastrado no sistema, capaz de
 * avaliar os jogos cadastrados.
 */
public class UsuarioCadastrado extends Usuario {
    // Atributos
    private ArrayList<Avaliacao> avaliacoesFeitas = new ArrayList<Avaliacao>();

    // Construtor
    public UsuarioCadastrado(int id, String nome, String email, byte[] iconeDePerfil) {
        super(id, nome, email, iconeDePerfil);
        // TODO Auto-generated constructor stub
    }// fim do construtor

    // Metodos

    // Setters
    public void setAvaliacoesFeitas(ArrayList<Avaliacao> avaliacoesFeitas) {
        this.avaliacoesFeitas = avaliacoesFeitas;
    }

    // Getters
    public ArrayList<Avaliacao> getAvaliacoesFeitas() {
        return avaliacoesFeitas;
    }
}// fim da classe UsuarioCadastrado