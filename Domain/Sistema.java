/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Melvin
 */
public class Sistema {
    
    private ArrayList<Organo> organos;
    private String nombre;

    public Sistema() {
        this.organos = null;
        this.nombre = "";
    }

    public Sistema(ArrayList<Organo> organos, String nombre) {
        this.organos = organos;
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    @Override
//    public String toString() {
//       // return "Sistema{" + "organos=" + organos + ", nombre=" + nombre + '}';
//        for (int i = 0; i < this.getOrganos().size(); i++) {
//            System.out.println(this.getOrganos().get(i).toString());
//            
//        }
    

   public void imprimir(){
       
       
       System.out.println("Sistema: " + this.nombre);
       
       for (int i = 0; i < this.getOrganos().size(); i++) {
           System.out.println(this.getOrganos().get(i).toString());

       
   } 
    
   }  
    
}
