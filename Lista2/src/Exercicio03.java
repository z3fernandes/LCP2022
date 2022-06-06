public class Exercicio03 {

    public void run() {
        String palindromo = "SUBINOONIBUS";

        for (int i = 0; i < (palindromo.length() / 2); i++) {
            int leftIdx = i;
            int rightIdx = palindromo.length() - i - 1;
            char left = palindromo.charAt(leftIdx);
            char right = palindromo.charAt(rightIdx);

            if (left != right) {
                System.out.println(palindromo + " NÃO EH UM PALÍNDROMO!");
                return;
            }
        }
        System.out.println(palindromo + " EH UM PALÍNDROMO!");
        return;
    }
}