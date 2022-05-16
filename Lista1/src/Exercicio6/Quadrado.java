package Exercicio6;

public class Quadrado implements Geometria {
  private double lado;
  private double area;
  private double perimetro;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public void defineArea() {
    area = lado * lado;
  }

  @Override
  public void definePerimetro() {
    perimetro = lado * 4;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  @Override
  public String toString() {
    return "Lado: " + String.format("%,.2f", this.lado) + ", Área: " + String.format("%,.2f", area) + ", Perímetro: "
        + String.format("%,.2f", perimetro);
  }

}
