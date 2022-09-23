package model.servicos;

import model.entidades.AluguelDeCarro;
import model.entidades.Fatura;

public class ServicoDeAluguel {
    private Double precoPorDia;
    private Double precoPorHora;
    private ServicosFiscais taxaDeServico;

    public ServicoDeAluguel(Double precoPorDia, Double precoPorHora, ServicosFiscais taxaDeServico) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaDeServico = taxaDeServico;
    }
    //método responsável de gerar a nota de pagamento do programa
    public void ProcessarFatura(AluguelDeCarro aluguelDeCarro) {
        //passando o tempo para milisegundos
        long t1 = aluguelDeCarro.getInicio().getTime();
        long t2 = aluguelDeCarro.getFim().getTime();
        //convertendo o valor da diferença em horas para double para pegar um valor "quebrado" para arredondar
        double horas = (double) (t2 - t1) / 1000 / 60 / 60;
        /*milisegundos para segundos*/ /*segundos para minutos*/ /*minutos para horas*/

        double pagamentoBasico;
        if(horas <= 12.0) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        }
        else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
        }
        double taxa = taxaDeServico.taxa(pagamentoBasico);

        aluguelDeCarro.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
