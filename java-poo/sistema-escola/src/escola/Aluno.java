package escola;

public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;

    public void pagarMensalidade() {
        System.out.println(this.nome + " Pagando mensalidade...");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String dados() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
