
package estdatos.estrucutra_de_datos;

public class queue<T> {
    private node<T> head; // Primer lugar
    private node<T> tail; // Último lugar
    
    public void enqueue (T value){
        node<T> newNode = new node<T> (value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public node<T> dequeue (){
        if(head == null){
            System.out.println("La cola se encuentra vacía.");
            return null;
        }
        else{
            node<T> firstInQueue = head;
            head=head.getNext();
            return firstInQueue;
        }
    }
}