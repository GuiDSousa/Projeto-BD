package model;

public class JogoGenero {
    // Atributos
    private int id;
    private String tituloJogo;
    private int idGenero;

    // Construtor
    public JogoGenero(int id, String tituloJogo, int idGenero) {
        this.id = id;
        this.tituloJogo = tituloJogo;
        this.idGenero = idGenero;
    }// fim do construtor

    // Metodos

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTituloJogo(String tituloJogo) {
        this.tituloJogo = tituloJogo;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTituloJogo() {
        return tituloJogo;
    }

    public int getIdGenero() {
        return idGenero;
    }

}// fim da classe JogoGenero
