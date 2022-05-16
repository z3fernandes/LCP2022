package Exercicio4;

public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  public void Meow() {
    System.out.println("Miau!");
  }

  public void Run() {
    System.out.println(this.getName() + " está correndo!");
  }

  public void Jump() {
    System.out.println(this.getName() + " pulou!");
  }
}
