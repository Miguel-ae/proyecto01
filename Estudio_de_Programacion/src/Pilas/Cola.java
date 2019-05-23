package Pilas;

import java.util.LinkedList;


public class Cola {
	
    //Creamos el atributo de la clase Pila para crear una lista enlazada (decimos que es para cadenas)
    private LinkedList<String> lista = new LinkedList<>();
    
    
    //Con este método añadimos un elemento a la cola
    public void enqueue(String valor){
        this.lista.add(valor);
    }
    
    
    //Este metodo retira el primer elemento de la cola
    public String dequeue(){
        if(!this.lista.isEmpty()){
            return this.lista.removeFirst();
        }else{
            System.out.println("No queda ningun elemento más en la pila");
            return null;
        }
    }
    
    
    //Este metodo el primer elemento de una cola
    public String head(){
        if(!this.lista.isEmpty()){
            return this.lista.getFirst();
        }else{
            System.out.println("No queda ningun elemento más en la pila");
            return null;
        } 
    }
    
    
    //Este metodo comprueba si la cola esta vacia o no
    public boolean isEmpty(){
        return this.lista.isEmpty();
    }
    
    
    //Este metodo imprime todos los elementos de la cola
    public void print(){
        if(!this.lista.isEmpty()){
            for(int i = 0 ;i <= this.lista.size()-1 ; i++){
            System.out.print(this.lista.get(i)+" ");
            }
            System.out.print("\n");
        }
    }
    
    
}

