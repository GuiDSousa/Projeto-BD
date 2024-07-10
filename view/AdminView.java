package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import controller.ControleJogo;
import controller.ControleJogoGenero;
import controller.ControleJogoPlataforma;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.awt.image.BufferedImage;
import java.io.File;

import util.*;

public class AdminView {
  /*
   * Elemento: btnSelecionarImagem
   * Tipo: Button
   * Visível: true
   * Objetivo: Selecionar a imagem do jogo
   * Observações: Deve selecionar o arquivo de imagem e exibir a imagem no imgJogo
   */
  @FXML
  Button btnSelecionarImagem;

  /*
   * Elemento: txtNomeJogo
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o nome do jogo
   * Observações: Nenhuma
   */
  @FXML
  TextField txtNomeJogo;
  /*
   * Elemento: txtDataLancamento
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a data de lançamento do jogo
   * Observações: dd/mm/aaaa
   */
  @FXML
  TextField txtDataLancamento;
  /*
   * Elemento: txtNotaCritica
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a nota da crítica
   * Observações: De 1 a 100
   */
  @FXML
  TextField txtNotaCritica;
  /*
   * Elemento: txtSinopse
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber a sinopse do jogo
   * Observações: Definir máximo de caracteres
   */
  @FXML
  TextField txtSinopse;
  /*
   * Elemento: txtComentarioCritica
   * Tipo: TextField
   * Visível: true
   * Objetivo: Receber o comentário da crítica
   * Observações: Definir máximo de caracteres
   */
  @FXML
  TextField txtComentarioCritica;
  /*
   * Elemento: lblErro
   * Tipo: Label
   * Visível: false
   * Objetivo: Exibir mensagem de erro
   * Observações: Deve se tornar visivel e retornar uma mensagem com o erro
   * específico
   */
  @FXML
  Label lblErro;
  /*
   * Elemento: lblDataLancamento
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a data de lançamento recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblDataLancamento;
  /*
   * Elemento: lblNotaCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota da crítica recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblNotaCritica;
  /*
   * Elemento: lblSinopse
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a sinopse recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  TextArea lblSinopse;
  /*
   * Elemento: lblComentarioCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o comentário da crítica recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblComentarioCritica;
  /*
   * Elemento: imgJogo
   * Tipo: ImageView
   * Visível: true
   * Objetivo: Exibir a imagem do jogo
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  ImageView imgJogo;
  /*
   * Elemento: lblNomeJogo
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o nome do jogo recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblNomeJogo;
  /*
   * Elemento: lblGenero
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o gênero do jogo recebido
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblGenero;
  /*
   * Elemento: lblPlataforma
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a plataforma do jogo recebida
   * Observações: Vista após clicar no botão revisão
   */
  @FXML
  Label lblPlataforma;
  /*
   * Elemento: menuPlataforma
   * Tipo: MenuButton
   * Visível: true
   * Objetivo: Receber a plataforma do jogo
   * Observações: Nenhuma
   */
  @FXML
  MenuButton menuPlataforma;
  /*
   * Elemento: PlayStation_1 a GameBoy
   * Tipo: MenuItem
   * Visível: true
   * Objetivo: Receber a plataforma do jogo
   * Observações: Ao clicar em um dos botões, a plataforma é enviada para o
   * controller
   */
  @FXML
  CheckMenuItem PlayStation_1;
  @FXML
  CheckMenuItem PlayStation_2;
  @FXML
  CheckMenuItem PC;
  @FXML
  CheckMenuItem Nintendo_64;
  @FXML
  CheckMenuItem GameCube;
  @FXML
  CheckMenuItem Xbox;
  @FXML
  CheckMenuItem SuperNintendo;
  @FXML
  CheckMenuItem PolyStation;
  @FXML
  CheckMenuItem MasterSystem;
  @FXML
  CheckMenuItem GameBoy;
  /*
   * Elemento: menuGenero
   * Tipo: MenuButton
   * Visível: true
   * Objetivo: Receber o gênero do jogo
   * Observações: Nenhuma
   */
  @FXML
  MenuButton menuGenero;
  /*
   * Elemento: Acao a Luta
   * Tipo: MenuItem
   * Visível: true
   * Objetivo: Receber o gênero do jogo
   * Observações: Ao clicar em um dos botões, o gênero é enviado para o controller
   */
  @FXML
  CheckMenuItem Acao;
  @FXML
  CheckMenuItem Aventura;
  @FXML
  CheckMenuItem Corrida;
  @FXML
  CheckMenuItem Estrategia;
  @FXML
  CheckMenuItem Esporte;
  @FXML
  CheckMenuItem Fantasia;
  @FXML
  CheckMenuItem RPG;
  @FXML
  CheckMenuItem Shooter;
  @FXML
  CheckMenuItem Simulacao;
  @FXML
  CheckMenuItem Terror;
  @FXML
  CheckMenuItem Luta;

