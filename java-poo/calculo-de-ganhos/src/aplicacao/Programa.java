package aplicacao;

import entidades.Departamento;
import entidades.HorasDeContrato;
import entidades.Trabalhador;
import enums.NivelDeTrabalhador;

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

        System.out.println("Insira o nome do departamento: ");
        String nomeDoDepartamento = sc.nextLine();

        System.out.println("Insira os dados do trabalhador");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = sc.nextLine();
        System.out.print("Nível: ");
        String nivelDoTrabalhador = sc.nextLine();
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeDoTrabalhador, NivelDeTrabalhador.valueOf(nivelDoTrabalhador), salarioBase, new Departamento(nomeDoDepartamento));
        System.out.print("Quantos contratos para este trabalhador: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Insira os dados do contrato #" + i);
            System.out.print("Data(DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duration (horas): ");
            int horas = sc.nextInt();
            HorasDeContrato contrato = new HorasDeContrato(dataDoContrato, valorPorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println("\nInsira mês e ano para calcular a renda (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Nome: " + trabalhador.getDepartamento().getName());
        System.out.println("Renda: " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
        sc.close();
    }
}
