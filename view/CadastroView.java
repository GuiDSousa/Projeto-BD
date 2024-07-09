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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CadastroView {
  /*
   * Elemento: btnPerfilBardo
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar o perfil de Bardo
   * Observações: Ao clicar nesse botão, define a foto de perfil como a do Bardo, apenas isso
   */
  @FXML Button btnPerfilBardo;
  /*
   * Elemento: btnPerfilGuerreiro
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar o perfil de Guerreiro
   * Observações: Ao clicar nesse botão, define a foto de perfil como a do Guerreiro, apenas isso
   */
  @FXML Button btnPerfilGuerreiro;
  /*
   * Elemento: btnPerfilMago
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar o perfil de Mago
   * Observações: Ao clicar nesse botão, define a foto de perfil como a do Mago, apenas isso
   */
  @FXML Button btnPerfilMago;
  /*
   * Elemento: btnPerfilElfo
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar o perfil de Elfo
   * Observações: Ao clicar nesse botão, define a foto de perfil como a do Elfo, apenas isso
   */
  @FXML Button btnPerfilElfo;
  /*
   * Elemento: txtUsername
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o nome de usuário
   * Observações: Recebe apenas letras, deve possuir no máximo 15 caracteres, não pode ser vazio e não pode ser repetido.
   *             Para cada um dos casos deve retornar a mensagem de erro correspondente.
   */
  @FXML TextField txtUsername;
  /*
   * Elemento: txtEmail
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o email do usuário
   * Observações: Deve ser um email válido, não pode ser vazio e não pode ser repetido.
   *             Para cada um dos casos deve retornar a mensagem de erro correspondente.
   */
  @FXML TextField txtEmail;
  /*
   * Elemento: txtSenha
   * Tipo: PasswordField
   * Visível: true
   * Objetivo: Receber a senha do usuário
   * Observações: Deve possuir no mínimo 8 caracteres, não pode ser vazio e deve ser igual ao campo de confirmação de senha.
   *             Para cada um dos casos deve retornar a mensagem de erro correspondente.
   */
  @FXML PasswordField txtSenha;
  /*
   * Elemento: txtConfirmaSenha
   * Tipo: PasswordField
   * Visível: true
   * Objetivo: Receber a confirmação da senha do usuário
   * Observações: Deve possuir no mínimo 8 caracteres, não pode ser vazio e deve ser igual ao campo de senha.
   *             Para cada um dos casos deve retornar a mensagem de erro correspondente.
   */
  @FXML PasswordField txtConfirmaSenha;
  /*
   * Elemento: btnCadastrar
   * Tipo: Button
   * Visível: true
   * Objetivo: Enviar os dados para o controller
   * Observações: Ao clicar nesse botão, deve ser feita a validação dos campos e, caso estejam corretos, deve ser feito o cadastro do usuário e registrado no banco de dados.
   *             Caso contrário, deve ser exibida a mensagem de erro correspondente.
   */
  @FXML Button btnCadastrar;
  /*
   * Elemento: btnVoltar
   * Tipo: Button
   * Visível: true
   * Objetivo: Retornar para a tela de login
   * Observações: Nenhuma
   */
  @FXML Button btnVoltar; 
  /*
   * Elemento: lblErro
   * Tipo: Label
   * Visível: false
   * Objetivo: Exibir mensagens de erro ao usuário
   * Observações: Caso o método de cadastro retorne um erro, a label deve se tornar visível e exibir a mensagem de erro
   */
  @FXML Label lblErro;

  @FXML private void handleButtonCadastrar() {
    String username = txtUsername.getText();
    String email = txtEmail.getText();
    String senha = txtSenha.getText();
    String confirmaSenha = txtConfirmaSenha.getText();
    // Validação temporária dos campos até os métodos de validação serem implementados no controller
    if (username.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmaSenha.isEmpty()) {
      lblErro.setText("Preencha todos os campos!");
      lblErro.setVisible(true);
      System.out.println("Preencha todos os campos!");
    } else if (!senha.equals(confirmaSenha)) {
      lblErro.setText("As senhas não coincidem!");
      lblErro.setVisible(true);
      System.out.println("As senhas não coincidem!");
    } else {
      // Chamar o método de cadastro do controller
      System.out.println("Usuário cadastrado com sucesso!");
      // Redirecionar para a tela de login
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela-login.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        Image iconeJanela = new Image("images/esboço-logo-export.png");
        primaryStage.getIcons().add(iconeJanela);
        primaryStage.setTitle("Crypta Nostalgica");
        primaryStage.setResizable(false);// bloqueia o redimensionamento da tela
        primaryStage.centerOnScreen();

        primaryStage.setScene(scene);
        primaryStage.show();

        // fecha a tela de cadastro
        Stage stage = (Stage) btnCadastrar.getScene().getWindow();
        stage.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }


  @FXML private void handleButtonVoltar() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela-pesquisa.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        Image iconeJanela = new Image("images/esboço-logo-export.png");
        primaryStage.getIcons().add(iconeJanela);
        primaryStage.setTitle("Crypta Nostalgica");
        primaryStage.setResizable(false);// bloqueia o redimensionamento da tela
        primaryStage.centerOnScreen();

        primaryStage.setScene(scene);
        primaryStage.show();

        // fecha a tela de cadastro
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
  @FXML
  private void onHover() {
    btnCadastrar.setStyle("-fx-background-color: #97ae00");
  }
  // Método para mudar a cor do botão enviar ao tirar o mouse
  @FXML
  private void offHover() {
    btnCadastrar.setStyle("-fx-background-color: #04092b");
  }

  // Métodos para selecionar a classe/foto de perfil do usuário
  @FXML private void handleButtonPerfilBardo() {
    // Chamar o método de seleção de perfil do controller
    System.out.println("Perfil de Bardo selecionado!");
  }
  @FXML private void handleButtonPerfilGuerreiro() {
    // Chamar o método de seleção de perfil do controller
    System.out.println("Perfil de Guerreiro selecionado!");
  }
  @FXML private void handleButtonPerfilMago() {
    // Chamar o método de seleção de perfil do controller
    System.out.println("Perfil de Mago selecionado!");
  }
  @FXML private void handleButtonPerfilElfo() {
    // Chamar o método de seleção de perfil do controller
    System.out.println("Perfil de Elfo selecionado!");
  }

}
