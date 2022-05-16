package Exercicio4;

public class Dog extends Animal {

  public Dog(String name, int age) {
    super(name, age);
  }

  public void Bark() {
    System.out.println("Au Au!");
  }

  public void Run() {
    System.out.println(this.getName() + " está correndo!");
  }

}
