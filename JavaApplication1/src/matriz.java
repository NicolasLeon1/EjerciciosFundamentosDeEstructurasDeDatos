/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 29nic
 */
import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int dato;
        do {
            System.out.println("CREACIÓN DE MATRICES");
            System.out.println("INGRESE 1 PARA GENERAR UNA MATRIZ 4X4 CON DIAGONAL PRINCIPAL");
            System.out.println("INGRESE 2 PARA GENERAR UNA MATRIZ 4X4 CON TRIANGULAR INFERIRO IZQUIERDA");
            System.out.println("INGRESE 3 PARA GENERAR UNA MATRIZ 4X4 CON SUPERIOR DERECHA");
            System.out.println("INGRESE 4 PARA SALIR");
                
            dato = data.nextInt();
            
            switch (dato) {
                case 1:
                    diagonalprincipal();
                    break;
                case 2:
                    triangularinferior();
                    break;
                case 3:
                    triangularsupeiror();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");
            }
        } while (dato != 4);
        
        data.close();
    }

    public static void diagonalprincipal() {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void triangularinferior() {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void triangularsupeiror() {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}              

