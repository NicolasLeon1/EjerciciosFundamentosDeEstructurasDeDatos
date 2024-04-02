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
public class main {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("1. Opcion 1 Sumar");
                System.out.println("2. Opcion 2 Restar");
                System.out.println("3. Opcion 3 Multiplicar");
                System.out.println("4. Opcion 4 Dividir");
                System.out.println("0. Salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("LA SUMA ES:" + funciones.suma());
                        break;
                    case 2:
                        System.out.println("LA RESTA ES:" +funciones.resta());
                        break;
                    case 3:
                        System.out.println("LA MULTIPLICACIÓN ES:" +funciones.producto());
                        break;
                    case 4:
                        System.out.println("LA DIVISION ES:" +funciones.division());
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
