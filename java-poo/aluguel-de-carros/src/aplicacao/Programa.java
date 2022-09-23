package aplicacao;

import model.entidades.AluguelDeCarro;
import model.entidades.Veiculo;
import model.servicos.ServicoDeAluguel;
import model.servicos.ServicosFiscaisBrasil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Insira a data do aluguel");
        System.out.print("Modelo do carro: ");
        String carro = sc.nextLine();
        System.out.print("Pegou na data (dd/MM/yyyy HH:ss): ");
        Date inicio = sdf.parse(sc.nextLine());
        System.out.print("Devolveu na data (dd/MM/yyyy HH:ss): ");
        Date fim = sdf.parse(sc.nextLine());

        AluguelDeCarro adc = new AluguelDeCarro(inicio, fim, new Veiculo(carro));

        System.out.print("Insira o preco do aluguel por hora: R$");
        double precoPorHora = sc.nextDouble();
        System.out.print("Insira o preco do aluguel por dia: R$");
        double precoPorDia = sc.nextDouble();
        ServicoDeAluguel sda = new ServicoDeAluguel(precoPorDia, precoPorHora, new ServicosFiscaisBrasil());
        sda.ProcessarFatura(adc);

        System.out.println("FATURA");
        System.out.printf("Pagamento básico: %.2f\n", adc.getFatura().getPagamentoBasico());
        System.out.printf("Taxa: %.2f\n", adc.getFatura().getTaxa());
        System.out.printf("Pagamento Total: %.2f", adc.getFatura().getPagamentoTotal());
        sc.close();
    }
}
