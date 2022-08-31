package aplicacao;

import classes_java.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual o seu salário bruto: R$");
        double sb = sc.nextDouble();
        System.out.print("Qual o imposto em reais sobre seu salário: R$");
        double taxa = sc.nextDouble();
        Empregado emp = new Empregado(nome, sb, taxa);
        System.out.println("Empregado " + emp.getNome() + ", " + emp.salarioLiq());
        System.out.print("Qual porcentagem aumentar o salário: ");
        double porcento = sc.nextDouble();
        emp.aumentarSalario(porcento);
        System.out.println("Dados atualizados: " + emp.getNome() + ", R$" + emp.getSalarioBruto() );
        sc.close();
    }
}
