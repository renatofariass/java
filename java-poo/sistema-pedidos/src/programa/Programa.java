package programa;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.Pedido;
import entidades.Produto;
import enums.StatusDoPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Aniversário (dd/mm/yyyy): ");
        Date aniversario = sdf.parse(sc.nextLine());
        Cliente c1 = new Cliente(nome, email, aniversario);

        System.out.println("Insira os dados do pedido: ");
        System.out.println("Status:\n" +
                "PAGAMENTO_PENDENTE\n" +
                "EM_PROCESSAMENTO\n" +
                "ENVIADO\n" +
                "ENTREGUE");
        StatusDoPedido statusDoPedido = StatusDoPedido.valueOf(sc.next().toUpperCase());
        Pedido pedido = new Pedido(new Date(), statusDoPedido, c1);

        System.out.print("Quantos itens para este pedido? ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            System.out.println("Insira os dados do pedido #" + i);
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProd = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProd;
            while (true) {
                precoProd = sc.nextDouble();
                if (precoProd < 0) {
                    System.out.print("Insira um preço válido: ");
                } else {
                    break;
                }
            }
            Produto produto = new Produto(nomeProd, precoProd);

            System.out.print("Quantidadde: ");
            int quantidade;
            while (true) {
                quantidade = sc.nextInt();
                if (quantidade < 0) {
                    System.out.print("Insira uma quantidade válida: ");
                } else {
                    break;
                }
            }
            ItemDoPedido itemDoPedido = new ItemDoPedido(quantidade, precoProd, produto);

            pedido.addItem(itemDoPedido);
        }
        System.out.println("\nResumo do Pedido: ");
        System.out.println(pedido);

        sc.close();
    }
}
