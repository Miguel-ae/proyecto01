package Pilas;

//Importamos LinkedList
import java.util.LinkedList;

/* 
 * push()  Inserta datos a la pila
 * pop()  Retira datos de la pila
 * top() o peek()  Devuelve el contenido del primer elemento, sin eliminar nada
 * isEmpty()  Comprueba si la pila esta vacia o no
 * print()  Imprime los elementos de la pila
 * 
 */


public class Pila {
	
    //Creamos el atributo de la clase Pila para crear una lista enlazada (decimos que es para numero enteros)
    private LinkedList<Integer> lista = new LinkedList<>();
    
    
    //Con este método añadimos un elemento a una pila
    public void push(int valor){
        this.lista.add(valor);
    }
    
    
    //Con este metodo retiraremos datos de la pila
    public Integer pop(){
        if(!this.lista.isEmpty()){
            return this.lista.removeLast();
        }else{
            System.out.println("No queda ningun elemento más en la pila");
            return null;
        }
    }
    
    
    //Este metodo devuelve el primer elemento de la pila sin llegar a eliminar nada
    public Integer top(){
        if(!this.lista.isEmpty()){
            return this.lista.getLast();
        }else{
            System.out.println("No queda ningun elemento más en la pila");
            return null;
        } 
    }
    
    
    //Este metodo comprueba si la pila esta vacia o no
    public boolean isEmpty(){
        return this.lista.isEmpty();
    }
    
    
    //Este metodo imprime todos los elementos de la pila
    public void print(){
        if(!this.lista.isEmpty()){
            for(int i = this.lista.size()-1; i >= 0; i--){
            System.out.println(this.lista.get(i));
            }
        } 
    }
}
