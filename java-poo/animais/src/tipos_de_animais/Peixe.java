package tipos_de_animais;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
