import model.*;
import images.*;
import util.*;
import dao.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }// fim do metodo main

    public void start(Stage janelaPrincipal) throws Exception {
        // instancia o fxmlLoader e define a localizacao do arquivo .fxml que contem os
        // elementos graficos que serao associados a janela
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("tela-login.fxml"));

        Parent root = loader.load();// carrega a estrutura grafica da janela
        Scene cena = new Scene(root);// cria a cena e define a estrutura grafica que sera exibida por ela

        Image imagemIcone = new Image("images/esboço-logo-export.png");// instancia uma imagem icone
        janelaPrincipal.getIcons().add(imagemIcone);// define a imagem instanciada como icone da janela
        janelaPrincipal.setTitle("Crypta Nostalgica");// define o titulo da janela
        janelaPrincipal.setResizable(false);// bloqueia o redimensionamento da janela
        janelaPrincipal.centerOnScreen();// centraliza a janela no tela

        janelaPrincipal.setScene(cena);// define a cena que sera exibida na janela
        janelaPrincipal.show();// exibe a janela
    }// fim do metodo start

}// fim da classe Principal