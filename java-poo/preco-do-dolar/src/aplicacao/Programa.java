package aplicacao;


import cotacao.Cotacao;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a cotação do dólar: ");
        double dol = sc.nextDouble();
        System.out.print("Insira quantos dólares voce quer comprar: ");
        double qnt = sc.nextDouble();
        double resultado = Cotacao.dolarParaReal(dol, qnt);
        System.out.println("Voce irá pagar " + resultado);
        sc.close();
    }
}
