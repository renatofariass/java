package br.com.dio.desafio.application;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "Curso da linguagem de programação Java", 40);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria para pessoas do curso de Java", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Bootcamp da linguagem de programação Java");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoria);

        Dev devRenato = new Dev("Renato");
        devRenato.inscreverBootcamp(bootcampJava);
        devRenato.progredir();
        devRenato.progredir();


        System.out.println(devRenato);
    }
}
