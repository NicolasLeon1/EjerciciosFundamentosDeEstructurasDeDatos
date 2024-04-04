/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 29nic
 */
public class menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero;");
            try {
                numero = leer.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Número no valido ingrese nuevamente:");
                leer.next();
            }
        } while (true);
        recursividad.recursividad(numero);
        
    }
}
