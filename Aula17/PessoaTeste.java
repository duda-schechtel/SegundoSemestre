package Aula17;

public class PessoaTeste {
    static void main(String[] args) {
        Professor professor1 = new Professor("Cassio", 21, 555.0,555.0);
        professor1.calcularSalario();
        professor1.imprimirDados();
        Aluno aluno1 = new Aluno("Duda", 16,"Info");
        aluno1.matricula("Info");
        aluno1.imprimirDados();
    }
}
