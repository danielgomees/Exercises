package br.com.dio.exercicios.arrays.multidimensionais;

/*Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine
o menor número da matriz e a sua posição(linha, coluna).*/

import java.util.Random;

public class arrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();

        int menorNumero = 9;
        int linha = 0, coluna = 0;
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int numero = random.nextInt(9);
                matriz[i][j] = numero;

                if (numero < menorNumero) {
                    menorNumero = numero;
                    linha = i+1;
                    coluna = j+1;
                }
            }
        }

        System.out.println("Matriz " + matriz.length + "x"  + matriz.length + ": ");

        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("O maior número é " + menorNumero + ", localizado na coluna " + coluna + " linha " + linha);

    }
}
