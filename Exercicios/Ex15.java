/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        System.out.println("Matriz preenchida com zeros: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
