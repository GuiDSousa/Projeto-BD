package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Classe utilizada para representar um jogo cadastrado no sistema e suas
 * respectivas informacoes.
 */
public class Jogo {
    // Atributos
    private String titulo;
    private Date dataDeLancamento;
    private String produtora;
    private String sinopse;
    private byte[] imagemDeCapa;
    private int notaDaCritica;
    private String comentarioDaCritica;
    private Date dataDePublicacao;
    private double notaMediaDasAvaliacoes;
    private ArrayList<Plataforma> plataformas = new ArrayList<Plataforma>();
    private ArrayList<Genero> generos = new ArrayList<Genero>();
    private ArrayList<Avaliacao> avaliacoesRecebidas = new ArrayList<Avaliacao>();

    // Construtor
    public Jogo(String titulo, Date dataDeLancamento, String produtora, String sinopse, byte[] imagemDeCapa,
            int notaDaCritica, String comentarioDaCritica, Date dataDePublicacao, double notaMediaDasAvaliacoes) {
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

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataDeLancamento(Date dataDeLancamento) {
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

    public void setPlataformas(ArrayList<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public void setAvaliacoesRecebidas(ArrayList<Avaliacao> avaliacoesRecebidas) {
        this.avaliacoesRecebidas = avaliacoesRecebidas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Date getDataDeLancamento() {
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

    public int getNotaDaCritica() {
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

    public ArrayList<Plataforma> getPlataformas() {
        return plataformas;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public ArrayList<Avaliacao> getAvaliacoesRecebidas() {
        return avaliacoesRecebidas;
    }

}// fim da classe Jogo