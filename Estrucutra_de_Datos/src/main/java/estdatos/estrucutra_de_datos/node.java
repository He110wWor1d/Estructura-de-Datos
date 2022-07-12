/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos.estrucutra_de_datos;

/**
 *
 * Esta <T> es de Java generics. Y la T luego cuando yo instancio un objecto en la clase, me permite crear un objeto nodo, 
 * de cualquier tipo, puede ser int, puede ser String y todo solo con cambiar la T por el tipo de dato
 */

public class node<T> {
    
    //Atributos del nodo
    private T value; // Elemento guardado, tenga en cuenta que el elemento guardado puede ser de tipo int, String o persona, que es un tipo abstracto
    private node<T> next; // Elemento de referencia. La referencia y se apunta hacia el nodo siguiente.
    private node<T> back;
    
    public node (T value){
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public node<T> getNext() {
        return next;
    }

    public node<T> getBack() {
        return back;
    }

    public void setBack(node<T> back) {
        this.back = back;
    }

}
