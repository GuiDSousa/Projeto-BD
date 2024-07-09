package util;

import java.awt.image.BufferedImage;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

public class EnviarImagem {

    private BufferedImage bfd;

    public static void selecionarImagem(ActionEvent event) {

        FileChooser menuEscolherArquivo = new FileChooser();

        File arquivoSelecionado = menuEscolherArquivo.showOpenDialog(null);

        if (arquivoSelecionado != null) {
            File arquivo = menuEscolherArquivo.get;

            try {
                this.bfd = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 160, 160);

                lblImagem.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }
}