package entidades;

import enums.NivelDeTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelDeTrabalhador nivel;
    private double salarioBase;
    private Departamento departamento;
    private List <HorasDeContrato> contratos = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, NivelDeTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.contratos = contratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDeTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void addContrato(HorasDeContrato contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(HorasDeContrato contrato) {
        contratos.remove(contrato);
    }

    public Double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (HorasDeContrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (c_ano == ano && c_mes == mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
