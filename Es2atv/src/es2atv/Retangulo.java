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
public class Retangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    Retangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    void calcularArea(){
        this.setArea(this.base * this.altura);
    }

    void calcularPerimetro(){
        this.setPerimetro(2*(this.base + this.altura));
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
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