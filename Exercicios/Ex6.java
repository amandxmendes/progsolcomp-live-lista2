/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0 a 100.
 * Data: 08/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota >= 0 && nota <= 49) {
            System.out.println("Conceito: Insuficiente");
        } else if (nota >= 50 && nota <= 64) {
            System.out.println("Conceito: Regular");
        } else if (nota >= 65 && nota <= 84) {
            System.out.println("Conceito: Bom");
        } else if (nota >= 85 && nota <= 100) {
            System.out.println("Conceito: Ótimo");
        } else {
            System.out.println("Nota inválida");
        }

        sc.close();
    }
}

