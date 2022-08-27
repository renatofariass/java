
package controle_remoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Métodos especiais
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligado");
    }

    @Override
    public void desligar() {
        if(getLigado()) {
            this.setLigado(false);
        }
        else {
            System.out.println("Impossível desligar algo desligado");
        }
    }

    @Override
    public void abrirMenu() {
        if(getLigado()) {
            System.out.println("Está ligado: " + getLigado());
            System.out.println("Está tocando: " + getTocando());
            System.out.print("Volume: " + getVolume());
            for(int i = 0; i<getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("\n");
        }
        else{
            System.out.println("Impossível abrir o menu");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(getLigado()) {
            this.setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(getLigado() && getVolume() > 0) {
            this.setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado() && getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()) {
            this.setTocando(false);
        }
    }
    
}
