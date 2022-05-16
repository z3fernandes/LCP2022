package Exercicio4;

public class Bird extends Animal {

  public Bird(String name, int age) {
    super(name, age);
  }

  public void Chirp() {
    System.out.println("Piu!");
  }

  public void Fly() {
    System.out.println(this.getName() + " está voando!");
  }
}
