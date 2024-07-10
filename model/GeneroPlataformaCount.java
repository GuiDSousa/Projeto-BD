package model;

// Usado pela classe ConsultasAvancadasDAO para mostrar numero de jogos por genero em uma determinada plataforma
public class GeneroPlataformaCount {
  private String nomeGenero;
  private int count;

  // Construtor, getters e setters
  public GeneroPlataformaCount(String nomeGenero, int count) {
      this.nomeGenero = nomeGenero;
      this.count = count;
  }

  // Getters e setters
  public String getNomeGenero() {
    return nomeGenero;
  }

  public void setNomeGenero(String nomeGenero) {
    this.nomeGenero = nomeGenero;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
