package exercicios.Interface.model.entities;

public interface Emprestavel {

    String getTitulo();
    boolean isDisponivel();
    void emprestar();
    void devolver();

}
