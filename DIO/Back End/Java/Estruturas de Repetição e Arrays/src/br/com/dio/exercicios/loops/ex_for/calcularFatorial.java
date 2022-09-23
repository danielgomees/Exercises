package br.com.dio.exercicios.loops.ex_for;

/*Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120*/

import java.util.Scanner;

public class calcularFatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int fatorial;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        System.out.print(numero + "!" + " = ");
        fatorial = numero;

            for (int i = numero; i >= 1; i--) {
                System.out.print(i);

                if (i > 1) {
                    fatorial *= i - 1;
                    System.out.print(".");
                }
            }
        System.out.print(" = " + fatorial);

    }
}
