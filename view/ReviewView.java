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
   * Elemento: menuPlataforma
   * Tipo: MenuButton
   * Visível: true
   * Objetivo: Receber a plataforma do jogo
   * Observações: Nenhuma
   */
  @FXML MenuButton menuPlataforma;
  /*
   * Elemento: PlayStation_1 a GameBoy
   * Tipo: MenuItem
   * Visível: true
   * Objetivo: Receber a plataforma do jogo
   * Observações: Ao clicar em um dos botões, a plataforma é enviada para o controller
   */
  @FXML MenuItem PlayStation_1;
  @FXML MenuItem PlayStation_2;
  @FXML MenuItem PC;
  @FXML MenuItem Nintendo_64;
  @FXML MenuItem GameCube;
  @FXML MenuItem Xbox;
  @FXML MenuItem SuperNintendo;
  @FXML MenuItem PolyStation;
  @FXML MenuItem MasterSystem;
  @FXML MenuItem GameBoy;
  /*
   * Elemento: btnEnviar
   * Tipo: Button
   * Visível: true
   * Objetivo: Enviar os dados coletados para o controller
   * Observações: Nenhuma
   */
  @FXML Button btnEnviar;
}
