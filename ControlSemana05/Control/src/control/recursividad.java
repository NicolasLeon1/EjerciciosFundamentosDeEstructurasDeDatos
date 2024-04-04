/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author 29nic
 */
public class recursividad {
    static void recursividad(int numero){
        if (numero<10) System.out.println(numero);
        else{ System.out.print(numero%10);
        recursividad(numero/10);    
    }
    }
        
}
