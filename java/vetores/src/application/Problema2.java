package application;

import products.Products;
import java.util.Locale;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vector = new Products[n];


        for (int i = 0; i<vector.length; i++) {
            sc.nextLine();
            System.out.println("Digite um nome: ");
            String name = sc.nextLine();
            System.out.println("Digite um preço: ");
            float price = sc.nextFloat();
            vector[i] = new Products(name, price);
            System.out.println("-------------");
        }

        double sum = 0.0;
        for (int i = 0; i<vector.length; i++) {
            sum+=vector[i].getPrice();
        }

        double average = sum / n;

        System.out.printf("A soma dos preços dos produtos são: %.2f", average);
    }
}
