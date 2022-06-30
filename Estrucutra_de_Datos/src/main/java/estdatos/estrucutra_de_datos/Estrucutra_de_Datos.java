
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
        
        
        /*----------------Pilas----------------
        stack<String> Pila = new stack<String>(); //El nombre del tipo no puede ser abreviado como int, debe ser "Integer" en ese caso.
        Pila.push("Sebastian");
        Pila.push("Juan");
        Pila.push("Luis");
        
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        
        //----------------Pilas----------------*/
        
        /* ----------------Cola----------------
        
        queue<Integer> Cola = new queue<Integer>(); //El nombre del tipo no puede ser abreviado como int, debe ser "Integer" en ese caso.
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(4);
        System.out.println(Cola.dequeue());            //Acá imprime el nodo como tal
        System.out.println(Cola.dequeue().getValue()); //Acá imprime el contenido del nodo mediante el método getValue
        // ----------------Cola----------------*/
        
        // ----------------Lista----------------//
        lista Lista = new lista (); //instanciamos el objeto Lista y lo creamos de tipo persona
        Lista.insertar(new persona(25, "Luis")); // Acá dentro del objeto lista, el dato que llevará dentro es de tipo persona y por eso le damos el ID y el nombre.
        Lista.insertar(new persona(54, "Rodrigo"));
        Lista.insertar(new persona(30, "Carlos"));
        Lista.insertar(new persona(12, "Andres"));
        Lista.insertar(new persona(15, "Lorena"));
        
        //Lista.elimina(30);
        //Lista.modificar(25);
        Lista.extraer(15);
        
        Lista.imprimirlista(); 
        
        //System.out.println(Lista.existe(95));
    }
        
}
