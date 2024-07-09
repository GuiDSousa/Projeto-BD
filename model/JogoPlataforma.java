package model;

import dao.JogoPlataformaDAO;

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
    /**
     * Cria uma relacao entre um jogo e uma plataforma e tenta inserir essa relação
     * no BD. Retorna um booleano indicando o sucesso ou nao da operacao.
     */
    public static boolean criarRelacaoJogoPlataforma(String tituloDoJogo, int idDaPlataforma) {
        boolean relacionou = false;

        // cria uma nova relacao entre o jogo e a plataforma: o id eh definido pelo BD
        JogoPlataforma novaRelacaoJogoPlataforma = new JogoPlataforma(0, idDaPlataforma, tituloDoJogo);

        // tenta inserir a nova relacao no BD
        relacionou = new JogoPlataformaDAO().insert(novaRelacaoJogoPlataforma);

        return relacionou;// retorna o resultado da operacao
    }// fim do metodo relacionar criarRelacaoJogoPlataforma

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