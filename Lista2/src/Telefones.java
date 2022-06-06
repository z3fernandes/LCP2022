public class Telefones {
    public void run() {
        String tele = "(19) 12345-6789";
        String regex_cel = "\\([0-9]{2}\\) [0-9]{5}-[0-9]{4}";
        String regex_tel = "\\([0-9]{2}\\) [0-9]{4}-[0-9]{4}";

        if (tele.matches(regex_cel))
            System.out.println(tele + " é um número de celular");
        if (tele.matches(regex_tel))
            System.out.println(tele + " é um número de telefone");

        String[] num = tele.split(" ");
        System.out.println("O DDD é " + num[0] + " e o telefone é " + num[1]);
        ;
    }
}
