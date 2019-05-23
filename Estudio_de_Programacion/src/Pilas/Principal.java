package Pilas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        //PILA
		
        Pila MiPila = new Pila();
        
        //paso 2
        if(MiPila.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("La pila contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 3
        MiPila.push(1);
        MiPila.push(1);
        MiPila.push(3);
        MiPila.push(5);
        MiPila.push(8);
        
        //paso 4
        System.out.println("El contenido de la pila es: ");
        MiPila.print();
        System.out.println("_____________________________________________________________");
        
        //paso 5
        if(MiPila.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("La pila contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 6
        System.out.println("El elemento retirado de la pila es: "+MiPila.pop());
        System.out.println("_____________________________________________________________");
        
        //paso 7
        System.out.println("Los elementos de la pila son:");
        while(!MiPila.isEmpty()){
            System.out.println(MiPila.pop());
        }
        System.out.println("_____________________________________________________________");
        
        //paso 8
        if(MiPila.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("La pila contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 9
        MiPila.pop();
        System.out.println("_____________________________________________________________");
        
        //paso 10
        MiPila.push(8);
        
        //paso 11
        System.out.println("El primer elemento de la pila es: "+MiPila.top());
        System.out.println("_____________________________________________________________");
        
        //paso 12
        if(MiPila.isEmpty()){
            System.out.println("Pila vacía");
        }else{
            System.out.println("La pila contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 13
        System.out.print("Los elementos de la pila son: ");
        MiPila.print();
        System.out.println("_____________________________________________________________");
        
        
        
        
        
        //COLA
        
        Cola col = new Cola();  
        
        
       //paso 2
        if(col.isEmpty()){
            System.out.println("Cola vacía");
        }else{
            System.out.println("La cola contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 3
        col.enqueue("H");
        col.enqueue("O");
        col.enqueue("L");
        col.enqueue("A");
        
        //paso 4
        System.out.println("El contenido de la cola es: ");
        col.print();
        System.out.println("_____________________________________________________________");
        
        //paso 5
        if(col.isEmpty()){
            System.out.println("Cola vacía");
        }else{
            System.out.println("La cola contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 6
        System.out.println("El elemento retirado de la pila es: "+col.dequeue());
        System.out.println("_____________________________________________________________");
        
        //paso 7
        System.out.println("El contenido de la cola es: ");
        while(!col.isEmpty()){
            System.out.println(col.dequeue());
        }
        System.out.println("_____________________________________________________________");
        
        //paso 8
        if(col.isEmpty()){
            System.out.println("Cola vacía");
        }else{
            System.out.println("La cola contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 9
        col.dequeue();
        System.out.println("_____________________________________________________________");
        
        //paso 10
        col.enqueue("B");
        
        //paso 11
        System.out.println("El primer elemento en cola es: "+col.head());
        System.out.println("_____________________________________________________________");
        
        //paso 12
        if(col.isEmpty()){
            System.out.println("Cola vacía");
        }else{
            System.out.println("La cola contiene elementos");
        }
        System.out.println("_____________________________________________________________");
        
        //paso 13
        System.out.print("El contenido de la cola es: ");
        col.print();
        System.out.println("_____________________________________________________________");
    }

}
