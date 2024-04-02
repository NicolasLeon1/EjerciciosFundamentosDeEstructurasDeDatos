/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polindromo;

/**
 *
 * @author 29nic
 */
public class funcionpalindromo {

    public static void palindromo(String palabra) {
        if (palabra.length() <= 1) {
            System.out.println("La palabra es un palindroimo");
        }else {
            char primeraletra = palabra.charAt(0);
            char ultimaletra = palabra.charAt(palabra.length()-1);
            if (primeraletra==ultimaletra){
                palindromo(palabra.substring(1,palabra.length()-1));
            }else {
                System.out.println("La palara no es un palindromo");
            }
        }
    }
}
