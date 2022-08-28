import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O que você quer comprar? \n1 - Cachorro quente(R$ 4) " +
                "\n2 - X-Salada(R$ 4.5) " +
                "\n3 - Bacon(R$ 5)" +
                "\n4 - Torrada simples(R$ 2)" +
                "\n5 - Refrigerante(R$ 1.5)");
        int codProduto = sc.nextInt();
        System.out.println("Quantos você quer?");
        int qntProd = sc.nextInt();
        sc.close();
        float valor;
        switch (codProduto) {
            case 1:
                valor = 4.00f;
                System.out.println(qntProd + " Cachorro quente");
                System.out.println("Preço: " + qntProd*valor);
                break;
            case 2:
                valor = 4.50f;
                System.out.println(qntProd + " X-Salada");
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
