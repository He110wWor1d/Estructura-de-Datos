/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

import java.util.Scanner;

/**
 *
 * @author Luis Chavarria
 */
public class lista_Circular_Simple {
    private node<persona> head;
    private node<persona> tail;
    
    public void insertar(persona value){
        
        if(head == null){  // If para comparar si la lista está vacía
            head = new node<persona>(value);
            tail = head;
            tail.setNext(head);
        }
        else if( head.getValue().getId() > value.getId() ){ // If que asume que ya hay info en la lista
            node<persona> aux = new node<persona>(value);                 
            aux.setNext(head); 
            head = aux;
            tail.setNext(head);
        }       
        else if( value.getId() >= tail.getValue().getId() ){ // If que asume que ya hay nodos en la lista y comparamos el valor del nuevo nodo
            node<persona> aux = new node<persona> (value); // Creamos nodo aux
            tail.setNext(aux);
            tail = aux;
            tail.setNext(head);
        }
        else{
            node<persona> aux = tail;
            while (aux.getNext().getValue().getId() < value.getId() ){
                aux = aux.getNext();
            } 
            // Una vez que el get.next del aux es nulo o el ID del get.next del aux es mayor al nuevo ID, el ciclo se interrumpe y ejecuta lo siguiente:
            
            node<persona> Temp =  new node<persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }
     // El tail.setNext(Head) se puede poner en esta linea y se borraría de todas las demás if
     
        
    }
    
    public void imprimirlista(){
        
        if (head == null){
            System.out.println("La lista esta vacia.");
            
        }
        else{
            node<persona> aux = head;
            do{
                System.out.println(aux.getValue().getId()+", "+aux.getValue().getNombre());
                aux = aux.getNext(); // este es lo que evita que se encicle el while
            }while (aux != head); // Con do while, el tema del ciclo se resuelve fácil
        }
        
    }
    
    public boolean existe(int id){
        
        if(id == head.getValue().getId() || id == tail.getValue().getId()){
            return true; // Nota: El true contiene un break, por eso si se da un retorno el método para ahí.
        }
        else{
            node<persona> aux = head.getNext(); //El aux es igual a head.getNext, porque el head ya se evaluó antes.
            do{
                if (aux.getValue().getId() == id){
                    return true;
                }
                aux = aux.getNext();  //Esto es lo que mueve el ciclo
            }while (aux != tail); // Acá evaluamos que aux sea diferente de tail, porque ya tail se evaluó antes
            return false;
            
        }
        
    }
        
    public void modificar(int id){
        Scanner entrada = new Scanner(System.in);
        boolean existe = false;

        if(head == null){
            System.out.println("La lista esta vacia. No es posible modificar ningún dato.");
            existe = true;
        }
        else if(id == head.getValue().getId()){
            System.out.println("Se cambiará el nombre a la persona con ID "+id+".\nDigite el nuevo nombre: ");
            head.getValue().setNombre(entrada.next());
            existe = true;
        }
        else if(id == tail.getValue().getId()){
            System.out.println("Se cambiará el nombre a la persona con ID "+id+".\nDigite el nuevo nombre: ");
            tail.getValue().setNombre(entrada.next());
            existe = true;
        }
        else{
            node<persona> aux = head.getNext(); // Agarramos el get next porque el head ya se evalua en el segundo If
            while(aux != tail){
                if (aux.getValue().getId() == id){ //Get value es para sacar el objeto de tipo persona de la caja que es el nodo. Y luego el get ID es para sacarle el ID a este objeto persona
                    System.out.println("Se cambiará el nombre a la persona con ID "+id+".\nDigite el nuevo nombre: ");
                    //namemodif = entrada.next();
                    aux.getValue().setNombre(entrada.next());
                    existe = true;
                    break; // Ponemos un break en esta condición para que el ciclo acabe si la condición se cumple.
                    
                }
                
                aux = aux.getNext();  //Esto es lo que mueve el ciclo
            
            }
            
            if (existe == false){ //Este if y el boolean son para verificar que el dato exista
                System.out.println("No es posible modificar este elemento porque no existe en la lista.");
            }
            
        }
        
    }
    
    //elimina
    public void elimina(int id){
        boolean existe = false;
        
        if(head == null){
            System.out.println("La lista esta vacia. No es posible eliminar ningún dato.");
            existe = true;
        }
        else if(id == head.getValue().getId()){
            head = head.getNext();
            tail.setNext(head);  // No estoy seguro de si esto es necesario***
            existe = true;
        }
        else{
            node<persona> aux = head;
            node<persona> aux2 = aux.getNext(); //con este nodo tomamos el que va delante del aux, sirve para detener el while.
            
            while(aux.getNext() != tail){ // Este while para cuando el el que va delante del aux es el tail.
                if (aux2.getValue().getId() == id){
                    aux.setNext(aux.getNext().getNext());
                    existe = true;
                    break; // Ponemos un break en esta condición para que el ciclo acabe si la condición se cumple.
                }
            
                aux = aux.getNext();  //Esto es lo que mueve el ciclo
                aux2 = aux.getNext();

            }
            
            if (id == tail.getValue().getId()){
                tail = aux;
                tail.setNext(head);
                existe = true;
            }
            
            if (existe == false){ //Este If es para verificar que el dato exista
                System.out.println("No es posible eliminar este elemento porque no existe en la lista.");
            }
            
        }
        
    }
    
    public persona extraer(int id){
        persona p = null;
        node<persona> aux;
        
        if(id == head.getValue().getId()){
            aux = head;
            head = head.getNext();
            tail.setNext(head);
            return aux.getValue();
        }
        else{
            aux = head;
            node<persona> aux2 = aux.getNext(); //con este nodo tomamos el que va delante del aux, sirve para detener el while.
            
            while(aux.getNext() != tail){ // Este while para cuando el el que va delante del aux es el tail.
                if (aux2.getValue().getId() == id){
                    aux.setNext(aux.getNext().getNext());
                    
                    return aux2.getValue();
                }
            
                aux = aux.getNext();  //Esto es lo que mueve el ciclo
                aux2 = aux.getNext();

            }
            
            if (id == tail.getValue().getId()){
                tail = aux;
                tail.setNext(head);
                return aux2.getValue();
            }
            
            return p;
            
        }
        
    }

}
