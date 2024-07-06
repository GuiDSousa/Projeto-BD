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
    private Jogo jogoAvaliado;
    private UsuarioCadastrado autor;

    // Construtor
    public Avaliacao(Date dataDePublicacao, double nota, String comentario, Jogo jogoAvaliado,
            UsuarioCadastrado autor) {
        this.dataDePublicacao = dataDePublicacao;
        this.nota = nota;
        this.comentario = comentario;
        this.jogoAvaliado = jogoAvaliado;
        this.autor = autor;
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

    public void setJogoAvaliado(Jogo jogoAvaliado) {
        this.jogoAvaliado = jogoAvaliado;
    }

    public void setAutor(UsuarioCadastrado autor) {
        this.autor = autor;
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

    public Jogo getJogoAvaliado() {
        return jogoAvaliado;
    }

    public UsuarioCadastrado getAutor() {
        return autor;
    }

}// fim da classe Avaliacao