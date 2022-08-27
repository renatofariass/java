public class Visualizacao {
    private Video filme;
    private Pessoas espectador;

    public Visualizacao(Pessoas espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(double avaliacao) {
        this.filme.setAvaliacao(avaliacao);
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Pessoas getEspectador() {
        return espectador;
    }

    public void setEspectador(Pessoas espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "filme=" + filme +
                ", espectador=" + espectador +
                '}';
    }
}
