package util;

import java.awt.image.BufferedImage;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;

public class EnviarImagem {

    BufferedImage imagemAtual;

    /**
     * Metodo listener para um botao de selecao de imagem. Ao clicar no botao, abre
     * a janela com a selecao do arquivos.
     */
    public void acaoBtnselecionarImagemAdmin(ActionEvent event) {

        FileChooser menuEscolherArquivo = new FileChooser();

        File arquivoSelecionado = menuEscolherArquivo.showOpenDialog(null);

        BufferedImage imagemAtual;

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
        }
    }// fim do metodo selecionarImagem

    public void cadastrarJogo(BufferedImage bfdImage) {

        byte[] bytesDaImagem = ManipularImagem.getImgBytes(bfdImage);

        // JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
    }// fim do metodo cadastrarJogo

    public void recuperarImagemDoJogo(ActionEvent event) {
        // Platform.runLater(() -> {
        // faz uma conexao com o bd
        // JogoDAO jogoDao = new JogoDAO();

        // faz a busca do jogo no bd
        // jogoBuscado = jogoDao.selectByTitulo("Grand Theft Auto: San Andreas");
        // a partir daqui, se o jogo foi recuerado do bd já é possivel testar se os
        // valores dele foram salvos

        // pode fazer isso dando jogoBuscado.getTitulo por exemplo e atribuir a uma
        // label pra ver se aparece o titulo

        // se tudo funcionar, recupera o array de bytes do bd e converte novamente para
        // imagem
        // ADICIONAR AQUI O IMAGEVIEW no qual será exibida a imagem recuperada do bd
        // ManipularImagem.exibiImagemNoImageView(jogoBuscado, null);
        // });
    }
}// fim da classe EnviarImagem