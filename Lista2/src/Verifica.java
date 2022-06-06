//import java.util.Scanner;

public class Verifica {
    public void run() {
        String regex = "[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[X|0-9]";
        // Scanner scanner = new Scanner(System.in);
        // String rg = scanner.nextLine();
        String rg = "01.234.567-X";
        // scanner.close();
        boolean boo1 = rg.matches(regex);
        if (boo1) {
            System.out.println("SEU RG: " + rg + " ESTÁ DE ACORDO!");
        } else {
            System.out.println("SEU RG: " + rg + " NÃO EH VALIDO NÃO!");
        }
    }
}
