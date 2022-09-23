package br.com.dio.exercicios.loops.ex_dowhile;

/*Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;
        int maior = 0;

        System.out.println("Digite 5 números: ");
        do {
            numero = sc.nextInt();
            contador++;
            soma += numero;

            if (numero > maior)
                maior = numero;

        } while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/contador);

    }
}
