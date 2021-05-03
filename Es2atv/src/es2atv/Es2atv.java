/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2atv;

import javax.swing.JOptionPane;

/**
 *
 * @author LUISFELIPEFERREIRADE
 */
public class Es2atv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia(10.5);
        Retangulo r = new Retangulo(20,40);
        JOptionPane.showMessageDialog(null, "CIRCUNFERENCIA\n\n\nArea: "+c.getArea()+"\nPerímetro: "+c.getPerimetro());
        JOptionPane.showMessageDialog(null, "RETANGULO\n\n\nArea: "+r.getArea()+"\nPerímetro: "+r.getPerimetro());
        System.out.println(c.getArea() + "  "+ c.getPerimetro());
        System.out.println(r.getArea()+"  "+r.getPerimetro());
    }
    
}
