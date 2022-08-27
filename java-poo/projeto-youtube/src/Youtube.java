public class Youtube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula de HTML/CSS");
        v[1] = new Video("Aula de Java");
        v[2] = new Video("Aula de Javascript");

        Pessoas[] p = new Pessoas[2];
        p[0] = new Pessoas("Renato", 20, "M", "renato123");
        p[1] = new Pessoas("Maria", 18, "F", "maria_eduarda");

        v[1].play();

        Visualizacao[] vis = new Visualizacao[2];
        vis[0] = new Visualizacao(p[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(p[1], v[2]);
        vis[1].avaliar(6);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
