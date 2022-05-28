/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos.estrucutra_de_datos;

/**
 *
 * @author luisf
 */
public class node {
    
    //Atributos del nodo
    private int value; // Elemento guardado
    private node next; // Elemento de referencia
    //la línea de código anterior es la referencia y se apunta hacia el nodo siguiente

    public node(int value, node next) {
        this.value = value;
        this.next = null; // es nulo porque no sabemos en este punto si ya hay un next
    }
    // este es el método constructor y sirve para instanciar los objectos
    
    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(node next) {
        this.next = next;
    }
    // Los métodos setters sirven para cambiar los datos luego de haberlos instanciados

    public int getValue() {
        return value;
    }

    public node getNext() {
        return next;
    }
}
