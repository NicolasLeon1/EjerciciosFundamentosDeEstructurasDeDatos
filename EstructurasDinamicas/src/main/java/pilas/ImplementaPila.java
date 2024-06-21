package pilas;
import java.util.Stack;

public class ImplementaPila {
    Stack<Integer> pila = new Stack<>();
    
    public void AgregaElemento(int dato){
        pila.push(dato);
        }
    public void MuestraPila(){
        System.out.println("Despliega pila");
        for (Integer elemento : pila){
            System.out.println(elemento);
            }
        }
    public void MuestraElementoArriba(){
        Integer elementoInicio = pila.peek();
        System.out.println("Primer elemento de la pila: " + elementoInicio);    
        }    
    
    
    }
