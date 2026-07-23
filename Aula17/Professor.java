package Aula17;

public class Professor extends Pessoa{
    private Double salarioBase;
    private Double salarioTitulacao;

    public Professor (String nome, Integer idade, Double salarioBase, Double salarioTitulacao){
        this.salarioBase = salarioBase;
        this.salarioTitulacao = salarioTitulacao;
        super(nome, idade);
    }

    public Double calcularSalario(){
        return salarioBase + salarioTitulacao;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salário Calculado: " + calcularSalario());
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário de Titulação: " + salarioTitulacao);
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getSalarioTitulacao() {
        return salarioTitulacao;
    }

    public void setSalarioTitulacao(Double salarioTitulacao) {
        this.salarioTitulacao = salarioTitulacao;
    }
}
