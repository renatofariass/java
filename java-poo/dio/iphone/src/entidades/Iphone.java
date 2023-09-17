package entidades;

public class Iphone {
    AparelhoTelefonico aparelhoTelefonico;
    NavegadorInternet navegadorInternet;
    ReprodutorMusical reprodutorMusical;

    public Iphone() {
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
        this.reprodutorMusical = new ReprodutorMusical();
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }
}
