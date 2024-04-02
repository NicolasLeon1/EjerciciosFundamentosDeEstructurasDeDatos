/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author 29nic
 */
public class figurasgeometricas {

    static void rectangulo() {
        double ladoA, ladoB;
        Scanner leer = new Scanner(System.in);
        System.out.println("Operaciones con figura geométrica rectángulo");
        System.out.println("============================================");
        System.out.println("Ingrese el lado A del rectangulo       : ");
        ladoA = leer.nextDouble();
        System.out.println("Ingrese el lado B del rectangulo      : ");
        ladoB = leer.nextDouble();
        rectangulo objetoRectangulo = new rectangulo(ladoA, ladoB); //Creamos un objeto, y lo usaremos para llamar a los métodos de la clase rectangulo
        objetoRectangulo.setLadoA(ladoA);                       //Acá usamos al objetoRectangulo para invocar su método setLadoA
        objetoRectangulo.setLadoB(ladoB);                       //Acá usamos al objetoRectangulo para invocar su método setLadoB
        double peri = objetoRectangulo.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro 
        double are = objetoRectangulo.getArea();            //Acá usamos al objetoRectangulo para invocar su método getArea
        System.out.println("El perimetro del rectángulo es:         " + peri);
        System.out.println("El área del  del rectángulo es:         " + are);
    }

    static void cuadrado() {
        double ladoA;
        Scanner leer = new Scanner(System.in);
        System.out.println("Operaciones con figura geométrica cuadrado");
        System.out.println("==========================================");
        System.out.println("Ingrese un lado del cuadrado       : ");
        ladoA = leer.nextDouble();
        cuadrado objetoCuadrado = new cuadrado(ladoA);
        objetoCuadrado.setLadoA(ladoA);
        double peri = objetoCuadrado.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro 
        double are = objetoCuadrado.getArea();            //Acá usamos al objetoRectangulo para invocar su método getArea
        System.out.println("El perimetro del cuadrado es:         " + peri);
        System.out.println("El área del  del cuadrado es:         " + are);

    }

    static void circulo() {
        double radio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Operaciones con figura geométrica circulo");
        System.out.println("==========================================");
        System.out.println("Ingrese el radio del circulo      : ");
        radio = leer.nextDouble();
        circulo objetoCirculo = new circulo(radio);
        double peri = objetoCirculo.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro 
        double are = objetoCirculo.getArea();            //Acá usamos al objetoRectangulo para invocar su método getArea
        System.out.println("El perimetro del circulo es:         " + peri);
        System.out.println("El área del  del circulo es:         " + are);
        
    }

    static void triangulo() {
        double catA, catB, hipot;
        Scanner leer = new Scanner(System.in);
        System.out.println("Operaciones con figura geométrica triangulo rectangulo");
        System.out.println("==========================================");
        System.out.println("Ingrese el cateto A del triangulo rectangulo      : ");
        catA = leer.nextDouble();
        System.out.println("Ingrese el cateto B del triangulo rectangulo      : ");
        catB = leer.nextDouble();
        System.out.println("Ingresela hipotenusa del triangulo rectangulo      : ");
        hipot = leer.nextDouble();
        triangulo objetoTriangulo = new triangulo(catA, catB, hipot);
        double peri = objetoTriangulo.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro 
        double are = objetoTriangulo.getArea();            //Acá usamos al objetoRectangulo para invocar su método getArea
        System.out.println("El perimetro del tringulo es:         " + peri);
        System.out.println("El área del  del triangulo es:         " + are);
    }
}


