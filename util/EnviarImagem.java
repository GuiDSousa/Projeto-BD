package util;

import java.awt.image.BufferedImage;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

public class EnviarImagem {

    BufferedImage imagemAtual;

    /**
     * Metodo listener para um botao de selecao de imagem. Ao clicar no botao, abre
     * a janela com a selecao do arquivos.
     * COPIE E COLE ONDE PRECISA FAZER A SELECAO DE IMAGEM
     */
    public void acaoBtnselecionarImagem(ActionEvent event) {

        FileChooser menuEscolherArquivo = new FileChooser();

        File arquivoSelecionado = menuEscolherArquivo.showOpenDialog(null);


        if (arquivoSelecionado != null) {
            try {
                imagemAtual = ManipularImagem.setImagemDimensao(arquivoSelecionado.getAbsolutePath(), 600, 600);

                byte[] bytesDaImagem = ManipularImagem.getImgBytes(imagemAtual);

                // ADICIONAR ABAIXO O IMAGE VIEW PARA EXIBIR A IMAGEM SELECIONADA
                ManipularImagem.exibirImagemNoImageView(bytesDaImagem, null);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // EXIBIR ESSA MENSAGEM LABEL DE ERRO
            String mensagem = "Você não selecionou nenhuma imagem!";
        }//fim do bloco
    }// fim do metodo selecionarImagem

}// fim da classe EnviarImagem