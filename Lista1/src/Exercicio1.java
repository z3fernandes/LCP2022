import java.util.Scanner;

public class Exercicio1 {
    private int number;

    public void run(Scanner scanner) {
        boolean result = this.readNumber(scanner);
        if (result) {
            this.print();
        } else {
            System.out.println("Insira um número entre 1 e 20!");
        }
    }

    private boolean readNumber(Scanner scanner) {
        System.out.print("Insira um número: ");

        int value = scanner.nextInt();
        scanner.nextLine();

        if (value < 1 || value > 20)
            return false;
        this.setNumber(value);
        return true;
    }

    private void print() {
        for (int i = 1; i <= number; i++) {
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}