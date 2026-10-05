package exercicios.Arrays.Application;

import exercicios.Arrays.Entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Products> produtos = new ArrayList<>();

        int op = 0;
        while(op != 4){
            System.out.println("Lista de compras:");
            System.out.println("1 - adicionar produto");
            System.out.println("2 - remover produto");
            System.out.println("3 - listar produtos");
            System.out.println("4 - Sair");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
                    System.out.print("Qual o nome do produto que será adicionado? ");
                    String nome = scanner.nextLine();

                    System.out.print("Qual o preço desse produto? ");
                    double preco = scanner.nextDouble();

                    produtos.add(new Products(nome, preco));
                    break;
                case 2:
                    if(produtos.isEmpty()){
                        System.out.println("A lista já está vazia");
                    }else{
                        System.out.println("Produtos atuais: ");
                        for(int i = 0; i < produtos.size(); i++){
                            System.out.println((i+1)+"-"+produtos.get(i));
                        }
                        System.out.print("Digite o número do item que deseja remover: ");
                        int indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                       produtos.remove(indice);
                    }
                    break;
                case 3:
                    if(produtos.isEmpty()){
                        System.out.println("A lista está vazia");
                    }else{
                        for(Products produto : produtos){
                            System.out.print(produto + " ");
                        }
                    }
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
}
