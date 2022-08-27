package tipos_de_animais;

import animais.Arara;

public class Main {
    public static void main(String[] args) {
        //programa principal onde será criado os objetos
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Arara ar = new Arara();

        m.setPeso(82.5f);
        m.setIdade(12);
        m.setMembros(4);
        m.setCorPelo("Preto");
        ar.alimentar();
        System.out.println(m.toString());

    }
}
