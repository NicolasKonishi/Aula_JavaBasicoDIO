package edu.nicolas.desafios.ContaBanco_Sintaxe;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String Nome = teclado.nextLine();

        System.out.println("\nPor favor, digite a Agência: ");
        String Agencia = teclado.nextLine();

        System.out.println("\nPor favor, digite o número da Agência: ");
        int Numero = teclado.nextInt();

        System.out.println("\nPor favor, digite o seu saldo: ");
        Double Saldo = teclado.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", Nome, Agencia, Numero, Saldo);




    }
}
