import java.util.Scanner;

public class Exercicio2 {
    private int number1;
    private int number2;
    private int number3;

    public void run(Scanner scanner) {
        readNumber(scanner);
        printSum();
        printProduct();
        printAvg();
        printOrdered();
    }

    private void readNumber(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        this.setNumber1(value);

        System.out.print("Insira o segundo número: ");
        value = scanner.nextInt();
        scanner.nextLine();
        this.setNumber2(value);

        System.out.print("Insira o terceiro número: ");
        value = scanner.nextInt();
        scanner.nextLine();
        this.setNumber3(value);
    }

    private void printSum() {
        int soma = (number1 + number2 + number3);
        System.out.println("A soma dos três numeros é: " + soma);
    }

    private void printProduct() {
        int produto = (number1 * number2 * number3);
        System.out.println("O produto dos três numeros é: " + produto);
    }

    private void printAvg() {
        int media = (number1 + number2 + number3) / 3;
        System.out.println("A média dos três numeros é: " + media);
    }

    private void printOrdered() {
        System.out.print("A ordenação dos números é: ");
        if (number1 <= number2 && number1 <= number3) {
            System.out.print(number1 + "; ");
            if (number2 <= number3) {
                System.out.print(number2 + "; ");
                System.out.print(number3);
            } else {
                System.out.print(number3 + "; ");
                System.out.print(number2);
            }
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.print(number2 + "; ");
            if (number1 <= number3) {
                System.out.print(number1 + "; ");
                System.out.print(number3);
            } else {
                System.out.print(number3 + "; ");
                System.out.print(number1);
            }
        } else {
            System.out.print(number3 + "; ");
            if (number1 <= number2) {
                System.out.print(number1 + "; ");
                System.out.print(number2);
            } else {
                System.out.print(number2 + "; ");
                System.out.print(number1);
            }
        }

    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

}
