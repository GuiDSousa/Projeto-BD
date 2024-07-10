package model;

import dao.JogoGeneroDAO;

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
    /**
     * Cria uma relacao entre um jogo e um genero e tenta inserir essa relação no
     * BD. Retorna um booleano indicando o sucesso ou nao da operacao.
     */
    public static boolean criarRelacaoJogoGenero(String tituloDoJogo, int idDoGenero) {
        boolean relacionou = false;
        // cria uma nova relacao entre o jogo e o genero: o id da relacao eh definido
        // pelo BD
        JogoGenero novaRelacaoJogoGenero = new JogoGenero(0, tituloDoJogo, idDoGenero);

        // tenta inserir a nova relacao no BD
        relacionou = new JogoGeneroDAO().insert(novaRelacaoJogoGenero);

        return relacionou;// retorna o resultado da operacao
    }// fim do metodo criarRelacaoJogoGenero

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
