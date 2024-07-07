package model;

import java.util.ArrayList;

/**
 * Classe utilizada para representar uma plataforma para a qual um jogo foi
 * publicado.
 */
public class Plataforma {
    // Atributos
    private int id;
    private String nome;
    private String jogabilidade;
    private ArrayList<Jogo> jogosLancados = new ArrayList<Jogo>();

    // Construtor
    public Plataforma(String nome, String jogabilidade) {
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

    public void setJogosLancados(ArrayList<Jogo> jogosLancados) {
        this.jogosLancados = jogosLancados;
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

    public ArrayList<Jogo> getJogosLancados() {
        return jogosLancados;
    }

}// fim da classe Plataforma