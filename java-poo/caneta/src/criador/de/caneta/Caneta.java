package criador.de.caneta;


public class Caneta {
    public String modelo;
    private float ponta;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void status() {
        System.out.println("Sobre a Caneta:");
        System.out.println("O modelo da caneta e " + getModelo());
        System.out.println("A ponta da caneta e " + getPonta());
    }
}
