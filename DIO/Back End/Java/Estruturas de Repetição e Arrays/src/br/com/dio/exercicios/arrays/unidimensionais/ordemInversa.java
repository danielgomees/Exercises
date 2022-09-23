package br.com.dio.exercicios.arrays.unidimensionais;

/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/

import java.util.Scanner;

public class ordemInversa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[6];

        int count = 0;

        for(int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i+1) + "° valor: ");
            vetor[i] = sc.nextInt();
            count++;
        }

        /*System.out.println(vetor.length);*/

        count = 0;

        System.out.print("Vetor: ");

        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor inverso: ");

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
