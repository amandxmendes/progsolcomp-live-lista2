/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma (utilize while).
 * Data: 09/05/2023
 */

package Exercicios;

public class Ex13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
