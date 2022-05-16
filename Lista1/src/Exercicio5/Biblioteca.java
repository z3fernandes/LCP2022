package Exercicio5;

public class Biblioteca {
  public void Run() {
    LivroPago cleanCode = new LivroPago("Clean Code", 80.75);
    LivroGratuito javaParaIniciantes = new LivroGratuito("Java para Iniciantes");

    System.out.println(cleanCode);
    System.out.println(javaParaIniciantes);
  }
}
