public class Exercicio02 {

    public void run() {
        String ARREI1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String ARREI2 = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String frase_mod = "";
        int max = 0;
        if (ARREI1.length() > ARREI2.length()) {
            max = ARREI1.length();
        } else {
            max = ARREI2.length();
        }

        for (int i = 0; i < max; i++) {
            if (i < ARREI1.length()) {
                frase_mod += ARREI1.charAt(i);
            }
            if (i < ARREI2.length()) {
                frase_mod += ARREI2.charAt(i);
            }
        }
        System.out.println(frase_mod);
    }
}