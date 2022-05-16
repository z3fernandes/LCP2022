package Exercicio6;

public class Retangulo implements Geometria {
  private double ladoMenor;
  private double ladoMaior;
  private double area;
  private double perimetro;

  public Retangulo(double ladoMenor, double ladoMaior) {
    this.ladoMenor = ladoMenor;
    this.ladoMaior = ladoMaior;
  }

  @Override
  public void defineArea() {
    area = ladoMenor * ladoMaior;
  }

  @Override
  public void definePerimetro() {
    perimetro = (ladoMenor * 2) + (ladoMaior * 2);
  }

  public double getLadoMenor() {
    return ladoMenor;
  }

  public void setLadoMenor(double ladoMenor) {
    this.ladoMenor = ladoMenor;
  }

  public double getLadoMaior() {
    return ladoMaior;
  }

  public void setLadoMaior(double ladoMaior) {
    this.ladoMaior = ladoMaior;
  }

  @Override
  public String toString() {
    String _ladoMenor = "Lado Menor: " + String.format("%,.2f", this.ladoMenor);
    String _ladoMaior = ", Lado Maior: " + String.format("%,.2f", this.ladoMaior);
    String _area = ", Área: " + String.format("%,.2f", area);
    String _per = ", Perímetro: " + String.format("%,.2f", perimetro);

    return _ladoMenor + _ladoMaior + _area + _per;
  }

}
