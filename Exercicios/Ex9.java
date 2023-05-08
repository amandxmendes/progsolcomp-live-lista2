/* Nome do Aluno: Amanda Mendes Santos
 * RA:820141459
 * Nome do Programa:Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final.
 * Data: 08/05/2023
 */

package Exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da venda: ");
        double valorVenda = sc.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        int opcao = sc.nextInt();

        double valorFinal = 0.0;

        switch (opcao) {
            case 1:
                valorFinal = valorVenda * 0.9;
                break;
            case 2:
                valorFinal = valorVenda * 0.95;
                break;
            case 3:
                valorFinal = valorVenda;
                break;
            case 4:
                valorFinal = valorVenda * 1.05;
                break;
            case 5:
                valorFinal = valorVenda * 0.92;
                break;
            case 6:
                valorFinal = valorVenda * 0.93;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        if (opcao >= 1 && opcao <= 6) {
            System.out.printf("O valor final da venda é R$ %.2f\n", valorFinal);
        }

        sc.close();
    }
}

