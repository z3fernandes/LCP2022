public class Exercicio8 {
  private boolean validate(int number) {
    int value = number;
    int length = 0;

    while (value > 0) {
      length++;
      value = value / 10;
    }

    int sum = 0;
    int num = number;

    while (num > 0) {

      int part = num % 10;
      sum = sum + ((int) Math.pow(part, length));
      num = num / 10;
    }

    return sum == number;
  }

  public void Run(int number) {
    if (this.validate(number)) {
      System.out.println("Atende!");
    } else {
      System.out.println("Não atende!");
    }
  }
}
