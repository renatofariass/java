package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentario = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post(Date moment, String titulo, String conteudo, Integer likes) {
        this.moment = moment;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentario() {
        return comentario;
    }

    public void addComent(Comentario coment) {
        this.comentario.add(coment);
    }

    public void removerComent(Comentario coment) {
        this.comentario.remove(coment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(conteudo).append("\n");
        sb.append("Comentarios:\n");
        for(Comentario c : comentario) {
            sb.append(c.getTexto()).append("\n");
        }
        return sb.toString();
    }
}
