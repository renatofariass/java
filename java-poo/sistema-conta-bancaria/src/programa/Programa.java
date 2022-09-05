package programa;

import entidades.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int numDaConta = sc.nextInt();
        System.out.print("Insira o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        ContaBanco c1 = new ContaBanco(numDaConta, nome);

        System.out.print("Quer fazer um depósito inicial?(S/N): ");
        while (true) {
            String simOuNao = sc.nextLine().toUpperCase();
            if (simOuNao.equals("S")) {
                System.out.print("Quanto você quer depositar? ");
                double depositoInicial = sc.nextDouble();
                c1.setDeposito(depositoInicial);
                break;
            }
            else if (simOuNao.equals("N")) {
                c1.setDeposito(0);
                break;
            }
            else if(simOuNao != "S" || simOuNao != "N"){
                System.out.println("Digite uma resposta válida!");
                System.out.print("Quer fazer um depósito inicial?(S/N): ");
            }
        }
        System.out.println(c1.toString());

        System.out.print("\nInsira um valor de depósito: ");
        while (true) {
            double deposito = sc.nextDouble();
            if (deposito > 0) {
                c1.setDeposito(deposito);
                break;
            }
            else {
                System.out.println("operação inválida");
                System.out.print("Insira um valor de depósito: ");
            }
        }
        System.out.println("Atualizando dados da conta:");
        System.out.println(c1.toString());

        System.out.print("\nInsira um valor de saque: ");
        while (true) {
            double saque = sc.nextDouble();
            if(saque > 0) {
                c1.setSaque(saque);
                break;
            }
            else {
                System.out.println("Operação inválida!");
                System.out.print("Insira um valor de saque: ");
            }
        }
        System.out.println("Atualizando dados da conta:");
        System.out.println(c1.toString());
    }
}
