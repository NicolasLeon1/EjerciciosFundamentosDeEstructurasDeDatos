/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author 29nic
 */
public class funciones {
    public static double suma(){
        double a, b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Sumando A:");
        a = leer.nextDouble();
        System.out.println("Sumando B:");
        b = leer.nextDouble();
        return a + b;
    }
    public static double resta(){
        double a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Minuendo A:");
        a = leer.nextDouble();
        System.out.println("Sustraendo B:");
        b = leer.nextDouble();
        return a - b ;
    }
    public static double producto(){
        double a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Factor A:");
        a = leer.nextDouble();
        System.out.println("Factor B:");
        b = leer.nextDouble();
        return a * b;
    }
    public static int division(){
        int a;
        int b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dividendo A:");
        a = leer.nextInt();
        System.out.println("Divisor B:");
        do { 
            System.out.println("DIVISOR DISTINTO DE 0");
            b = leer.nextInt();
        } while (b==0);
        return a / b;
    }
    
}
