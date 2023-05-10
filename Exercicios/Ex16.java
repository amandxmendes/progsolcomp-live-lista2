/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while (numero >= 0) {
            System.out.print("Digite um número (digite um número negativo para sair): ");
            numero = sc.nextInt();
        }
        System.out.println("Programa finalizado.");
        sc.close();
    }
}
