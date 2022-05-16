package Exercicio6;

public class Circulo implements Geometria {
  private double raio;
  private double area;
  private double perimetro;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public void defineArea() {
    area = Math.PI * raio * raio;
  }

  @Override
  public void definePerimetro() {
    perimetro = 2 * Math.PI * raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public String toString() {
    return "Raio: " + String.format("%,.2f", this.raio) + ", Área: " + String.format("%,.2f", area) + ", Perímetro: "
        + String.format("%,.2f", perimetro);
  }
}