// Hello World Program

import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
        System.out.println("Teste de alterção");//apaga essa linha depois
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }

}

