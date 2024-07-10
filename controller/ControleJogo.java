package controller;

import model.*;
import util.ManipularImagem;

import java.time.LocalDateTime;

import dao.JogoDAO;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

public class ControleJogo {
    /**
     * Recebe as informações do jogo, cria o jogo, armazena o jogo criado no BD.
     * 
     * OBS: CHAMAR ESSE METODO SOMENTE APOS A VALIDACAO DAS INFORMACOES DO JOGO.
     */
    public boolean cadastrarNovoJogo(String titulo, String dataDeLancamento, String produtora, String sinopse,
            byte[] imagemDeCapa,
            double notaDaCritica, String comentarioDaCritica) {
        // verificacao dos parametros
        if ((titulo != null && titulo.length() > 0)
                && (dataDeLancamento != null && dataDeLancamento.length() > 0)
                && (produtora != null && produtora.length() > 0)
                && (imagemDeCapa != null && imagemDeCapa.length > 0)
                && (notaDaCritica >= 0 && notaDaCritica <= 100)
                && (comentarioDaCritica != null && comentarioDaCritica.length() > 0)) {

            // armazena a hora atual da maquina e converte para sql Date
            LocalDateTime dataPublicacao = LocalDateTime.now();
            java.sql.Date dataPublicacaoSQL = java.sql.Date.valueOf(dataPublicacao.toLocalDate());

            // Instancia um novo jogo: inicialmente a nota das avaliacoes eh 0, pois o jogo
            // acabou de ser criado
            Jogo novoJogo = new Jogo(titulo, dataDeLancamento, produtora, sinopse, imagemDeCapa, notaDaCritica,
                    comentarioDaCritica, dataPublicacaoSQL, 0);

            // tenta inserir o novo jogo no BD
            if (Jogo.cadastrarNovoJogo(novoJogo)) {
                return true; // se criar o jogo corretamente
            } // fim do if
        } // fim do if
        return false;// caso o os atributos nao estejam validos ou nao inseriu o jogo no BD
    }// fim do metodo cadastrarNovoJogo

    public Jogo buscarJogo(String titulo) {
        Jogo jogoBuscado = new JogoDAO().selectByTitulo(titulo);
        return jogoBuscado;
    }

    public Image recuperarImagemDoJogo(String tituloDoJogo) {
        Image imagemDoJogo = null;

        // faz uma conexao com o bd e busca o jogo
        Jogo jogo = new JogoDAO().selectByTitulo(tituloDoJogo);

        // se o existe
        if (jogo != null) {
            // reconstroi a imagem do jogo buscado
            imagemDoJogo = ManipularImagem.reconstruirImagem(jogo.getImagemDeCapa());
        } // fim do if
        return imagemDoJogo;
    }// fim do metodo recuperarImagemDoJogo
}// fim da classe ControleJogo