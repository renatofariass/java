import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você quer digitar: ");
        int n = sc.nextInt();
        Pessoas[] p = new Pessoas[n];

        for (int i = 0; i<p.length; i++) {
            sc.nextLine();
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("digite sua altura: ");
            float altura = sc.nextFloat();
            p[i] = new Pessoas(nome, idade, altura);
            System.out.println("------------------");
        }

        int menos16 = 0;
        float somaAltura = 0f;

        for (int i = 0; i< p.length; i++) {
            if (p[i].getIdade() < 16) {
                menos16 += 1;
            }
            somaAltura += p[i].getAltura();
        }
        double porcentagem = (menos16 * 100) / n;
        float mediaAltura = somaAltura/n;
        System.out.printf("\nA media de altura é: %.2f", mediaAltura);
        System.out.printf("\nA porcentagem de pessoas com menos de 16 anos é: %.2f\n", porcentagem);
        for (int i = 0; i<p.length; i++) {
            if (p[i].getIdade() < 16) {
                System.out.println("Nome das pessoas com menos de 16 anos: " + p[i].getNome());
            }
        }

        sc.close();
    }
}
