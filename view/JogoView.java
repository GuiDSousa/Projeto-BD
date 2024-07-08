package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class JogoView {
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
   * Elemento: lblTitulo
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o título do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblTitulo;
  /*
   * Elemento: lblDataLancamento
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a data de lançamento do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblDataLancamento;
  /*
   * Elemento: lblGenero
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o(s) gênero(s) do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblGenero;
  /*
   * Elemento: lblPlataforma
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a(s) plataforma(s) do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblPlataforma;
  /*
   * Elemento: txtSinopse
   * Tipo: TextArea
   * Visível: true
   * Objetivo: Exibir a sinopse do jogo
   * Observações: Nenhuma
   */
  @FXML TextArea txtSinopse;
  /*
   * Elemento: lblNotaCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota da critica do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblNotaCritica;
  /*
   * Elemento: lblNotaUsuario
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota dos Usuarios do jogo
   * Observações: Média das notas dos usuários
   */
  @FXML Label lblMediaUsuario;
  /*
   * Elemento: lblComentarioCritica
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o comentário da crítica do jogo
   * Observações: Nenhuma
   */
  @FXML Label lblComentarioCritica;
  /*
   * Elemento: btnAddReview
   * Tipo: Button
   * Visível: true
   * Objetivo: Direciona o usuário para a tela de adicionar review do jogo em questão
   * Observações: Deve abrir uma nova tela e não fechar a atual
   */
  @FXML Button btnAddReview;
  /*
   * Elemento: txtComentarioUsuario_1 a 3
   * Tipo: TextArea
   * Visível: true
   * Objetivo: Exibir os comentários dos usuários
   * Observações: Nenhuma
   */
  @FXML TextArea txtComentarioUsuario_1;
  @FXML TextArea txtComentarioUsuario_2;
  @FXML TextArea txtComentarioUsuario_3;
  /*
   * Elemento: lblNotaUsuario_1 a 3
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir a nota dos usuários
   * Observações: Nenhuma
   */
  @FXML Label lblNotaUsuario_1;
  @FXML Label lblNotaUsuario_2;
  @FXML Label lblNotaUsuario_3;
  /*
   * Elemento: lblNomeUsuario_1 a 3
   * Tipo: Label
   * Visível: true
   * Objetivo: Exibir o nome do usuário
   * Observações: Nenhuma
   */
  @FXML Label lblNomeUsuario_1;
  @FXML Label lblNomeUsuario_2;
  @FXML Label lblNomeUsuario_3;

}
