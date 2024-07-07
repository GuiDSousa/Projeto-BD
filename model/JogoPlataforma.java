package model;

public class JogoPlataforma {
    // Atributos
    private int id;
    private int idPlataforma;
    private String tituloDoJogo;

    // Construtor
    public JogoPlataforma(int id, int idPlataforma, String tituloDoJogo) {
        this.id = id;
        this.idPlataforma = idPlataforma;
        this.tituloDoJogo = tituloDoJogo;
    }// fim do construtor

    // Metodos

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public void setTituloDoJogo(String tituloDoJogo) {
        this.tituloDoJogo = tituloDoJogo;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public String getTituloDoJogo() {
        return tituloDoJogo;
    }

}// fim da classe JogoPlataforma