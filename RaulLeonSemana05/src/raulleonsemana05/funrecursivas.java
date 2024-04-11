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
public class funrecursivas {

    public static int contardigitos(int n) {
        int resultado;
        if (n < 10) {
            return 1;
        } else {
            resultado = 1 + contardigitos(n / 10);
            return resultado;
        }
    }
    public static int sumardigitos(int n){
        int resultado;
        if (n==0) return 0;
        resultado = sumardigitos(n/10)+n%10;
        return resultado;
    }
    public static int mcd(int n1, int n2){
        if (n2 == 0){
            return n1;
        }else{
            return mcd(n2, n1 % n2);
        }
    }
    public static void invertircad(String cad){
        if (cad.length()==0) return;
        invertircad(cad.substring(1)); System.out.print(cad.charAt(0)+"\n");
    }
    public static int verificarnumero(){
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número entero positivo");
        n = leer.nextInt();
        if (n >= 0) return n;
        else { 
            do { 
                System.out.println("INGRESAR NUEVAMENTE (NO ES NUMERO ENETRO POSITIVO):");
                n = leer.nextInt();
            } while (n<0);
                return n;
        }
    }
    
}