/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author 29nic
 */
public class circulo {

    private double radio;

    public circulo(double radioo) {//constructor con parámetros
        radio = radioo;
    }

    public void setRadio(double radioo) {
        this.radio = radioo;
    }

    public double getPerimetro() {
        return 2 * 3.14 * radio;
    }

    public double getArea() {
        return 3.14 * radio * radio;
    }
}
