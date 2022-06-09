/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos.estrucutra_de_datos;

/**
 *
 * @author luisf
 */
public class stack<T> {
    //Atributos
    // Dentro del stack ponemos un top, que siempre va estar apuntando al primero en la cola
    private node<T> top;
    
    public void push(T value){
        node<T> newNode = new node<T>(value);
        
        if (top==null){
            top = newNode;
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }
    
    public T pop(){ //Este método, es de tipo T, o sea, que cualquiera que sea el tipo de lo que hay dentro de los nodos, será lo que se retorne en este método
        node<T> aux = top; //Creamos un nodo auxiliar de tipo T y le asignamos el valor de top para luego poder retornar el valor al que hicimos pop que va estar dentro del aux.
        
        if (top!=null){
            top = top.getNext();
            return aux.getValue();
        }
        else{
            return null; //En este caso, devolvemos un "null" porque no hay nada que pueda ser popeado.
        }
    }
}
