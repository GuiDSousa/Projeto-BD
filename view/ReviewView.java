package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class ReviewView {
  /*
   * Elemento: lblNomeJogo
   * Tipo: Label
   * Visível: true
   * Objetivo: Receber o nome do jogo que o usuário deseja fazer review
   * Observações: Nenhuma
   */
  @FXML Label lblNomeJogo;
  /*
   * Elemento: txtComentario
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o comentário do usuário
   * Observações: Nenhuma
   */
  @FXML TextField txtComentario;
  /*
   * Elemento: btnEstrela_1 a btnEstrela_5
   * Tipo: Button
   * Visível: true
   * Objetivo: Receber a nota do usuário
   * Observações: Ao clicar em um dos botões, a nota é enviada para o controller
   */
  @FXML Button btnEstrela_1;
  @FXML Button btnEstrela_2;
  @FXML Button btnEstrela_3;
  @FXML Button btnEstrela_4;
  @FXML Button btnEstrela_5;
  /*

   * Elemento: btnEnviar
   * Tipo: Button
   * Visível: true
   * Objetivo: Enviar os dados coletados para o controller
   * Observações: Nenhuma
   */
  @FXML Button btnEnviar;


  public void initialize() {
    btnEstrela_1.setOnAction(event -> avaliar(1));
    btnEstrela_2.setOnAction(event -> avaliar(2));
    btnEstrela_3.setOnAction(event -> avaliar(3));
    btnEstrela_4.setOnAction(event -> avaliar(4));
    btnEstrela_5.setOnAction(event -> avaliar(5));
  }

  private void avaliar(int nota) {
    System.out.println("Nota atribuída: " + nota);
    // Adicionar código de processamento da nota e atribuir ao respectivo jogo
  }
}
