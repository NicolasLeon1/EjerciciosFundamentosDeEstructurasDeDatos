/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;
/**
 *
 * @author 29nic
 */
public class menu {

    public static void main(String[] args) {
        arrays.arrays1();
        arrays.arrays2();
        int[] uno = arrays.obtenerUno();
        int[] dos = arrays.obtenerDos();
        arrays.arraysproducto(uno, dos);
        arrays.arraysresta(uno, dos);
        arrays.arrayspareimpar(uno, dos);
        int[] producto = arrays.obtenerProducto();
        int[] resta = arrays.obtenerResta();
        int[] pareimpar = arrays.obtenerPareimpar();
        arrays.matriz(uno, dos,producto,resta,pareimpar);
    }
    
}
