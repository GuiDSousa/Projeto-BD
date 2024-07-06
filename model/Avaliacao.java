package model;

import java.sql.Date;

/**
 * Classe utilizada para representar uma avaliacao feita por um usuario do
 * sistema.
 */
public class Avaliacao {
    // Atributos
    private Date dataDePublicacao;
    private double nota;
    private String comentario;

    // Construtor
    public Avaliacao(Date dataDePublicacao, double nota, String comentario) {
        this.dataDePublicacao = dataDePublicacao;
        this.nota = nota;
        this.comentario = comentario;
    }// fim do construtor

    // Metodos

    // Setters
    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    // Getters
    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

}// fim da classe Avaliacao