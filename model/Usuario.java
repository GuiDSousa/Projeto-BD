package model;

/** Classe generica utilizada para representar um usuario do sistema. */
public class Usuario {
    // Atributos
    private int id;
    private String nome;
    private String email;
    private byte[] imagemDePerfil;
    private String senha;

    // Construtor
    public Usuario(int id, String nome, String email, byte[] imagemDePerfil, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.imagemDePerfil = imagemDePerfil;
        this.senha = senha;
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

    public void setImagemDePerfil(byte[] imagemDePerfil) {
        this.imagemDePerfil = imagemDePerfil;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public byte[] getImagemDePerfil() {
        return imagemDePerfil;
    }
        
    public String getSenha() {
        return senha;
    }


}// fim da classe Usuario