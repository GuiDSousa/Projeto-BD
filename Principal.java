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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela-login.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Crypta Nostalgica");
        primaryStage.show();
        // bloqueia o redimensionamento da tela
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.getIcons().add(new Image("images/esboço-logo-export.png"));
    }

}