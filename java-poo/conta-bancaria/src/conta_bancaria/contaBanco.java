
package conta_bancaria;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public contaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        }
        else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Você não pode fechar essa conta porque ainda tem dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Você não pode fechar essa conta porque você tem débitos");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float v) {
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v) {
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para sacar!");
            }
    }
        else {
            System.out.println("Impossível sacar em uma conta fechada");
        }
    }
    
    public void pagarMensal() {
        int v = 0; 
            if(this.getTipo() == "cc") {
                v = 12;
            }
            if (this.getTipo() == "cp"){
                v = 20;
            }
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalida paga na conta de " + this.getDono());
            }
            else {
                System.out.println("Impossível pagar em uma conta fechada!");
            }
        }
    
    

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    

    
    public void teste() {
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Saldo: " + this.getSaldo());
        
    }
}
