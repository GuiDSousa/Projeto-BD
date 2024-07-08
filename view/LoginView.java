package view;
/*
 * Made by: @GuiDSousa
 * Last modification: 07/07/2024
 
 */
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginView {

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
}
