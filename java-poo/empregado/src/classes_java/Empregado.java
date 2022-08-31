package classes_java;

public class Empregado {
    private String nome;
    private double salarioBruto;
    private double imposto;
    private double porcentagem;


    public Empregado(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiq() {
        return this.getSalarioBruto() - this.getImposto();
    }

    public void aumentarSalario(double porcento) {
        setSalarioBruto(salarioLiq() * (1 + (porcento/100)));
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
