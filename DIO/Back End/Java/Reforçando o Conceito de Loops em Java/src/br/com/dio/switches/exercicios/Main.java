package br.com.dio.switches.exercicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (L % 2 == 0 || C % 2 == 0)
            System.out.println(0);
        else                                               //complete o código nos espaços em branco
            System.out.println(1);
        sc.close();
    }
}
