/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 29nic
 */
public class arrays {

    static int[] uno;
    static int[] dos;
    static int[] producto;
    static int[] resta;
    static int[] pareimpar;

    static void arrays1() {
        Random aleatorio = new Random();
        uno = new int[10];
        for (int i = 0; i < uno.length; i++) {
            uno[i] = aleatorio.nextInt(20) + 1;
        }
        System.out.println("EL ARRAY UNO ES EL SIGUIENTE:" + Arrays.toString(uno));
    }

    static void arrays2() {
        Scanner scanner = new Scanner(System.in);
        dos = new int[10];
        for (int i = 0; i < dos.length; i++) {
            System.out.print("Ingrese un número mayor que 5 y menor que 10: ");
            int num = scanner.nextInt();
            while (!(num > 5 && num < 10)) {
                System.out.print("Ingrese NUEVAMENTE un número mayor que 5 y menor que 10:");
                num = scanner.nextInt();
            }
            dos[i] = num;
        }
        System.out.println("EL ARRAY DOS ES EL SIGUIENTE: " + Arrays.toString(dos));
    }

    static void arraysproducto(int[] uno, int[] dos) {
        producto = new int[10];
        for (int i = 0; i < producto.length; i++) {
            producto[i] = uno[i] * dos[i];
        }
        System.out.println("EL ARRAY PRODUCTO ES EL SIGUIENTE: " + Arrays.toString(producto));
    }

    static void arraysresta(int[] uno, int[] dos) {
        resta = new int[10];
        for (int i = 0; i < resta.length; i++) {
            resta[i] = uno[i] - dos[i];
        }
        System.out.println("EL ARRAY RESTA ES EL SIGUIENTE: " + Arrays.toString(resta));
    }

    static void arrayspareimpar(int[] uno, int[] dos) {
        pareimpar = new int[10];
        for (int i = 0; i < pareimpar.length; i++) {
            pareimpar[i] = (uno[i] + dos[i]) % 2 == 0 ? 1 : 0;
        }
        System.out.println("EL ARRAY PRAR E IMPAR ES EL SIGUIENTE: " + Arrays.toString(pareimpar));
    }

    static void matriz(int[] uno, int[] dos, int[] producto, int[] resta, int[] pareimpar) {
        int[][] matriz = {uno, dos, producto, resta, pareimpar};
        System.out.println("Matriz: ");
        for (int[] fila : matriz) {
        // Imprimir cada elemento de la fila
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
        }
        System.out.println(); 
    }
    }

    public static int[] obtenerUno() {
        return uno;
    }

    public static int[] obtenerDos() {
        return dos;
    }

    public static int[] obtenerProducto() {
        return producto;
    }

    public static int[] obtenerResta() {
        return resta;
    }

    public static int[] obtenerPareimpar() {
        return pareimpar;
    }
}
