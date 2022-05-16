package Exercicio5;

public class LivroGratuito extends Livro {

  public LivroGratuito(String titulo) {
    super(titulo);
  }

  @Override
  public void setTitulo(String titulo) {
    super.titulo = titulo;
  }

  @Override
  public String toString() {
    return "Livro Gratuito: " + this.titulo;
  }
}
