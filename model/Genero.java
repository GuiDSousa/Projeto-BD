package model;

/** Classe utilizada para representar uma categorização de um jogo. */
public class Genero {
    // Atributos
    private int id;
    private String nome;

    // Construtor
    public Genero(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }// fim do Construtor

    // Metodos

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}// fim da classe Genero