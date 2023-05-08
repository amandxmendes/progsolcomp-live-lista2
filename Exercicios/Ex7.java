/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que calcule o valor da hospedagem de um hotel.
 * Data: 08/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = sc.nextInt();

        double valorDiaria = 60.0;
        double taxaServico;

        if (numDiarias > 15) {
            taxaServico = 5.5;
        } else if (numDiarias == 15) {
            taxaServico = 6.0;
        } else {
            taxaServico = 8.0;
        }

        double valorHospedagem = numDiarias * valorDiaria + numDiarias * taxaServico;

        System.out.printf("O valor total da hospedagem é R$ %.2f", valorHospedagem);

        sc.close();
    }
}

