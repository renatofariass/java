package entidades;

public class ContaBanco {
    private final int numDaConta;
    private String nome;
    private double deposito;
    private double saque;
    private double saldo;

    public ContaBanco(int numDaConta, String nome) {
        this.numDaConta = numDaConta;
        this.nome = nome;
    }

    public int getNumDaConta() {
        return numDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        if (deposito >= 0) {
            setSaldo(deposito + getSaldo());
        }
        else {
            System.out.println("Operação inválida");
        }
    }

    public double getSaque() {
        return saque;
    }

    //Para sacar há uma taxa de R$5
    public void setSaque(double saque) {
        if (getSaldo() > saque || saque < 0) {
            setSaldo((getSaldo() - saque) - 5);
        }
        else {
            System.out.println("Operação inválida!");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numDaConta +
                ", nome: " + nome +
                ", saldo: " + getSaldo();
    }
}
