package Exercicio5;

public class LivroPago extends Livro {
  private double valor;

  public LivroPago(String titulo, double valor) {
    super(titulo);
    this.valor = valor;
  }

  @Override
  public void setTitulo(String titulo) {
    super.titulo = titulo;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Livro Pago: " + this.titulo + ", R$ " + String.format("%,.2f", valor);
  }
}
