package view;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AdminView {
  /*
   * Elemento: btnSelecionarImagem
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar a imagem do jogo
   * Observações: Deve selecionar o arquivo de imagem e exibir a imagem no imgJogo
   */
  @FXML Button btnSelecionarImagem;

  /*
   * Elemento: txtNomeJogo
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o nome do jogo
   * Observações: Nenhuma
   */
  @FXML TextField txtNomeJogo;
  /*
   * Elemento: txtDataLancamento
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a data de lançamento do jogo
   * Observações: dd/mm/aaaa
   */
  @FXML TextField txtDataLancamento;
  /*
   * Elemento: txtNotaCritica
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a nota da crítica
   * Observações: De 1 a 100
   */
  @FXML TextField txtNotaCritica;
  /*
   * Elemento: txtSinopse
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a sinopse do jogo
   * Observações: Definir máximo de caracteres
   */
  @FXML TextField txtSinopse;
  /*
   * Elemento: txtComentarioCritica
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o comentário da crítica
   * Observações: Definir máximo de caracteres
   */
  @FXML TextField txtComentarioCritica;
  /*
   * Elemento: lblErro
   * Tipo: Label
   * Visível: false
   * Objetivo: Exibir mensagem de erro
   * Observações: Deve se tornar visivel e retornar uma mensagem com o erro específico
   */
  @FXML Label lblErro;
  /*
   * Elemento: lblDataLancamento
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a data de lançamento recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblDataLancamento;
  /*
   * Elemento: lblNotaCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota da crítica recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblNotaCritica;
  /*
   * Elemento: lblSinopse
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a sinopse recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML TextArea lblSinopse;
  /*
   * Elemento: lblComentarioCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o comentário da crítica recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblComentarioCritica;
  /*
   * Elemento: imgJogo
   * Tipo: ImageView
   * Visível: true
   * Objetivo: Exibir a imagem do jogo
   * Observações: Vista após clicar no botão revisão
   */
  @FXML ImageView imgJogo;
  /*
   * Elemento: lblNomeJogo
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o nome do jogo recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblNomeJogo;
  /*
   * Elemento: lblGenero
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o gênero do jogo recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblGenero;
  /*
   * Elemento: lblPlataforma
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a plataforma do jogo recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML Label lblPlataforma;
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
  @FXML CheckMenuItem PlayStation_1;
  @FXML CheckMenuItem PlayStation_2;
  @FXML CheckMenuItem PC;
  @FXML CheckMenuItem Nintendo_64;
  @FXML CheckMenuItem GameCube;
  @FXML CheckMenuItem Xbox;
  @FXML CheckMenuItem SuperNintendo;
  @FXML CheckMenuItem PolyStation;
  @FXML CheckMenuItem MasterSystem;
  @FXML CheckMenuItem GameBoy;
  /*
   * Elemento: menuGenero
   * Tipo: MenuButton
   * Visível: true
   * Objetivo: Receber o gênero do jogo
   * Observações: Nenhuma
   */
  @FXML MenuButton menuGenero;
  /*
   * Elemento: Acao a Luta
   * Tipo: MenuItem
   * Visível: true
   * Objetivo: Receber o gênero do jogo
   * Observações: Ao clicar em um dos botões, o gênero é enviado para o controller
   */
  @FXML CheckMenuItem Acao;
  @FXML CheckMenuItem Aventura;
  @FXML CheckMenuItem Corrida;
  @FXML CheckMenuItem Estrategia;
  @FXML CheckMenuItem Esporte;
  @FXML CheckMenuItem Fantasia;
  @FXML CheckMenuItem RPG;
  @FXML CheckMenuItem Shooter;
  @FXML CheckMenuItem Simulacao;
  @FXML CheckMenuItem Terror;
  @FXML CheckMenuItem Luta;

  /*
   * Elemento: btnRevisarJogo
   * Tipo: Button
   * Visível: true
   * Objetivo: Revisar o jogo
   * Observações: Deve exibir os dados do jogo para revisão
   */
  @FXML Button btnRevisarJogo;
    /*
   * Elemento: btnCadastrarJogo
   * Tipo: Button
   * Visível: true
   * Objetivo: Cadastrar o jogo
   * Observações: Deve enviar os dados do jogo para o banco de dados
   */
  @FXML Button btnCadastrarJogo;

  private List<Integer> plataformasSelecionadas = new ArrayList<>();
  private List<Integer> generosSelecionados = new ArrayList<>();

  public void initialize() {

    // Configurar as ações dos itens de menu
    configurarMenuItens();
}

private void configurarMenuItens() {
  // Configurar itens do menu de plataforma
  configurarItemMenu(PlayStation_1, 1, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(PlayStation_2, 2, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(PC, 3, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(Nintendo_64, 4, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(GameCube, 5, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(Xbox, 6, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(SuperNintendo, 7, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(PolyStation, 8, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(MasterSystem, 9, plataformasSelecionadas, menuPlataforma);
  configurarItemMenu(GameBoy, 10, plataformasSelecionadas, menuPlataforma);

  // Configurar itens do menu de gênero
  configurarItemMenu(Acao, 1, generosSelecionados, menuGenero);
  configurarItemMenu(Aventura, 2, generosSelecionados, menuGenero);
  configurarItemMenu(Corrida, 3, generosSelecionados, menuGenero);
  configurarItemMenu(Estrategia, 4, generosSelecionados, menuGenero);
  configurarItemMenu(Esporte, 5, generosSelecionados, menuGenero);
  configurarItemMenu(Fantasia, 6, generosSelecionados, menuGenero);
  configurarItemMenu(RPG, 7, generosSelecionados, menuGenero);
  configurarItemMenu(Shooter, 8, generosSelecionados, menuGenero);
  configurarItemMenu(Simulacao, 9, generosSelecionados, menuGenero);
  configurarItemMenu(Terror, 10, generosSelecionados, menuGenero);
  configurarItemMenu(Luta, 11, generosSelecionados, menuGenero);
}
// Configurar ação de clique para os itens do menu
private void configurarItemMenu(MenuItem menuItem, int index, List<Integer> listaSelecionados, MenuButton menuButton) {
  menuItem.setOnAction(event -> {
      if (listaSelecionados.contains(index)) {
          listaSelecionados.remove(Integer.valueOf(index));
      } else {
          listaSelecionados.add(index);
      }
      menuButton.setText(menuItem.getText());
      exibirSelecoes();
  });
}

private void exibirSelecoes() {
  System.out.println("Seleção atual de plataformas: " + plataformasSelecionadas);
  System.out.println("Seleção atual de gêneros: " + generosSelecionados);
}
}
