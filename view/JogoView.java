package view;

import controller.ControleJogo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Jogo;

public class JogoView {
  /*
   * Elemento: lblTitulo
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o título do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblTitulo;
  /*
   * Elemento: lblDataLancamento
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a data de lançamento do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblDataLancamento;
  /*
   * Elemento: lblGenero
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o(s) gênero(s) do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblGenero;
  /*
   * Elemento: lblPlataforma
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a(s) plataforma(s) do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblPlataforma;
  /*
   * Elemento: txtSinopse
   * Tipo: TextArea
   * Visível: true
   * Objetivo: Exibir a sinopse do jogo
   * Observações: Nenhuma
   */
  @FXML
  TextArea txtSinopse;
  /*
   * Elemento: lblNotaCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota da critica do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblNotaCritica;
  /*
   * Elemento: lblNotaUsuario
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota dos Usuarios do jogo
   * Observações: Média das notas dos usuários
   */
  @FXML
  Label lblMediaUsuario;
  /*
   * Elemento: lblComentarioCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o comentário da crítica do jogo
   * Observações: Nenhuma
   */
  @FXML
  Label lblComentarioCritica;
  /*
   * Elemento: btnAddReview
   * Tipo: Button
   * Visível: true
   * Objetivo: Direciona o usuário para a tela de adicionar review do jogo em
   * questão
   * Observações: Deve abrir uma nova tela e não fechar a atual
   */
  @FXML
  Button btnAddReview;
  /*
   * Elemento: txtComentarioUsuario_1 a 3
   * Tipo: TextArea
   * Visível: true
   * Objetivo: Exibir os comentários dos usuários
   * Observações: Nenhuma
   */
  @FXML
  TextArea txtComentarioUsuario_1;
  @FXML
  TextArea txtComentarioUsuario_2;
  @FXML
  TextArea txtComentarioUsuario_3;
  /*
   * Elemento: lblNotaUsuario_1 a 3
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota dos usuários
   * Observações: Nenhuma
   */
  @FXML
  Label lblNotaUsuario_1;
  @FXML
  Label lblNotaUsuario_2;
  @FXML
  Label lblNotaUsuario_3;
  /*
   * Elemento: lblNomeUsuario_1 a 3
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o nome do usuário
   * Observações: Nenhuma
   */
  @FXML
  Label lblNomeUsuario_1;
  @FXML
  Label lblNomeUsuario_2;
  @FXML
  Label lblNomeUsuario_3;

  @FXML
  Label lblErro;

  @FXML ImageView imgJogo;

  ControleJogo controleJogo = new ControleJogo();

  public void initialize() {
    
  }

      public void setJogoData(Jogo jogo) {
        String notaFormatada = String.format("%.0f", jogo.getNotaDaCritica());
        lblComentarioCritica.setText(jogo.getComentarioDaCritica());
        lblNotaCritica.setText(notaFormatada);
        lblDataLancamento.setText(jogo.getDataDeLancamento());
        lblTitulo.setText(jogo.getTitulo());
        txtSinopse.setText(jogo.getSinopse());
        

    }

  @FXML
  private void handleBtnAddReview() {
    
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela-review.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();

        Image iconeJanela = new Image("images/esboço-logo-export.png");
        primaryStage.getIcons().add(iconeJanela);
        primaryStage.setTitle("Crypta Nostalgica - Review");
        primaryStage.setResizable(false); // bloqueia o redimensionamento da tela
        primaryStage.centerOnScreen();

        primaryStage.setScene(scene);
        primaryStage.show();
      } catch (Exception e) {
        e.printStackTrace();
        if (lblErro != null) {
          lblErro.setText("Erro ao abrir a tela de review: " + e.getMessage());
        } else {
          System.err.println("lblErro está null e ocorreu uma exceção: " + e.getMessage());
        }
      }
    }
  

  @FXML
  private void onHoverCadastro() {
    btnAddReview.setStyle("-fx-background-color: #97ae00");
  }

  // Método para mudar a cor do botão enviar ao tirar o mouse
  @FXML
  private void offHoverCadastro() {
    btnAddReview.setStyle("-fx-background-color: #04092b");
  }
}
