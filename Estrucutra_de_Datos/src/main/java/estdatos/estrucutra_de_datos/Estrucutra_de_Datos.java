
package estdatos.estrucutra_de_datos;

public class Estrucutra_de_Datos {

    public static void main(String[] args) {
        /*
        ----------------Recursividad----------------        
        System.out.println(recursion.factorial(3));
        
        
        int[] arr={12,34,64,2,3};
        System.out.println(recursion.encontrarMax(arr,1,arr[0])); 
        
        int[] ejercicio3={12,34,64,5,1};
        int n = recursion.sacaPosicionMayor(ejercicio3,0,ejercicio3[0],0);
        //Se crea esta variable n para poder sumarle 1 al resultado del método en el system.out
        
        System.out.println("La posición en el array del número más alto es: " +(n+1) );
        ----------------Recursividad----------------
        */
        
        /*
        ----------------Pilas----------------
        stack<String> Pila = new stack<String>(); //El nombre del tipo no puede ser abreviado como int, debe ser "Integer" en ese caso.
        Pila.push("Sebastian");
        Pila.push("Juan");
        Pila.push("Luis");
        
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        
        ----------------Pilas----------------
        */
        // ----------------Cola----------------
        
        queue<Integer> Cola = new queue<Integer>(); //El nombre del tipo no puede ser abreviado como int, debe ser "Integer" en ese caso.
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());
    }
    // ----------------Cola----------------
}
