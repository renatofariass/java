package escola;

public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;

    public void fazerAnive() {
        this.idade++;
    }

    public String dados() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
