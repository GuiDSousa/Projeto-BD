package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class PerfilView {
    /*
   * Elemento: lblUsername
   * Tipo: Label
   * Visível: true
   * Objetivo: Recebe o nome do usuário logado
   * Observações: Nenhuma
   */
  @FXML Label lblUsername;
  /*
   * Elemento: lblLogout
   * Tipo: Label
   * Visível: true
   * Objetivo: Deslogar o usuário
   * Observações: Deve ser criado um evento onde ao usuário clicar no label, ele é deslogado (on mouse click)
   */
  @FXML Label lblLogout;
  /*
   * Elemento: btnVoltar
   * Tipo: Button
   * Visível: true
   * Objetivo: Redirecionar o usuário para a tela de pesquisa ou se possível para a tela anterior
   * Observações: Nenhuma
   */
  @FXML Button btnVoltar;
  /*
   * Elemento: lblNota_1 a lblNota_3
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota dada pelo usuário no jogo respectivo
   * Observações: Caso o usuário não tenha feito review, os campos devem estar vazios ou invisíveis
   *            Caso o usuário tenha feito review, os campos devem ser preenchidos com as últimas três reviews feitas pelo usuário
   */
  @FXML Label lblNota_1;
  @FXML Label lblNota_2;
  @FXML Label lblNota_3;
  /*
   * Elemento: txtAreaReview_1 a txtAreaReview_3
   * Tipo: TextArea
   * Visível: true
   * Objetivo: Exibir a review dada pelo usuário no jogo respectivo
   * Observações: Caso o usuário não tenha feito review, os campos devem estar vazios ou invisíveis
   *            Caso o usuário tenha feito review, os campos devem ser preenchidos com as últimas três reviews feitas pelo usuário
   */
  @FXML TextArea txtAreaReview_1;
  @FXML TextArea txtAreaReview_2;
  @FXML TextArea txtAreaReview_3;
  /*
   * Elemento: lblNomeJogo_1 a lblNomeJogo_3
   * Tipo: Button
   * Visível: true
   * Objetivo: Mostra o nome do jogo respectivo ao review
   * Observações: Caso o usuário não tenha feito review, os campos devem estar vazios ou invisíveis
   *            Caso o usuário tenha feito review, os campos devem ser preenchidos com as últimas três reviews feitas pelo usuário
   */
  @FXML Button lblNomeJogo_1;
  @FXML Button lblNomeJogo_2;
  @FXML Button lblNomeJogo_3;
  /*
   * Elemento: imgPerfil
   * Tipo: ImageView
   * Visível: true
   * Objetivo: Exibir a foto de perfil do usuário selecionada na tela de cadastro
   * Observações: Nenhuma
   */
  @FXML ImageView imgPerfil;
}