  /*
   * Elemento: btnRevisarJogo
   * Tipo: Button
   * Visível: true
   * Objetivo: Revisar o jogo
   * Observações: Deve exibir os dados do jogo para revisão
   */
  @FXML
  Button btnRevisarJogo;
  /*
   * Elemento: btnCadastrarJogo
   * Tipo: Button
   * Visível: true
   * Objetivo: Cadastrar o jogo
   * Observações: Deve enviar os dados do jogo para o banco de dados
   */
  @FXML
  Button btnCadastrarJogo;

  private BufferedImage imagemAtual;// guarda na memoria de execucao a imagem selecionada pelo usuario
  private byte[] bytesDaImagemAtual;/// guarda os bytes da imagem atual em memoria

  // guarda os valores inseridos nos texts fields na memoria
  private String tituloJogoAtual;
  private String sinopseJogoAtual;
  private String comentarioCriticaJogoAtual;
  private String stringNotaDaCritica;
  private int notaCriticaJogoAtual;
  private String dataLancamentoJogoAtual;

  private ControleJogo controleJogo = new ControleJogo();
  private ControleJogoGenero controleJogoGenero = new ControleJogoGenero();
  private ControleJogoPlataforma controleJogoPlataforma = new ControleJogoPlataforma();

  private List<Integer> plataformasSelecionadas = new ArrayList<>();
  private List<Integer> generosSelecionados = new ArrayList<>();

  public void initialize() {

    // Configurar as ações dos itens de menu
    configurarMenuItens();

    btnCadastrarJogo.setDisable(true);

  }

  private static Pattern DATE_PATTERN = Pattern.compile(
      "^\\d{2}/\\d{2}/\\d{4}$");

  public boolean isDataValida(String date) {
    return DATE_PATTERN.matcher(date).matches();
  }

