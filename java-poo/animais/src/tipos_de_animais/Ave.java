package tipos_de_animais;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "corPena='" + corPena + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
