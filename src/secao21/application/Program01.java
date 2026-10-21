package secao21.application;

import secao21.dominio.Pessoa;

public class Program01 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "João", "joao@gmail.com");
        Pessoa p2 = new Pessoa(2, "Carlos", "carlos@gmail.com");
        Pessoa p3 = new Pessoa(3, "Miguel", "miguel@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
