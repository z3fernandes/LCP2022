
public class Exercicio7 {
  public double x;
  public double y;
  public double z;
  public double w;
  public double value;

  public Exercicio7(double x, double y, double z, double w) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.w = w;
    value = this.calc(x, y, z, w);
  }

  public Exercicio7(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    value = this.calc(x, y, z);
  }

  public Exercicio7(double x, double y) {
    this.x = x;
    this.y = y;
    value = this.calc(x, y);
  }

  public Exercicio7(double x) {
    this.x = x;
    value = this.calc(x);
  }

  public double calc(double x) {
    return x;
  }

  public double calc(double x, double y) {
    return x * Math.pow(y, 2);
  }

  public double calc(double x, double y, double z) {
    return x * Math.pow(y, 2) * Math.pow(z, 3);
  }

  public double calc(double x, double y, double z, double w) {
    return x * Math.pow(y, 2) * Math.pow(z, 3) * Math.pow(w, 4);
  }
}
