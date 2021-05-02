/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2atv;

/**
 *
 * @author LUISFELIPEFERREIRADE
 */
public class Circunferencia {
    private double raio;
    private double area;
    private double perimetro;

    Circunferencia(double r){
        this.raio = r;
    }

    void calcularArea(){
        this.setArea(Math.PI * Math.pow(getRaio(), 2));
    }

    void calcularPerimetro(){
        this.setPerimetro(2*Math.PI * getRaio());
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
}