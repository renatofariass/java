import entidades.AparelhoTelefonico;
import entidades.Iphone;
import entidades.NavegadorInternet;
import entidades.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.getNavegadorInternet().exibirPagina();
    }
}