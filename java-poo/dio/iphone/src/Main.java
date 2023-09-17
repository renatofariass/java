import entidades.AparelhoTelefonico;
import entidades.NavegadorInternet;
import entidades.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        aparelhoTelefonico.ligar();
        navegadorInternet.exibirPagina();
        reprodutorMusical.tocar();
    }
}