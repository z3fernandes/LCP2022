package Exercicio6;

public class Triangulo implements Geometria {
  private double x;
  private double y;
  private double z;
  private double area;
  private double perimetro;

  public Triangulo(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Triangulo(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Triangulo(double x) {
    this.x = x;
  }

  @Override
  public void defineArea() {
    if (y == 0 && z == 0) {
      area = (Math.sqrt(3) / 4) * Math.pow(x, 2);
      return;
    }

    if (z == 0) {
      area = (x * y) / 2;
      return;
    }

    double s = (x + y + z) / 2;
    area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
  }

  @Override
  public void definePerimetro() {
    perimetro = x + y + z;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  @Override
  public String toString() {
    String tipo;
    String lados;

    if (y == 0 && z == 0) {
      tipo = "Equilátero";
      lados = "Lados: " + String.format("%,.2f", x);

    } else if (z == 0) {
      tipo = "Isósceles";
      lados = "Lados: " + String.format("%,.2f", x) + ", " + String.format("%,.2f", y);

    } else {
      tipo = "Escaleno";
      lados = "Lados: " + String.format("%,.2f", x) + ", " + String.format("%,.2f", y) + ", "
          + String.format("%,.2f", z);
    }

    return tipo + ", " + lados + ", Área: " + String.format("%,.2f", area) + ", Perímetro: "
        + String.format("%,.2f", perimetro);
  }
}
