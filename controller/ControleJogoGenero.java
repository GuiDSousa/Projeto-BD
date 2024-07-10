package controller;

import model.JogoGenero;
import util.RecuperarId;

public class ControleJogoGenero {
    /**
     * Recebe um jogo e um array com os ids dos generos os quais o jogo se
     * relaciona. Executa um loop criando uma relacao entre o jogo e cada genero do
     * array, apos isso tenta inserir essas relações no BD.
     * 
     * OBS: ESSE METODO ASSUME QUE O JOGO JA ESTA INSERIDO NO BD E QUE O ARRAY
     * POSSUI OS IDS CORRETOS DOS GENEROS INSERIDOS NO BD!
     */
    public void criarRelacoesJogoGeneros(String tituloDoJogo, int[] listaDeIdsGeneros) {
        // vericacao dos paramentros
        if ((tituloDoJogo != null && tituloDoJogo.length() > 0)
                && (listaDeIdsGeneros != null && listaDeIdsGeneros.length > 0)) {

            // executa um loop criando uma relacao entre o jogo e cada genero do array
            for (int i = 0; i < listaDeIdsGeneros.length; i++) {
                // cria tenta inserir a relacao criada no bd
                JogoGenero.criarRelacaoJogoGenero(tituloDoJogo, listaDeIdsGeneros[i]);
                System.out.println("Criou a relacao: " + tituloDoJogo+ " -> " + RecuperarId.getGeneroString(listaDeIdsGeneros[i]));
            } // fim do for
        } // fim do if
    }// fim do metodo relacionarJogoGeneros

}// fim da classe ControleJogoGenero
