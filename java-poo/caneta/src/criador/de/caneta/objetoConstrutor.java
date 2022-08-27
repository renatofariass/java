/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criador.de.caneta;

public class objetoConstrutor {
    private String  modelo;
    private String  cor;
    private float   ponta;
    private boolean tampada;
    
    public objetoConstrutor(String c, String m, float p) {
        this.modelo = m;
        this.cor    = c;
        this.ponta  = p;
        this.tampar();
    }
    
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
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampada() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("Sobre a Caneta:");
        System.out.println("modelo:" + getModelo());
        System.out.println("ponta:" + getPonta());
        System.out.println("cor:" + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
}
