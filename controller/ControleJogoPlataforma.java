package controller;

import model.JogoGenero;
import model.JogoPlataforma;

public class ControleJogoPlataforma {

    /**
     * Recebe um jogo e um array com os ids das plataformas as quais o jogo se
     * relaciona. Executa um loop criando uma relacao entre o jogo e cada plataforma
     * do
     * array, apos isso tenta inserir essas relações no BD.
     * 
     * OBS: ESSE METODO ASSUME QUE O JOGO JA ESTA INSERIDO NO BD E QUE O ARRAY
     * POSSUI OS IDS CORRETOS DAS PLATAFORMAS INSERIDAS NO BD!
     */
    public void criarRelacoesJogoPlataforma(String tituloDoJogo, int[] listaDeIdsPlataformas) {
        // validacao dos parametros
        if ((tituloDoJogo != null && tituloDoJogo.length() > 0
                && (listaDeIdsPlataformas != null && listaDeIdsPlataformas.length > 0))) {

            // executa um loop criando uma relacao entre o jogo e cada plataforma do array
            for (int i = 0; i < listaDeIdsPlataformas.length; i++) {
                // cria tenta inserir a relacao criada no bd
                JogoPlataforma.criarRelacaoJogoPlataforma(tituloDoJogo, listaDeIdsPlataformas[i]);
            } // fim do for
        } // fim do if
    }// fim do metodo criarRelacoesJogoPlataforma

}// fim da classe ControleJogoPlataforma