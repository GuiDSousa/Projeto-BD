package model;

/**
 * Classe utilizada para representar uma avaliacao feita por um usuario do
 * sistema.
 */
public class Avaliacao {
    // Atributos
    private int id;
    private int idUsuario;
    private String comentario;
    private String tituloDoJogo;
    private double notaDoUsuario;

    // Construtor
    public Avaliacao(int id, int idUsuario, String comentario, String tituloDoJogo, double notaDoUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.comentario = comentario;
        this.tituloDoJogo = tituloDoJogo;
        this.notaDoUsuario = notaDoUsuario;
    }// fim do construtor

    // Metodos

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setTituloDoJogo(String tituloDoJogo) {
        this.tituloDoJogo = tituloDoJogo;
    }

    public void setNotaDoUsuario(double notaDoUsuario) {
        this.notaDoUsuario = notaDoUsuario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public String getTituloDoJogo() {
        return tituloDoJogo;
    }

    public double getNotaDoUsuario() {
        return notaDoUsuario;
    }

}// fim da classe Avaliacao