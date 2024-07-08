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
}
