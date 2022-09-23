package br.com.dio.exercicios.arrays.unidimensionais;

/*Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num
vetor. Ao final, mostre os números e seus sucessores.*/

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNumeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
