package br.com.dio.exercicios.loops.ex_dowhile;

/*Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e
a quantidade de números impares.*/

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int n;
        int contador = 1;
        int pares = 0;
        int impares = 0;

        System.out.print("Quantos números quer digitar? ");
        n = sc.nextInt();

        do {
            System.out.print("Digite o " + contador + "° número: ");
            numero = sc.nextInt();
            contador++;

                if ((numero % 2) == 0) {
                pares++;
                } else {
                impares++;
                }

        } while (contador <= n);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }
}
