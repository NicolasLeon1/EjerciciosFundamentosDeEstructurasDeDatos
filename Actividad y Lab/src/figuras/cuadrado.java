/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author 29nic
 */
public class cuadrado {

    private double ladoA;

    public cuadrado(double ladoAA) {//constructor con parámetros
        ladoA= ladoAA;
    }

    public void setLadoA(double ladoAA) {
        this.ladoA= ladoAA;
    }

    public double getPerimetro() {
        return 4 * ladoA;
    }

    public double getArea() {
        return ladoA * ladoA;
    }
}
