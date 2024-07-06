package model;

/** Classe generica utilizada para representar um usuario do sistema. */
public class Usuario {
    // Atributos
    private int id;
    private String nome;
    private String email;
    private byte[] iconeDePerfil;

    // Construtor
    public Usuario(int id, String nome, String email, byte[] iconeDePerfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.iconeDePerfil = iconeDePerfil;
    }// fim do construtor

    // Metodos

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIconeDePerfil(byte[] iconeDePerfil) {
        this.iconeDePerfil = iconeDePerfil;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getIconeDePerfil() {
        return iconeDePerfil;
    }

}// fim da classe Usuario