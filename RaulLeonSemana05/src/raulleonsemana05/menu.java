/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raulleonsemana05;

import java.util.Scanner;

/**
 *
 * @author 29nic
 */
public class menu {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int opcion; int num; int num2; String cad;
            do {
                System.out.println("1. Contar Digitos");
                System.out.println("2. Suma de Dígitos");
                System.out.println("3. Maximo Común Dividor");
                System.out.println("4. Invertir Cadena");
                System.out.println("0. Salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        num = funrecursivas.verificarnumero();
                        System.out.println("LA CANTIDAD DE DIGITOS ES DE:"+funrecursivas.contardigitos(num));
                        break;
                    case 2:
                        num = funrecursivas.verificarnumero();
                        System.out.println("LA SUMA DE LOS DIGITOS ES DE:"+funrecursivas.sumardigitos(num));
                        break;
                    case 3:
                        num = funrecursivas.verificarnumero();
                        num2 = funrecursivas.verificarnumero();
                        System.out.println("EL MINIMO COMUN DIVISOR ES:"+funrecursivas.mcd(num,num2));
                        break;
                    case 4:
                        System.out.println("Escriba una cadena");
                        cad = leer.next();
                        funrecursivas.invertircad(cad);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opcion ingresa no es correcta");
                }

            } while (opcion != 0);
        }
    }
}
