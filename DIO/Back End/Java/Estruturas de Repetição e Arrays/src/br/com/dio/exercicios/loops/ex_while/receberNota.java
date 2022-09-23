package br.com.dio.exercicios.loops.ex_while;

/*Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class receberNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Digite uma nota de 0 à 10: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida! Digite novamente: ");
            nota = sc.nextInt();
        }
    }
}
