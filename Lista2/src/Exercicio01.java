import java.util.Arrays;
import java.util.List;

public class Exercicio01 {

    public void run() {
        String frase = "luIZ pHiLIppE DE orleAnS e braGANca";
        String frase_mod = "";
        String[] palavras = frase.split(" ");
        List<String> proibidas = Arrays.asList("de", "da", "do", "e");

        for (String palavra : palavras) {
            if (proibidas.contains(palavra.toLowerCase())) {
                frase_mod += palavra.toLowerCase() + " ";
            } else {
                frase_mod += iniciais_maiusculas(palavra.toLowerCase()) + " ";
            }
        }
        System.out.println(frase_mod);
    }

    public static String iniciais_maiusculas(String frasee) {
        String frase_mod = "";

        for (int i = 0; i < frasee.length(); i++) {
            if (i == 0) {
                frase_mod += Character.toUpperCase(frasee.charAt(i));
            } else {
                frase_mod += frasee.charAt(i);
            }
        }
        return frase_mod;
    }
}
