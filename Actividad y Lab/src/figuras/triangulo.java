/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author 29nic
 */
public class triangulo {
    private double catA;
    private double catB;
    private double hipot;

    public triangulo(double catetoA, double catetoB, double hipotenusa) {//constructor con parámetros
        catA = catetoA;
        catB = catetoB;
        hipot = hipotenusa;
        
    }

    public void setCatetoA(double catetoA) {
        this.catA = catetoA;
    }

    public void setCatetoB(double catetoB) {
        this.catB = catetoB;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipot = hipotenusa;
    }
    public double getPerimetro() {
        return catA + catB + hipot;
    }
    public double getArea() {
        return (catA*catB)/2;
    }
}
