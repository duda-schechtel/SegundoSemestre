package Aula17;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno (String nome, Integer idade, String curso){
        this.curso = curso;
        super (nome, idade);
    }

    public void Matricula(String curso){
        System.out.println("Você fez matrícula");
    }
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Curso: "+ curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
