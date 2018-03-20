/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Melvin
 */
public class Organo {
    
    private String nombre;
    private String funcion;
    
    //Constructores

    public Organo() {
        this.nombre = "";
        this.funcion = "";
    }

    public Organo(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the funcion
     */
    public String getFuncion() {
        return funcion;
    }

    /**
     * @param funcion the funcion to set
     */
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Organo{" + "nombre=" + nombre + ", funcion=" + funcion + '}';
    }
    
    
    
}
