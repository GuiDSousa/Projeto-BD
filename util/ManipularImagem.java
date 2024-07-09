package util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** Classe auxiliar para a manipulação de imagens */
public class ManipularImagem {
    /**
     * Faz redimensionamento da imagem conforme os parâmetros imgLargura e imgAltura,
     * mantendo a proporcionalidade da imagem.
     * Caso a imagem seja menor do que os parâmetros de redimensionamento, a imagem
     * não será redimensionada.
     * 
     * @param caminhoImg caminho e nome da imagem a ser redimensionada.
     * @param imgLargura nova largura da imagem após ter sido redimensionada.
     * @param imgAltura  nova altura da imagem após ter sido redimensionada.
     * 
     * @return Não há retorno
     * @throws Exception Erro ao redimensionar imagem
     */
    public static BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura) {
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;

        try {
            // --- Obtém a imagem a ser redimensionada ---
            imagem = ImageIO.read(new File(caminhoImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ManipularImagem.class.getName()).log(Level.SEVERE, null, ex);
        }

        // --- Obtém a largura da imagem ---
        novaImgLargura = (double) imagem.getWidth();

        // --- Obtám a altura da imagem ---
        novaImgAltura = (double) imagem.getHeight();

        // --- Verifica se a altura ou largura da imagem recebida é maior do que os ---
        // --- parâmetros de altura e largura recebidos para o redimensionamento ---
        if (novaImgLargura >= imgLargura) {
            imgProporcao = (novaImgAltura / novaImgLargura);// calcula a proporção
            novaImgLargura = (double) imgLargura;

            // --- altura deve <= ao parâmetro imgAltura e proporcional a largura ---
            novaImgAltura = (novaImgLargura * imgProporcao);

            // --- se altura for maior do que o parâmetro imgAltura, diminui-se a largura de ---
            // --- forma que a altura seja igual ao parâmetro imgAltura e proporcional a largura ---
            while (novaImgAltura > imgAltura) {
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }
        } else if (novaImgAltura >= imgAltura) {
            imgProporcao = (novaImgLargura / novaImgAltura);// calcula a proporção
            novaImgAltura = (double) imgAltura;

            // --- se largura for maior do que o parâmetro imgLargura, diminui-se a altura de ---
            // --- forma que a largura seja igual ao parâmetro imglargura e proporcional a altura ---
            while (novaImgLargura > imgLargura) {
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }

        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);

        return novaImagem;
    }//fim do metodo setImagemDimensao

    /**
     * Converte o objeto BufferedImage em um array de bytes.
     * 
     * @param imagem imagem a ser convertida.
     * 
     * @return bytes correspondentas a imagem.
     * @throws Exception Erro ao converter a imagem
     */
    public static byte[] getImgBytes(BufferedImage imagem) {
        byte[] imagemEmBytes = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(imagem, "PNG", baos);
        } catch (IOException e) {
            e.printStackTrace();
        } // fim do bloco try-catch
        imagemEmBytes = baos.toByteArray();

        return imagemEmBytes;
    }// fim do metodo getImgBytes

    /**
     * Carrega uma imagem a partir do seu array de bytes e exibe a imagem carregada
     * em um ImageView.
     * 
     * @param bytesDaImagem array de bytes da imagem.
     * @param imageView     objeto onde a imagem carregada sera exibida.
     * 
     * @return Nao ha retorno.
     * @throws Exception Erro ao converter a imagem
     */
    public static void exibirImagemNoImageView(byte[] bytesDaImagem, ImageView imageView) {

        // verifica se a imagem nao eh nula e converte para inputstream que é o formato
        // reconhecido pelo ImageIO
        if (bytesDaImagem != null) {
            InputStream input = new ByteArrayInputStream(bytesDaImagem);
            try {
                BufferedImage bfImage = ImageIO.read(input);

                Image imgCarregada = SwingFXUtils.toFXImage(bfImage, null);

                Platform.runLater(() -> imageView.setImage(imgCarregada));// exibe a imagem carregada no imageView
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {// se a imagem for nula, exibe uma mensagem indicando o erro
            System.out.println("Erro! imagem não existe!");
        }
    }// fim do metodo exibirImagemNoImageView

}// fim da ManipularImagem