  private void configurarMenuItens() {
    // Configurar itens do menu de plataforma
    configurarItemMenu(GameBoy, 1, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(GameCube, 2, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(MasterSystem, 3, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(Nintendo_64, 4, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(PC, 5, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(PlayStation_1, 6, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(PlayStation_2, 7, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(PolyStation, 8, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(SuperNintendo, 9, plataformasSelecionadas, menuPlataforma);
    configurarItemMenu(Xbox, 10, plataformasSelecionadas, menuPlataforma);

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
  private void configurarItemMenu(MenuItem menuItem, int index, List<Integer> listaSelecionados,
      MenuButton menuButton) {
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

  @FXML
  private void handleSelecionarImagem(ActionEvent event) {
    FileChooser menuEscolherArquivo = new FileChooser();

    File arquivoSelecionado = menuEscolherArquivo.showOpenDialog(null);
    menuEscolherArquivo.setTitle("Selecione uma imagem para a capa do jogo.");

    if (arquivoSelecionado != null) {
      try {
        imagemAtual = ManipularImagem.setImagemDimensao(arquivoSelecionado.getAbsolutePath(), 600, 600);

        bytesDaImagemAtual = ManipularImagem.getImgBytes(imagemAtual);
        ManipularImagem.exibirImagemNoImageView(this.bytesDaImagemAtual, this.imgJogo);

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      // exibe um alerta
      Alert alert = new Alert(AlertType.WARNING);
      alert.setTitle("Atenção!");
      alert.setHeaderText("Selecione uma imagem para a capa do jogo.");
      alert.showAndWait();
    } // fim do bloco
  }// fim do metodo handleSelecionarImagem

  @FXML
  private void handleRevisarJogo(ActionEvent event) {

    // coleta os valores digitados
    tituloJogoAtual = txtNomeJogo.getText();
    sinopseJogoAtual = txtSinopse.getText();
    comentarioCriticaJogoAtual = txtComentarioCritica.getText();
    stringNotaDaCritica = txtNotaCritica.getText();
    dataLancamentoJogoAtual = txtDataLancamento.getText();

    lblErro.setVisible(true);

    // valicao dos campos
    if (tituloJogoAtual.length() == 0 || sinopseJogoAtual.length() == 0 || comentarioCriticaJogoAtual.length() == 0
        || stringNotaDaCritica.length() == 0 || dataLancamentoJogoAtual.length() == 0) {
      lblErro.setText("Todos os campos devem ser preenchidos.");
      return;
    }

    // validacao do titulo
    if (tituloJogoAtual.length() > 0 && tituloJogoAtual.length() < 3 || tituloJogoAtual.length() > 100) {
      lblErro.setText("Título do Jogo: tamanho mínimo 3 caracteres, máximo 100.");
      return;
    }

    /// testar quando tiver jogos cadastrtados
    // if (controleJogo.isCadastrado(tituloJogoAtual)) {
    // lblErro.setText("Não é possível cadastrar o mesmo jogo duas vezes.");
    // return;
    // }

    // validacao da sinopse
    if (sinopseJogoAtual.length() > 0 && sinopseJogoAtual.length() < 10 || sinopseJogoAtual.length() > 100) {
      lblErro.setText("Sinopse: tamanho mínimo 10 caracteres, máximo 100.");
      return;
    }

    /// validacao do comentario da critica
    if (comentarioCriticaJogoAtual.length() > 0 && comentarioCriticaJogoAtual.length() < 3
        || comentarioCriticaJogoAtual.length() > 25) {
      lblErro.setText("Comentário Crítico: tamanho mínimo 3 carcteres, máximo 25.");
      return;
    }

    // validacao da data
    if (!isDataValida(dataLancamentoJogoAtual)) {
      lblErro.setText("Data inválida.");
      return;
    }

    // validacao da nota critica
    try {
      notaCriticaJogoAtual = Integer.valueOf(stringNotaDaCritica);

      if (notaCriticaJogoAtual < 0 || notaCriticaJogoAtual > 100) {
        lblErro.setText("Nota Crítica: dever ser um inteiro de 0 a 100.");
        return;
      }
    } catch (Exception e) {
      lblErro.setText("Nota Crítica: valor inválido.");
      return;
    }

    /// validacao plataforma
    if (plataformasSelecionadas.size() == 0) {
      lblErro.setText("Selecione, no mínimo, 1 plataforma.");
      return;
    }
    // validacao generos
    if (generosSelecionados.size() == 0) {
      lblErro.setText("Selecione, no mínimo, 1 gênero.");
      return;
    }

    if (imagemAtual == null) {
      lblErro.setText("Selecione a capa do jogo.");
      return;
    }

    lblErro.setText("");
    lblErro.setVisible(false);

    String stringPlataformas = getStringPlataformasSelecionados(this.plataformasSelecionadas);
    String stringGeneros = getStringGenerosSelecionados(this.generosSelecionados);

    // EXIBIR OS DADOS INSERIDOS PELO USUARIO NAS LABELS
    lblNomeJogo.setText(tituloJogoAtual);
    lblDataLancamento.setText(dataLancamentoJogoAtual);
    lblSinopse.setText(sinopseJogoAtual);
    lblNotaCritica.setText(String.valueOf(notaCriticaJogoAtual));
    lblComentarioCritica.setText(comentarioCriticaJogoAtual);
    lblPlataforma.setText(stringPlataformas);
    lblGenero.setText(stringGeneros);

    // desabilita os elementos para evitar inconsistencias
    btnSelecionarImagem.setDisable(true);

    menuGenero.setDisable(true);
    menuPlataforma.setDisable(true);

    txtComentarioCritica.setDisable(true);
    txtDataLancamento.setDisable(true);
    txtNomeJogo.setDisable(true);
    txtSinopse.setDisable(true);
    txtNotaCritica.setDisable(true);

    btnCadastrarJogo.setDisable(false);

  }// fim do metodo handleRevisarJogo

  @FXML
  private void handleCadastrarJogo(ActionEvent event) {

    btnCadastrarJogo.setDisable(true);
    String produtoraPadrao = "Crypta Nostalgica";

    lblErro.setVisible(true);
    System.out.println("Entrou no metodo");
    boolean inseriu = controleJogo.cadastrarNovoJogo(this.tituloJogoAtual, this.dataLancamentoJogoAtual,
        produtoraPadrao,
        this.sinopseJogoAtual, bytesDaImagemAtual, notaCriticaJogoAtual, comentarioCriticaJogoAtual);

    System.out.println("Terminou o cadastro.");
    if (inseriu) {

      System.out.println("Coletando ids");
      int[] idsGeneros = new int[generosSelecionados.size()];
      int[] idsPlataformas = new int[plataformasSelecionadas.size()];

      System.out.println("Generos selecionados");
      for (int i = 0; i < generosSelecionados.size(); i++) {
        idsGeneros[i] = generosSelecionados.get(i);
        System.out.println(idsGeneros[i]);
      }

      System.out.println("Plataformas selecionadas");
      for (int i = 0; i < plataformasSelecionadas.size(); i++) {
        idsPlataformas[i] = plataformasSelecionadas.get(i);
        System.out.println(idsPlataformas[i]);
      }

      controleJogoGenero.criarRelacoesJogoGeneros(this.tituloJogoAtual,
          idsGeneros);
      System.out.println("Criou as relacoes JogoGenero");

      controleJogoPlataforma.criarRelacoesJogoPlataforma(this.tituloJogoAtual,
          idsPlataformas);
      System.out.println("Criou as relacoes JogoPlataforma");

      lblErro.setText("Jogo cadastrado com sucesso!");
      return;
    } else {
      lblErro.setText("ERRO! O jogo não foi cadastrado");
    }
  }

  public String getStringGenerosSelecionados(List<Integer> listaDeGenerosSelecionados) {
    String stringGeneros = "";
    System.out.println(stringGeneros.length());
    for (int i = 0; i < listaDeGenerosSelecionados.size(); i++) {

      stringGeneros += RecuperarId.getGeneroString(listaDeGenerosSelecionados.get(i));

      if (stringGeneros.length() > 0) {
        stringGeneros += ", ";
      }

    }
    return stringGeneros;
  }

  public String getStringPlataformasSelecionados(List<Integer> listadePlataformasSelecionadas) {
    String stringPlataformas = "";
    for (int i = 0; i < listadePlataformasSelecionadas.size(); i++) {
      stringPlataformas += RecuperarId.getPlataformaString(listadePlataformasSelecionadas.get(i));

      if (stringPlataformas.length() > 0) {
        stringPlataformas += ", ";
      }
    }

    return stringPlataformas;
  }
}// fim da classe AdminView
