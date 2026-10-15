package exercicios.Interface.model.entities;

import java.time.LocalDate;

public class Professor extends Usuario{

    private String registroFuncional;
    private String departamento;

    public Professor(){
    }

    public Professor(String nome, Integer id, String email, String registroFuncional, String departamento) {
        super(nome, id, email);
        this.registroFuncional = registroFuncional;
        this.departamento = departamento;
    }

    public String getRegistroFuncional() {
        return registroFuncional;
    }

    public void setRegistroFuncional(String registroFuncional) {
        this.registroFuncional = registroFuncional;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5;
    }

    @Override
    public int getPrazoEmprestimo() {
        return 14;
    }

}
