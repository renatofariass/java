/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta_bancaria;

public class ContaBancaria {

    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        p1.pagarMensal();
        
        contaBanco p2 = new contaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);
        p2.pagarMensal();
        
        p1.teste();
        p2.teste();
    }
    
}
