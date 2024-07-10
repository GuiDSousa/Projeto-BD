package model;

import java.sql.Date;
import dao.*;

/**
 * Classe utilizada para representar um jogo cadastrado no sistema e suas
 * respectivas informacoes.
 */
public class Jogo {
    // Atributos
    private String titulo;
    private String dataDeLancamento;
    private String produtora;
    private String sinopse;
    private byte[] imagemDeCapa;
    private double notaDaCritica;
    private String comentarioDaCritica;
    private Date dataDePublicacao;
    private double notaMediaDasAvaliacoes;

    // Construtor
    public Jogo(String titulo, String dataDeLancamento, String produtora, String sinopse, byte[] imagemDeCapa,
            double notaDaCritica, String comentarioDaCritica, Date dataDePublicacao, double notaMediaDasAvaliacoes) {
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.produtora = produtora;
        this.sinopse = sinopse;
        this.imagemDeCapa = imagemDeCapa;
        this.notaDaCritica = notaDaCritica;
        this.comentarioDaCritica = comentarioDaCritica;
        this.dataDePublicacao = dataDePublicacao;
        this.notaMediaDasAvaliacoes = notaMediaDasAvaliacoes;
    }// fim do construtor

    // Metodos

    /**
     * Tenta inserir um novo jogo no BD e retorna um booleano indicando se a
     * operacao foi bem sucedida ou nao.
     */
    public static boolean cadastrarNovoJogo(Jogo novoJogo) {
        boolean cadastrou = new JogoDAO().insert(novoJogo);
        return cadastrou;
    }// fim do metodo cadastrarNovoJogo

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setImagemDeCapa(byte[] imagemDeCapa) {
        this.imagemDeCapa = imagemDeCapa;
    }

    public void setNotaDaCritica(int notaDaCritica) {
        this.notaDaCritica = notaDaCritica;
    }

    public void setComentarioDaCritica(String comentarioDaCritica) {
        this.comentarioDaCritica = comentarioDaCritica;
    }

    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public void setNotaMediaDasAvaliacoes(double notaMediaDasAvaliacoes) {
        this.notaMediaDasAvaliacoes = notaMediaDasAvaliacoes;
    }

    // Getters
    public String getNotaCriticaString(){
        String notaDaCritica = String.valueOf((int) this.notaDaCritica);
        return notaDaCritica;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public String getProdutora() {
        return produtora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public byte[] getImagemDeCapa() {
        return imagemDeCapa;
    }

    public double getNotaDaCritica() {
        return notaDaCritica;
    }

    public String getComentarioDaCritica() {
        return comentarioDaCritica;
    }

    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public double getNotaMediaDasAvaliacoes() {
        return notaMediaDasAvaliacoes;
    }

}// fim da classe Jogo