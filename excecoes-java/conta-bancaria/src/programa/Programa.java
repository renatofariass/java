package programa;

import modelo.entidades.ContaBancaria;
import modelo.entidades.excecoes.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Insira os dados da conta:");
            System.out.print("Numero da conta: ");
            int numero = sc.nextInt();
            //consumindo a quebra de linha pendente
            sc.nextLine();
            System.out.print("Dono da conta: ");
            String dono = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de retirada: ");
            double limite = sc.nextDouble();
            //instanciando objeto
            ContaBancaria cb = new ContaBancaria(numero, dono, saldo, limite);

            System.out.print("Insira uma quantia para saque: ");
            double saque = sc.nextDouble();
            cb.saque(saque);
        }
        //tratando exceções
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
