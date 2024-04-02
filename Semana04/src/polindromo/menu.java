/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polindromo;

import java.util.Scanner;

/**
 *
 * @author 29nic
 */
public class menu {

    public static void main(String[] args) {

        String palabra;
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Palindromo");
            System.out.println("0.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESE UNA PALABRA:");
                    palabra = leer.next();
                    funcionpalindromo.palindromo(palabra);
                    break;
                case 0:
                    break;
                default:
                    System.out.print("La opcion ingresa en incorrecta");
            }
        }  while (opcion!=0);
    }
}

