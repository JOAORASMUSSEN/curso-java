package secao10.application;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int negativeNumbers = 0;
        System.out.println("Main diagonal: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    System.out.print(matrix[i][j] + " ");
                }

                if(matrix[i][j] < 0){
                    negativeNumbers++;
                }
            }
        }
        System.out.println();
        System.out.println("Negative numbers: " + negativeNumbers);

        scanner.close();
    }
}
