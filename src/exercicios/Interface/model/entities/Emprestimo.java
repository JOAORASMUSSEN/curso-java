package exercicios.Interface.model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataPrevistaDevolucao;
    private Boolean ativo;

    public Emprestimo(){
    }

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataPrevistaDevolucao, Boolean ativo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.ativo = ativo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void registraDevolução(){
        setAtivo(true);
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Boolean estaAtrasado(LocalDate dataHoje){
        if(dataHoje.isAfter(this.dataPrevistaDevolucao)){
            return false;
        }
        return true;
    }

    public long calcularDiasAtraso(LocalDate dataHoje){
        if(dataHoje.isAfter(dataPrevistaDevolucao)){
            return ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataHoje);
        }
        return 0;
    }

}
