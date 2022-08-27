package escola;

public class Professor extends Pessoa {
    protected String especialidade;
    protected double salario;

    public void receberAumento(float a) {
        this.salario += a;
    }

    @Override
    public String dados() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }

    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
