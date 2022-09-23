package br.com.dio.exercicios.loops.ex_for;

/*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:*/

/*Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50*/

import java.util.Scanner;

public class geradorTabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Informe o número que deseja ver a tabuada: ");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " X " + i + " = " + numero * i);
                }
                break;
            } else {
                System.out.println("Digite um número entre 1 a 10!");
            }
        }

    }
}
