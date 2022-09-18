package modelo.entidades;

import modelo.entidades.excecoes.DomainException;

public class ContaBancaria {
    private int numero;
    private String dono;
    private double saldo;
    private double limiteDeRetirada;

    public ContaBancaria(int numero, String dono, double saldo, double limiteDeRetirada) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limiteDeRetirada = limiteDeRetirada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDeRetirada() {
        return limiteDeRetirada;
    }

    public void deposit(double quantia) {
        if(quantia > 0) {
            this.saldo = quantia + getSaldo();
        }
        else {
            throw new DomainException("Erro no depósito: Não foi possível fazer depósito");
        }
    }

    public void saque(double quantia) {
        if (quantia > getLimiteDeRetirada()) {
            throw new DomainException("Erro no saque: A quantia excedeu o limite de retirada!");
        }
        else if(quantia > getSaldo()){
            throw new DomainException("Erro no saque: A quantia que você quer sacar é maior do que o saldo da conta!");
        }
        else {
            this.saldo = getSaldo() - quantia;
        }
    }
}
