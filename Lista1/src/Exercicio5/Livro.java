package Exercicio5;

public abstract class Livro {
  protected String titulo;

  public Livro(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public abstract void setTitulo(String titulo);
}
