package programas;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codProduto = sc.nextInt();
        int qntProd = sc.nextInt();
        float valor;
        switch (codProduto) {
            case 1:
                valor = 4.00f;
                System.out.println(qntProd + " Cachorro quente");
                System.out.println("Preço: " + qntProd*valor);
                break;
            case 2:
                valor = 4.50f;
                System.out.println(qntProd + " X - Salada");
                System.out.println("Preço: " + qntProd*valor);
                break;
            case 3:
                valor = 5.00f;
                System.out.println(qntProd + " Bacon");
                System.out.println("Preço: " + qntProd*valor);
                break;
            case 4:
                valor = 2.00f;
                System.out.println(qntProd + " Torrada Simples");
                System.out.println("Preço: " + qntProd*valor);
                break;
            case 5:
                valor = 1.50f;
                System.out.println(qntProd + " Refrigerante");
                System.out.println("Preço: " + qntProd*valor);
                break;
        }

    }
}
