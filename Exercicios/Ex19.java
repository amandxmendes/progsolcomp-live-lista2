/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, digitado pelo usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o volume inicial do gás em cm³: ");
        int volume = sc.nextInt();
        int segundos = 0;
        while (volume <= 1000) {
            volume *= 2;
            segundos++;
        }
        System.out.println("Tempo necessário para que o volume seja maior que 1000 cm³: " + segundos + " segundos");
        sc.close();
    }
}
