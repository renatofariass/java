package entidades;

import java.util.Date;

public class HorasDeContrato {
    private Date data;
    private double valorPorHora;
    private int horas;

    public HorasDeContrato(Date data, double valorPorHora, int hora) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = hora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double valorTotal() {
        return valorPorHora * horas;
    }
}
