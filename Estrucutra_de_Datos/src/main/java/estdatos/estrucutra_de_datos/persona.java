/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

/**
 *
 * @author Luis Chavarria
 */
public class persona {
    private int id;
    private String nombre;

    public persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public persona(){ //Creo que este método vacío es para poder hacer los nodos de tipo persona
        
    }
        
}
