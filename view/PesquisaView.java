package view;

/*
 * Made by: @GuiDSousa
 * Last modification: 07/07/2024
 
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PesquisaView {
    /*
   * Elemento: searchField
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o termo de pesquisa
   * Observações: Nenhuma
   */
  @FXML TextField searchField;
  /*
   * Elemento: searchButton
   * Tipo: Button
   * Visível: true
   * Objetivo: Enviar o termo de pesquisa para o controller
   * Observações: Nenhuma
   */
  @FXML Button searchButton;  
  /*
   * Elemento: searchResults
   * Tipo: ListView<String>
   * Visível: false
   * Objetivo: Exibir os resultados da pesquisa (se torna visível caso tenha resultados para exibir)
   * Observações: Essa lista deve ser preenchida com os resultados da pesquisa, que são retornados pelo controller
   *             Ao clicar em um dos resultados, o searchField é preenchido com o nome do jogo selecionado
   *            Ao clicar em um dos resultados, o searchResults se torna invisível novamente
   */
  @FXML ListView<String> searchResults;
  /*
   * Elemento: btnCadastrar
   * Tipo: Button
   * Visível: true
   * Objetivo: Redirecionar o usuário para a tela de cadastro
   * Observações: Caso o usuário já esteja logado, o botão deve se tornar invisível e o btnPerfil deve se tornar visível
   */
  @FXML Button btnCadastrar;
  /*
   * Elemento: btnLogin
   * Tipo: Button
   * Visível: true
   * Objetivo: Redirecionar o usuário para a tela de login
   * Observações: Caso o usuário já esteja logado, o botão deve se tornar invisível e o btnPerfil deve se tornar visível
   */
  @FXML Button btnLogin;
  /*
   * Elemento: btnPerfil
   * Tipo: Button
   * Visível: false
   * Objetivo: Redirecionar o usuário para a tela de perfil
   * Observações: Caso o usuário não esteja logado, o botão deve se tornar invisível e o btnLogin e btnCadastrar devem se tornar visíveis
   */
  @FXML Button btnPerfil;
  /*
   * Elemento: lblTermoPesquisado
   * Tipo: Label
   * Visível: false
   * Objetivo: Exibir o termo pesquisado
   * Observações: No lugar onde está escrito "O panteão da Crypta Nostálgica"
   */
  @FXML Label lblTermoPesquisado;
  /*
   * Elemento: imgJogo_1 a 8
   * Tipo: ImageView
   * Visível: true
   * Objetivo: Exibir as imagens dos jogos
   * Observações: IMPORTANTE: Ao clicar nas images, ou nos labels, o usuário é redirecionado para a tela do jogo respectivo
   *            Caso o usuário ainda não tenha pesquisado nada, as ImageView de 1 a 4 são preenchidas com os jogos com maiores notas
   *            E as ImageView de 5 a 8 são preenchidas com os jogos mais recentes. Caso o usuário tenha pesquisado algo, as ImageView
   *           são preenchidas com os jogos que correspondem ao termo pesquisado, se for menor que 8, as ImageView restantes são tornadas invisíveis
   */
  @FXML ImageView imgJogo_1;
  @FXML ImageView imgJogo_2;
  @FXML ImageView imgJogo_3;
  @FXML ImageView imgJogo_4;
  @FXML ImageView imgJogo_5;
  @FXML ImageView imgJogo_6;
  @FXML ImageView imgJogo_7;
  @FXML ImageView imgJogo_8;
  /*
   * Elemento: lblJogo_1 a 8
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o nome dos jogos
   * Observações: Ao clicar nas images, ou nos labels, o usuário é redirecionado para a tela do jogo respectivo
   *            Caso o usuário ainda não tenha pesquisado nada, as Label de 1 a 4 são preenchidas com os jogos com maiores notas
   *            E as Label de 5 a 8 são preenchidas com os jogos mais recentes. Caso o usuário tenha pesquisado algo, as Label
   *           são preenchidas com os jogos que correspondem ao termo pesquisado, se for menor que 8, as Label restantes são tornadas invisíveis
   */
  @FXML Label lblJogo_1;
  @FXML Label lblJogo_2;
  @FXML Label lblJogo_3;
  @FXML Label lblJogo_4;
  @FXML Label lblJogo_5;
  @FXML Label lblJogo_6;
  @FXML Label lblJogo_7;
  @FXML Label lblJogo_8;
  /*
   * Elemento: lblNotaCritica_1 a 8
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota da crítica dos jogos
   * Observações: Caso o usuário ainda não tenha pesquisado nada, as Label de 1 a 4 são preenchidas com as notas dos jogos com maiores notas
   *            E as Label de 5 a 8 são preenchidas com as notas dos jogos mais recentes. Caso o usuário tenha pesquisado algo, as Label
   *           são preenchidas com as notas dos jogos que correspondem ao termo pesquisado, se for menor que 8, as Label restantes são tornadas invisíveis
   */
  @FXML Label lblNotaCritica_1;
  @FXML Label lblNotaCritica_2;
  @FXML Label lblNotaCritica_3;
  @FXML Label lblNotaCritica_4;
  @FXML Label lblNotaCritica_5;
  @FXML Label lblNotaCritica_6;
  @FXML Label lblNotaCritica_7;
  @FXML Label lblNotaCritica_8;

  public void initialize() { 
      searchField.textProperty().addListener((observable, oldValue, newValue) -> {
        // Verifica se o texto digitado não está vazio
        if (!newValue.isEmpty()) {
          // Torna a ListView visível
          searchResults.setVisible(true);
        } else {
          // Torna a ListView invisível
          searchResults.setVisible(false);
        }
      });
  }

  @FXML
  private void handleButtonLogin() {
    try {
      FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("tela-login.fxml"));
      Parent loginRoot = loginLoader.load();
      Scene loginScene = new Scene(loginRoot);
      Stage loginStage = new Stage();
      
      Image iconeJanela = new Image("images/esboço-logo-export.png");
      loginStage.getIcons().add(iconeJanela);
      loginStage.setTitle("Crypta Nostalgica - Login");
      loginStage.setResizable(false);// bloqueia o redimensionamento da tela
      loginStage.centerOnScreen();
      loginStage.setScene(loginScene);
      loginStage.show();
      // fecha a tela de pesquisa
      btnLogin.getScene().getWindow().hide();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void handleButtonCadastrar() {
    try {
      FXMLLoader cadastroLoader = new FXMLLoader(getClass().getResource("tela-cadastro.fxml"));
      Parent cadastroRoot = cadastroLoader.load();
      Scene cadastroScene = new Scene(cadastroRoot);
      Stage cadastroStage = new Stage();
      
      Image iconeJanela = new Image("images/esboço-logo-export.png");
      cadastroStage.getIcons().add(iconeJanela);
      cadastroStage.setTitle("Crypta Nostalgica - Cadastro");
      cadastroStage.setResizable(false);// bloqueia o redimensionamento da tela
      cadastroStage.centerOnScreen();
      cadastroStage.setScene(cadastroScene);
      cadastroStage.show();

// Mostra a tela de cadastro
      // fecha a tela de pesquisa
      btnCadastrar.getScene().getWindow().hide();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML 
  private void handleButtonPerfil() {
    try {
      FXMLLoader perfilLoader = new FXMLLoader(getClass().getResource("tela-perfil.fxml"));
      Parent perfilRoot = perfilLoader.load();
      Scene perfilScene = new Scene(perfilRoot);
      Stage perfilStage = new Stage();
      
      Image iconeJanela = new Image("images/esboço-logo-export.png");
      perfilStage.getIcons().add(iconeJanela);
      perfilStage.setTitle("Crypta Nostalgica - Perfil");
      perfilStage.setResizable(false);// bloqueia o redimensionamento da tela
      perfilStage.centerOnScreen();
      perfilStage.setScene(perfilScene);
      perfilStage.show();
      // fecha a tela de pesquisa
      btnPerfil.getScene().getWindow().hide();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void onHoverCadastro() {
    btnCadastrar.setStyle("-fx-background-color: #97ae00");
  }
  // Método para mudar a cor do botão enviar ao tirar o mouse
  @FXML
  private void offHoverCadastro() {
    btnCadastrar.setStyle("-fx-background-color: #fff");
  }

  @FXML
  private void onHoverLogin() {
    btnLogin.setStyle("-fx-background-color: #97ae00");
  }
  @FXML
  private void offHoverLogin() {
    btnLogin.setStyle("-fx-background-color: #fff");
  }

  @FXML
  private void onHoverPerfil() {
    btnPerfil.setStyle("-fx-background-color: #97ae00");
  }
  @FXML
  private void offHoverPerfil() {
    btnPerfil.setStyle("-fx-background-color: #fff");
  }
  //Métodos para direcionar ao usuário para a tela do jogo de acordo com a ImageView clicada
  @FXML
  private void handleImageClick1() {
    try {
      FXMLLoader jogoLoader = new FXMLLoader(getClass().getResource("tela-jogo.fxml"));
      Parent jogoRoot = jogoLoader.load();
      Scene jogoScene = new Scene(jogoRoot);
      Stage jogoStage = new Stage();
      
      Image iconeJanela = new Image("images/esboço-logo-export.png");
      jogoStage.getIcons().add(iconeJanela);
      jogoStage.setTitle("Crypta Nostalgica - Jogo");
      jogoStage.setResizable(false);// bloqueia o redimensionamento da tela
      jogoStage.centerOnScreen();
      jogoStage.setScene(jogoScene);
      jogoStage.show();
      // fecha a tela de pesquisa
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
