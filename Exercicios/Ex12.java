/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
 * Data: 09/05/2023
 */

package Exercicios;

public class Ex12 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
