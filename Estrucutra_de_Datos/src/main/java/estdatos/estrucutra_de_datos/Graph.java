
package estdatos.estrucutra_de_datos;

import java.util.*;

public class Graph<T> {
    //creating an object of the Map class that stores the edges of the graph  
    private Map<T, List<T> > map = new HashMap<>();   
    //the method adds a new vertex to the graph  
    
    public void addNewVertex(T s){
        map.put(s, new LinkedList<T>());
    }
    
    //the method adds an edge between source and destination
    // El método añade un vértice entre el fuente y el destino
    public void addNewEdge(T source, T destination, boolean bidirectional){
        if (!map.containsKey(source))
            addNewVertex(source);
        if (!map.containsKey(destination))
            addNewVertex(destination);
        map.get(source).add(destination);
        if (bidirectional == true){
            map.get(destination).add(source);
        }
    }
    
    //the method counts the number of vertices
    public void countVertices(){
        System.out.println("Numero total de vertices: "+ map.keySet().size());
    }
    
    //the method counts the number of edges
    public void countEdges(boolean bidirection){
        //variable to store number of edges
        int count = 0;
        for (T v : map.keySet()){
            count = count + map.get(v).size();
        }
        if (bidirection == true){
            count = count / 2;
        }
        System.out.println("Numero total de aristas: "+ count);
    }
    
    //checks a graph has vertex or not  
    public void containsVertex(T s){
        if (map.containsKey(s)){
            System.out.println("El grafo contiene "+ s + " como un vertice.");
        }   
        else
        {
            System.out.println("El grafo no contiene "+ s + " como un vertice.");
        }
    }
    //checks a graph has edge or not 
    //Revisa que un grafo tenga arista o no
    
    //where s and d are the two parameters that represent source(vertex) and destination (vertex)
    //Donde s y d son los 2 paremetros que representan vértice fuente y vértice destino
    public void containsEdge(T s, T d){
        if (map.get(s).contains(d)){
            System.out.println("El grafo tiene una arista entre "+ s + " y " + d + ".");   
        }
        else{
            System.out.println("El grafo no tiene una arista entre "+ s + " y " + d + ".");
        }
    }
    
//prints the adjacencyS list of each vertex  
//here we have overridden the toString() method of the StringBuilder class  
    @Override  
    public String toString(){
        StringBuilder builder = new StringBuilder();
        //foreach loop that iterates over the keys
        for (T v : map.keySet()){
            builder.append(v.toString() + ": ");
            //foreach loop for getting the vertices  
            for (T w : map.get(v)){
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
    
//    public int numVertices; // Cantidad de vertices en el grafo
//    private int maxCapacity; //Cantidad máxima de vértices
//    private T[] vertices; // Almacenamos la lista de vértices
//    private int [][] edges; //Para almacenar aristas
//    
//    // Constructor
//    public Graph(int maxVertices){
//        this.numVertices = 0;
//        this.maxCapacity = maxVertices;
//        this.vertices = new T [maxCapacity];
//        this.edges = new int[this.maxCapacity][this.maxCapacity];
//    }
//    
//    public void addVertex(T vertex){
//        if(this.numVertices == this.maxCapacity){
//            System.out.println("El grafo ya está lleno y no admite más vértices.");
//            return; 
//        }
//        else if(vertex != null){
//            System.out.println("No se puede insertar un grafo nulo.");
//            return;
//        }
//        this.vertices[this.numVertices] = vertex;
//        for (int i=0; i < this.numVertices; i++){
//            this.edges[this.numVertices][i] = 0;
//            this.edges[i][this.numVertices] = 0;
//        }
//        this.numVertices ++;
//    }
//    
//    private int findVertex(T vertex){
//        for (int i=0; i< this.vertices.length; i++){
//            if(this.vertices[i].equals(vertex)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    public int getWeidght(T fromVertex, T toVertex){
//        int row = findVertex(fromVertex);
//        int column = findVertex(toVertex);
//        if(row != -1 && column != -1){
//            return this.edges[row][column];
//        }
//        else {
//            return -1;
//        }
//    }
//    
//    public void addEdge(T fromVertex, T toVertex, int weight){
//        int row = findVertex(fromVertex); //Encontrar el indice del primer vertice conectar
//        int column = findVertex(toVertex); // Encontrar el indice del vertice que se desea conectar 
//        if(row != -1 && column != -1){
//            //Debido a que es un grafo no dirigido asignamos el peso en ambos sentidos de la matriz.
//            this.edges[row][column] = weight;
//            this.edges[column][row] = weight;
//        }
//        else {
//            System.out.println("No se puede crear una arista entre vertices que no estan en el grafo.");
//        }
//    }
