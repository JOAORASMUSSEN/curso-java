package exercicios.Interface.model.entities;

import java.time.LocalDate;

public class Aluno extends Usuario{

    private String matricula;
    private String curso;

    public Aluno(){
    }

    public Aluno(String nome, Integer id, String email, String matricula, String curso) {
        super(nome, id, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int getLimiteEmprestimos() {
        return 3;
    }

    @Override
    public int getPrazoEmprestimo() {
        return 7;
    }
}
