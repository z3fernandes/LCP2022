package Exercicio4;

public class Exercicio4 {
  public void Run() {
    Dog timmy = new Dog("Timmy", 1);
    timmy.Bark();
    timmy.Run();

    Cat tom = new Cat("Tom", 3);
    tom.Meow();
    tom.Jump();

    Bird toninho = new Bird("Toninho", 2);
    toninho.Chirp();
    toninho.Fly();
  }
}
