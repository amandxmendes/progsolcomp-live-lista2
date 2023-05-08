/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 08/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close();
    }

}
