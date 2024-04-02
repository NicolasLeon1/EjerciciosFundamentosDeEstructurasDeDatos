/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author 29nic
 */
public class rectangulo {

    private double ladoA;
    private double ladoB;

    public rectangulo(double ladoAA, double ladoBB) {//constructor con parámetros
        ladoA = ladoAA;
        ladoB = ladoBB;
    }

    public void setLadoA(double ladoAA) {
        this.ladoA = ladoAA;
    }

    public void setLadoB(double ladoBB) {
        this.ladoB = ladoBB;
    }

    public double getPerimetro() {
        return 2 * ladoA + 2 * ladoB;
    }

    public double getArea() {
        return ladoA * ladoB;
    }
}


