/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

/**
 *
 * @author Luis Chavarria
 */
public class lista {
    private node<persona> head;
    
    public lista(){
        
    }
    
    // Importante notar que la lógica de estas condiciones son así: El menor debe ir de primero y el más grande de último
    
    public void insertar(persona value){ //este value es de tipo persona
        if (head == null){
            head = new node<persona>(value); //Acá estamos creando el nodo con la palabra reservada "new", pero hay que indicar de qué tipo es el nuevo nodo, en este caso usamos tipo T (generics)
        }
        else if( head.getValue().getId() > value.getId() ){     //En este if se evalua si el nuevo ID de la persona es menor al ID de la persona dentro del nodo head.
            node<persona> aux = new node<persona> (value);                  //Creamos un nodo auxiliar que va contener el value de tipo persona que estamos añadiendo a la cola
            aux.setNext(head); // Aquí le asignamos la cola, incluída el head actual al nuevo valor
            head = aux;
        }
        else if( head.getValue().getId() < value.getId() && head.getNext() == null){     //En este if se evalua si el nuevo ID de la persona es mayor al ID de la persona dentro del nodo.
            node<persona> aux = new node<persona> (value);
            head.setNext(aux); // Aquí como la persona con ID es mayor al que ya estaba de head, solo se añade de next al lado derecho del head.
        }
        else{
            node<persona> aux = head; // aquí copiamos el valor de head a aux
            while (aux.getNext() != null && aux.getNext().getValue().getId() < value.getId() ){ // acá nos vamos a ir moviendo por los nodos hasta encontrar uno que sea mayor al ID del nodo nuevo que queremos insertar
                aux = aux.getNext();  // este es lo que evita que se encicle el while, porque va cambiando el valor del aux, al next del aux actual.
            } 
            // Una vez que el get.next del aux es nulo o el ID del get.next del aux es mayor al nuevo ID, el ciclo se interrumpe y ejecuta lo siguiente:
            
            node<persona> Temp =  new node<persona>(value); // creo un nodo temporal y a este nodo temporal se le va a asignar el valor nuevo a insertar
            Temp.setNext(aux.getNext()); // el set next del temporal será el get.next del aux en el que quedamos en el anterior ciclo.
            aux.setNext(Temp); // y ahora le cambiamos el next del aux al nuevo nodo, para que este quede a su derecha.
        }
    }
    
    public void imprimirlista(){
        node<persona> aux = head;
        while (aux != null){
            System.out.println(aux.getValue().getId());
            aux = aux.getNext(); // este es lo que evita que se encicle el while
        }
    
    }
    
    public boolean existe(int id){
        node<persona> aux = head;
        while(aux != null){
            if (aux.getValue().getId() == id){
                return true;
            }
            
            aux = aux.getNext();  //Esto es lo que mueve el ciclo
            
        }    
        return false;
    }

}
