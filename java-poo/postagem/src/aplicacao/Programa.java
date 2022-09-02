package aplicacao;

import entidades.Comentario;
import entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem");
        Comentario c2 = new Comentario("Uau, que incrível!!");
        Post p1 = new Post(
                sdf.parse("01/09/2022 17:24:33"),
                "Viajando para a França",
                "Estou indo visitar esse lindo país!",
                25);
        p1.addComent(c1);
        p1.addComent(c2);
        System.out.println(p1.toString());
    }
}
