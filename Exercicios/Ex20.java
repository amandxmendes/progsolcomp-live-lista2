/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo usuário, leia o peso de cada pessoa, também digitada pelo usuário, que entra no elevador até que a carga máxima seja atingida ou o número máximo de pessoas seja atingido (utilize do /while)
 * Data: 09/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = sc.nextInt();
        System.out.print("Digite a quantidade máxima de pessoas que podem entrar no elevador: ");
        int pessoasMaxima = sc.nextInt();
        int cargaAtual = 0;
        int pessoasAtuais = 0;
        do {
            System.out.print("Digite o peso da pessoa que está entrando no elevador: ");
            int peso = sc.nextInt();
            cargaAtual += peso;
            pessoasAtuais++;
        } while (cargaAtual < cargaMaxima && pessoasAtuais < pessoasMaxima);
        System.out.println("O elevador está com " + pessoasAtuais + " pessoas e " + cargaAtual + " kg de carga");
        sc.close();
    }

}
