package colas;
import java.util.LinkedList;//en implementacion de colas, genera un nodo de doble enlace
import java.util.Queue;//Genera la estrucurta de datos tipo coloa FIFO
public class ImplementaCola {
    Queue<Integer> cola = new LinkedList<>();
    
    public void AgregaElemento(int dato){
        cola.add(dato);
        }
    public void MuestraCola(){
        System.out.println("Despliega cola");
        for (Integer elemento : cola){
            System.out.println(elemento);
            }
        }
    public void MuestraPrimerElemento(){
        Integer elementoInicio = cola.peek();
        System.out.println("Primer elemento de la cola: " + elementoInicio);    
        }
    
    }
