/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido conforme a seguir (utilize for)
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
        sc.close();
    }
}
