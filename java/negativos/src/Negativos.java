import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar(máximo = 10): ");
        int n = sc.nextInt();
        while (n > 10) {
            System.out.println("Digite um número igual ou menor que 10");
            n = sc.nextInt();
        }
        int[] vetor = new int[n];

        for(int i = 0; i<vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("os números negativos digitados foram: ");
        for (int i = 0; i<vetor.length; i++) {
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

    }
}
