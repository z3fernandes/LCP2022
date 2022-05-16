package Exercicio6;

public class Exercicio6 {
  public void Run() {
    Quadrado quadrado1 = new Quadrado(3);
    quadrado1.defineArea();
    quadrado1.definePerimetro();
    System.out.println(quadrado1 + "\n");

    Quadrado quadrado2 = new Quadrado(5);
    quadrado2.defineArea();
    quadrado2.definePerimetro();
    System.out.println(quadrado2 + "\n");

    Retangulo retangulo1 = new Retangulo(12, 2);
    retangulo1.defineArea();
    retangulo1.definePerimetro();
    System.out.println(retangulo1 + "\n");

    Retangulo retangulo2 = new Retangulo(3, 4);
    retangulo2.defineArea();
    retangulo2.definePerimetro();
    System.out.println(retangulo2 + "\n");

    Triangulo equilatero = new Triangulo(3.0);
    equilatero.defineArea();
    equilatero.definePerimetro();
    System.out.println(equilatero + "\n");

    Triangulo isosceles = new Triangulo(3.0, 4.0);
    isosceles.defineArea();
    isosceles.definePerimetro();
    System.out.println(isosceles + "\n");

    Triangulo escaleno = new Triangulo(3.0, 4.0, 5.0);
    escaleno.defineArea();
    escaleno.definePerimetro();
    System.out.println(escaleno + "\n");

    Circulo circulo1 = new Circulo(3);
    circulo1.defineArea();
    circulo1.definePerimetro();
    System.out.println(circulo1 + "\n");

    Circulo circulo2 = new Circulo(3);
    circulo2.defineArea();
    circulo2.definePerimetro();
    System.out.println(circulo2 + "\n");
  }
}
