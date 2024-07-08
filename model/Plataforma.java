package model;

/**
 * Classe utilizada para representar uma plataforma para a qual um jogo foi
 * publicado.
 */
public class Plataforma {
    // Atributos
    private int id;
    private String nome;

    // Construtor
    public Plataforma(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }// fim do construtor

    // Metodos

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getteres
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}// fim da classe Plataforma