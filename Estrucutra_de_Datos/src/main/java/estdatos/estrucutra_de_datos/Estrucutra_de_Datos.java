
package estdatos.estrucutra_de_datos;

import static estdatos.estrucutra_de_datos.GFG.newNode;
import static estdatos.estrucutra_de_datos.GFG.preOrder;
import static estdatos.estrucutra_de_datos.GFG.search;

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
        /*
        lista Lista = new lista (); //instanciamos el objeto Lista y lo creamos de tipo persona
        Lista.insertar(new persona(25, "Luis")); // Acá dentro del objeto lista, el dato que llevará dentro es de tipo persona y por eso le damos el ID y el nombre.
        Lista.insertar(new persona(54, "Rodrigo"));
        Lista.insertar(new persona(30, "Carlos"));
        Lista.insertar(new persona(12, "Andres"));
        Lista.insertar(new persona(15, "Lorena"));
        */
        //Lista.elimina(30);
        //Lista.modificar(12);
        //System.out.println(Lista.extraer(15));
        //Lista.imprimirlista();
        //System.out.println(Lista.existe(12));
        
        // ----------------Lista----------------//
        
        // ----------------Lista Circular Simple----------------/
        /*
        lista_Circular_Simple Lista2 = new lista_Circular_Simple (); //instanciamos el objeto Lista y lo creamos de tipo persona
        Lista2.insertar(new persona(25, "Luis")); // Acá dentro del objeto lista, el dato que llevará dentro es de tipo persona y por eso le damos el ID y el nombre.
        Lista2.insertar(new persona(54, "Rodrigo"));
        Lista2.insertar(new persona(30, "Carlos"));
        Lista2.insertar(new persona(12, "Andres"));
        Lista2.insertar(new persona(15, "Lorena"));
        
        //Lista.elimina(30);
        //Lista.modificar(12);
        //System.out.println(Lista.extraer(15));
        Lista2.imprimirlista();
        //System.out.println(Lista.existe(12));
        
        */
        // ----------------Lista Circular Simple----------------//
        
        // ----------------Lista Doble Circular ----------------//
        
        lista_Doble_Circular Lista3 = new lista_Doble_Circular ();
        
        Lista3.insertar(new persona(25, "Luis")); // Acá dentro del objeto lista, el dato que llevará dentro es de tipo persona y por eso le damos el ID y el nombre.
        Lista3.insertar(new persona(4, "Rodrigo"));
        Lista3.insertar(new persona(30, "Carlos"));
        Lista3.insertar(new persona(12, "Andres"));
        Lista3.insertar(new persona(15, "Lorena"));
        
        
        //Lista3.elimina(12);
        //Lista3.modificar(12);
        //System.out.println(Lista3.extraer(4));
        Lista3.imprimirlista();
        //System.out.println(Lista3.existe(11));
        
        // ----------------Lista Doble Circular ----------------//
        
        //Binary Structure Tree BST 
        /*
        BST arbol = new BST(); 
        
        arbol.inserta(50);
        arbol.inserta(20);
        arbol.inserta(80);
        arbol.inserta(15);
        arbol.inserta(30);
        arbol.inserta(60);
        arbol.inserta(40);
        arbol.inserta(90);
        arbol.inserta(75);
        arbol.inserta(33);
        arbol.inserta(82);
        
        //arbol.postOrden();
        arbol.inOrden();
        //arbol.preOrden();
        */
        //intentar imprimir el preorden y postorden
        //arbol.altura();
        
        //Splay Tree
        GFG.node root = newNode(100);
        root.left = newNode(50);
        root.right = newNode(200);
        root.left.left = newNode(40);
        root.left.left.left = newNode(30);
        root.left.left.left.left = newNode(20);
        root = search(root, 20);
        System.out.print("Preorder traversal of the"
                + " modified Splay tree is \n");
        preOrder(root);
        
    }
        
}
