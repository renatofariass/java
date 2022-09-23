package model.servicos;

public class ServicosFiscaisBrasil implements ServicosFiscais{
    public double taxa(double quantia) {
        //taxa aplicada de acordo com a quantia
        if(quantia <= 100.0) {
            return quantia * 0.2;
        }
        else {
            return quantia * 0.15;
        }
    }
}
