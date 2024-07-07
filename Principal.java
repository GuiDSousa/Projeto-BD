// Hello World Program

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("tela-login.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);

        Image iconeJanela = new Image("images/esboço-logo-export.png");
        primaryStage.getIcons().add(iconeJanela);
        primaryStage.setTitle("Crypta Nostalgica");
        primaryStage.setResizable(false);// bloqueia o redimensionamento da tela
        primaryStage.centerOnScreen();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}