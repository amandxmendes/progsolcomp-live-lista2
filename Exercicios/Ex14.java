/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        System.out.println("Vetor preenchido com zeros: " + Arrays.toString(vetor));
    }
}
