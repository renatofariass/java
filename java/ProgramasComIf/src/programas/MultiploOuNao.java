package programas;

import java.util.Scanner;

public class MultiploOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.println("são múltiplos.");
        }
        else {
            System.out.println("não são múltiplos.");
        }
        sc.close();
    }
}
