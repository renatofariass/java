package escola;

public class main {
    public static void main (String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setSexo("M");
        v1.setIdade(20);
        System.out.println(v1.dados());

        Aluno a1 = new Aluno();
        a1.setNome("Silvio");
        a1.setCurso("Ciências da Computação");
        a1.setSexo("M");
        a1.setIdade(22);
        a1.setMatricula(1223);
        System.out.println(a1.dados());

        Professor p1 = new Professor();
        p1.setNome("Carla");
        p1.setSexo("F");
        p1.setIdade(45);
        p1.setEspecialidade("Geografia");
        p1.setSalario(1600.43);
        p1.receberAumento(250);
        System.out.println(p1.dados());

    }
}
