package model;

/**
 * Classe utilizada para representar uma plataforma para a qual um jogo foi
 * publicado.
 */
public class Plataforma {
    // Atributos
    private int id;
    private String nome;
    private String jogabilidade;

    // Construtor
    public Plataforma(int id, String nome, String jogabilidade) {
        this.id = id;
        this.nome = nome;
        this.jogabilidade = jogabilidade;
    }// fim do construtor

    // Metodos

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogabilidade(String jogabilidade) {
        this.jogabilidade = jogabilidade;
    }

    // Getteres

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getJogabilidade() {
        return jogabilidade;
    }

}// fim da classe Plataforma