package exercicios.Interface.model.entities;

import exercicios.Interface.model.entities.enums.LivroStatus;

public class Livro implements Emprestavel{

    private String livro;
    private String autor;
    private Integer id;
    private LivroStatus status;

    public Livro(){
    }

    public Livro(String livro, String autor, Integer id, LivroStatus status) {
        this.livro = livro;
        this.autor = autor;
        this.id = id;
        this.status = status;
    }

    @Override
    public String getTitulo(){
        return this.livro;
    }

    @Override
    public boolean isDisponivel() {
        return this.status == LivroStatus.DISPONIVEL;
    }

    @Override
    public void emprestar() {
        this.status = LivroStatus.INDISPONIVEL;
    }

    @Override
    public void devolver() {
        this.status = LivroStatus.DISPONIVEL;
    }


    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LivroStatus getStatus() {
        return status;
    }

    public void setStatus(LivroStatus status) {
        this.status = status;
    }
}
