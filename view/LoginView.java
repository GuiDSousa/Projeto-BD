package view;
import java.io.IOException;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginView {

  // Instância da classe de tela de pesquisa
  private PesquisaView pesquisaView = new PesquisaView();
  private JogoView jogoView = new JogoView();
  private boolean usuarioLogado = false;
  /*
   * Elemento: txtLogin
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o login do usuário (email)
   * Observações: Nenhuma
   */
  @FXML TextField txtLogin;
  /*
   * Elemento: txtSenha
   * Tipo: PasswordField
   * Visível: true
   * Objetivo: Receber a senha do usuário
   * Observações: Nenhuma
   */
  @FXML PasswordField txtSenha;
  /*
   * Elemento: btnEntrar
   * Tipo: Button
   * Visível: true
   * Objetivo: Enviar os dados para o controller
   * Observações: Nenhuma
   */
  @FXML Button btnEntrar;
  /*
   * Elemento: lblCadastro
   * Tipo: Label
   * Visível: true
   * Objetivo: Redirecionar o usuário para a tela de cadastro
   * Observações: Deve ser criado um evento onde ao usuário clicar no label, ele é redirecionado para a tela de cadastro (on mouse click)
   */
  @FXML Label lblCadastro;
  /*
   * Elemento: lblErro
   * Tipo: Label
   * Visível: false
   * Objetivo: Exibir mensagens de erro ao usuário
   * Observações: Caso o método de autenticação retorne um erro, a label deve se tornar visível e exibir a mensagem de erro
   */
  @FXML Label lblErro;

  // Métodos

  public void setUsuarioLogado(boolean logado) {
    this.usuarioLogado = logado;
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
      lblCadastro.getScene().getWindow().hide();
      // Torna os botões cadastro e login invisíveis e o botão perfil visível

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML 
  private void handleButtonEntrar() {
    String username = txtLogin.getText();
    String password = txtSenha.getText();
    try {
      if (username.equals("admin") && password.equals("admin")) { // Trocar depois para o método de autenticação no controller
        FXMLLoader adminLoader = new FXMLLoader(getClass().getResource("tela-pesquisa.fxml"));
        Parent adminRoot = adminLoader.load();
        Scene adminScene = new Scene(adminRoot);
        Stage adminStage = new Stage();
        
        Image iconeJanela = new Image("images/esboço-logo-export.png");
        adminStage.getIcons().add(iconeJanela);
        adminStage.setTitle("Crypta Nostalgica");
        adminStage.setResizable(false);// bloqueia o redimensionamento da tela
        adminStage.centerOnScreen();
        adminStage.setScene(adminScene);
        adminStage.show();
        // fecha a tela de pesquisa
        btnEntrar.getScene().getWindow().hide();
        PesquisaView pesquisaView = adminLoader.getController();
        pesquisaView.btnCadastrar.setVisible(false);
        pesquisaView.btnLogin.setVisible(false);
        pesquisaView.btnPerfil.setVisible(true);
        setUsuarioLogado(usuarioLogado = true);
        System.out.println("Usuário logado com sucesso");
  
      } else {
        lblErro.setVisible(true);
        lblErro.setText("Usuário ou senha inválidos");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    }
    // Get usuário logado
    public boolean getUsuarioLogado() {
      return usuarioLogado;
    }
    // Método para mudar a cor do botão enviar ao passar o mouse
    @FXML
    private void onHover() {
      btnEntrar.setStyle("-fx-background-color: #97ae00");
    }
    // Método para mudar a cor do botão enviar ao tirar o mouse
    @FXML
    private void offHover() {
      btnEntrar.setStyle("-fx-background-color: #04092b");
    }
    @FXML private void onHoverLabel() {
      lblCadastro.setStyle("-fx-text-fill: #97ae00");
    }
    @FXML private void offHoverLabel() {
      lblCadastro.setStyle("-fx-text-fill: #04092b");
    }
  }

