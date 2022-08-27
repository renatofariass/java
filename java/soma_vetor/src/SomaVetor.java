import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        //guardar os valores no vetor
        for (int i = 0; i<vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        //printar os valores na tela
        System.out.println("Valores: ");
        for(int i = 0; i<vetor.length; i++) {
            //pegando o último loop
            if(i == vetor.length - 1) {
                System.out.print(vetor[i]);
            }
            else {
                System.out.print(vetor[i] + ", ");
            }
        }

        //soma dos vetores
        double sum = 0;
        for(int i = 0; i<vetor.length; i++) {
            sum += vetor[i];
        }
        System.out.println("\nSoma dos valores: ");
        System.out.println(sum);
        double media = sum / vetor.length;
        System.out.println("Média: ");
        System.out.printf("%.2f", media);
    }
}
