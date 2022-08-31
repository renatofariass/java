package cotacao;

public class Cotacao {

    public static double IOF = 1.06;
    public static double dolarParaReal(double dolar, double valor) {
        return (dolar * valor) * IOF;
    }

}
