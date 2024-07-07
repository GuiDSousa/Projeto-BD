package model;

import java.util.ArrayList;

/** Classe utilizada para representar uma categorização de um jogo. */
public class Genero {
    // Atributos
    private int id;
    private String nome;
    private ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    // Construtor
    public Genero(String nome) {
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

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

}// fim da classe Genero