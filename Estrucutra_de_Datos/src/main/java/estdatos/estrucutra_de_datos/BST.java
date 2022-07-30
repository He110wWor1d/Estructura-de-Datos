/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

/**
 *
 * @author Luis Chavarria
 */
public class BST { //Binary Search Tree
    nodeTree root;
    private int altura;
    
    public void inserta(int value){
        if (root == null){
            root = new nodeTree(value);
        }
        else{
            insertar(root,value); // le pasamos root a insertar
        }
        
    }
    
    private void insertar(nodeTree node, int value){
        if (value <= node.getId()){ // primero verificamos izq
            if(node.getIzq() == null){
                node.setIzq(new nodeTree(value));
            }
            else{
                insertar(node.getIzq(),value);
            }
        }
        else{
            if(node.getDer() == null){
                node.setDer(new nodeTree(value));
            }
            else{
                insertar(node.getDer(),value); // La manera en que nos vamos a traves de los nodos del árbol es mediante 
                                                //recursividad, llamando cada vez el método insertar, dandole el nodo izq o derecha según corresponda
            }
        }
    }
    
    /*Recorridos
    Preorden: Primero raíz, luego subarbol izq y luego subarbol derecho
    Inorden: Primero subarbol izq , luego raíz y luego subarbol derecho
    Postorden: Primero izq, derecha y luego raíz de último
    IMPORTANTE: Recordar que cada subarbol puede verse como un arbol con su root y sus ramas. Esto facilita el algoritmo de recorrido
    */
    
    /*
    El recorrido in Orden recorre el arbol respetando el orden númerico.
    */
    public void inOrden(){
        if (root != null){
            inOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacío.");
        }
    }
    
    private void inOrdenRecorrer(nodeTree node){
        if (node != null){
            inOrdenRecorrer(node.getIzq());
            System.out.println(node.getId());
            inOrdenRecorrer(node.getDer());
        }
    }
    
    public int altura(){
        altura = 0;
        retornarAltura(root, 1);
        System.out.println("La altura es de "+altura);
        return altura;
    }
    
    private void retornarAltura(nodeTree node, int nivel){
        if (node != null){
            retornarAltura(node.getIzq(), nivel+1 );
            if(nivel > altura){
                altura = nivel;
            }
            System.out.println(node.getId());
            retornarAltura(node.getDer() , nivel+1);
        }
    }
    
    
    /*
    El recorrido pre Orden imprime en prioridad 1 de arriba hacia abajo y luego en prioridad 2 de izquierda a derecha
    */
    public void preOrden(){
        if (root != null){
            preOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacío.");
        }
    }
    
    private void preOrdenRecorrer(nodeTree node){
        if (node != null){
            System.out.println(node.getId());
            preOrdenRecorrer(node.getIzq());
            preOrdenRecorrer(node.getDer());
        }
    }
    
    // El recorrido postOrden muestra los resultados de Izq a derecha 
    //y y de abajo hacia arriba, entonces siempre empieza en total izq y 
    //desde el nodo de abajo y luego total derecha de su respectira rama, pero de abajo hacia arriba
    public void postOrden(){ 
        if (root != null){
            postOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacío.");
        }
    }
    
    private void postOrdenRecorrer(nodeTree node){ //Terminar esto
        if (node != null){
            postOrdenRecorrer(node.getIzq());
            postOrdenRecorrer(node.getDer());
            System.out.println(node.getId());
        }
    }
    
    
        
}
