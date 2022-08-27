public class Pessoas extends Pessoa {
    private String login;
    private int totAssistido;

    public Pessoas(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    public void viuMaisUM() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Pessoas{" + super.toString() +
                " login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
