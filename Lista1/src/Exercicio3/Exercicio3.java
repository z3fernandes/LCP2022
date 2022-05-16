package Exercicio3;

public class Exercicio3 {

    public void run() {
        Funcionario jose = new Funcionario("jose", 15, 2000.0);
        calcularContribuicao(jose);
        System.out.println(jose);

        Funcionario leticia = new Funcionario("leticia", 32, 3000.0);
        calcularContribuicao(leticia);
        System.out.println(leticia);

        Funcionario gustavo = new Funcionario("gustavo", 48, 4000.0);
        calcularContribuicao(gustavo);
        System.out.println(gustavo);

        Funcionario mey = new Funcionario("mey", 53, 5000.0);
        calcularContribuicao(mey);
        System.out.println(mey);

        Funcionario rambo = new Funcionario("rambo", 65, 30000.0);
        calcularContribuicao(rambo);
        System.out.println(rambo);

    }

    public void calcularContribuicao(Funcionario funcionario) {
        if (funcionario.getIdade() <= 30) {
            funcionario.setContribuicaoFuncionario(0.20);
            funcionario.setContribuicaoEmpresa(0.18);

        } else if (funcionario.getIdade() <= 40) {
            funcionario.setContribuicaoFuncionario(0.18);
            funcionario.setContribuicaoEmpresa(0.15);

        } else if (funcionario.getIdade() <= 50) {
            funcionario.setContribuicaoFuncionario(0.12);
            funcionario.setContribuicaoEmpresa(0.15);

        } else if (funcionario.getIdade() <= 60) {
            funcionario.setContribuicaoFuncionario(0.07);
            funcionario.setContribuicaoEmpresa(0.10);

        } else {
            funcionario.setContribuicaoFuncionario(0.03);
            funcionario.setContribuicaoEmpresa(0.04);

        }

    }
}
