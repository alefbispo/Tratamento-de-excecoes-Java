package aplication;


import aplication.model.entites.Conta;
import aplication.model.exception.DomainException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta");
            System.out.print("Numero: ");
            int num = scan.nextInt();
            scan.nextLine();
            System.out.print("Titular: ");
            String titular = scan.nextLine();
            System.out.print("Valor inicial: ");
            double valorInicial = scan.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = scan.nextDouble();

            Conta conta = new Conta(num, titular, valorInicial, limiteSaque);
            System.out.println();
            System.out.print("Valor do saque: ");
            conta.saque(scan.nextDouble());

            System.out.println("Valor do saldo: "
                    + String.format("%.2f", conta.getSaldo()));

        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        catch (DomainException e){
            System.out.println("Erro na operação: " + e.getMessage());
        }


        scan.close();
    }
}
