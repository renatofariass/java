import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vetorA = new double[n];

        //guardar os valores no vetor
        for (int i = 0; i<vetorA.length; i++) {
            System.out.println("Digite um número: ");
            vetorA[i] = sc.nextDouble();
        }
        System.out.println("\n");
        System.out.println("Quantos números você vai digitar: ");

        double[] vetorB = new double[n];

        //guardar os valores no vetor
        for (int i = 0; i<vetorB.length; i++) {
            System.out.println("Digite um número: ");
            vetorB[i] = sc.nextDouble();
        }

        double[] vetorC = new double[n];

        //guardar os valores no vetor
        for (int i = 0; i<vetorC.length; i++) {
            System.out.println(vetorA[i] + vetorB[i]);
        }
    }
}
