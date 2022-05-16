package Exercicio3;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private double contribuicaoFuncionario;
    private double contribuicaoEmpresa;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioLiquido() {
        if (salario < 5000) {
            return salario * (1 - contribuicaoFuncionario);
        } else {
            return salario - (5000 * contribuicaoFuncionario);
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getContribuicaoEmpresa() {
        return contribuicaoEmpresa;
    }

    public void setContribuicaoEmpresa(double contribuicaoEmpresa) {
        this.contribuicaoEmpresa = contribuicaoEmpresa;
    }

    public double getContribuicaoFuncionario() {
        return contribuicaoFuncionario;
    }

    public void setContribuicaoFuncionario(double contribuicaoFuncionario) {
        this.contribuicaoFuncionario = contribuicaoFuncionario;
    }

    @Override
    public String toString() {
        String _nome = "Nome: " + this.nome;
        String _idade = "Idade: " + this.idade;
        String _salario = "Salário: " + this.salario;
        String _salarioLiquido = "Salário Líquido: " + this.getSalarioLiquido();
        String _contribuicaoFuncionario = "Contribuicão Funcionário: " + this.contribuicaoFuncionario;
        String _contribuicaoEmpresa = "Contribuicão Empresa: " + this.contribuicaoEmpresa;

        return _nome + "\n" + _idade + "\n" + _salario + "\n" + _salarioLiquido + "\n" + _contribuicaoFuncionario + "\n"
                + _contribuicaoEmpresa;
    }
}
