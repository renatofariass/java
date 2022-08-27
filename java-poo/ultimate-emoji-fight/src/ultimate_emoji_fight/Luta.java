
package ultimate_emoji_fight;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;
    
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else {
            System.out.println("Luta não aprovada");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            System.out.println("------- Desafiante -------");
            this.getDesafiante().apresentar();
            System.out.println("------- Desafiado -------");
            this.getDesafiado().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //Desafiado vence
                    System.out.println("Venceu " + this.getDesafiado().getNome() + "\n");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 1: //Empate
                    System.out.println("Empatou \n");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Venceu " + this.getDesafiante().getNome() + "\n");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        }
    }
    
    //Métodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
