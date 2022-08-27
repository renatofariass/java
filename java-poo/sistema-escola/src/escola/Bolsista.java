package escola;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa...");
    }

    @Override //sobrepondo o método pagar mensalidade.
    public void pagarMensalidade() {
        System.out.println(this.nome + " Esse aluno é bolsista! Pagamento facilitado");
    }

    //getters e setters
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
