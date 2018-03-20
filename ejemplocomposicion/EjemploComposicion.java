/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocomposicion;

import Domain.Deportivo;
import Domain.Organo;
import Domain.Sistema;
import Domain.Zapato;
import java.util.ArrayList;

public class EjemploComposicion {

  
    public static void main(String[] args) {

        Sistema digestivo = new Sistema();
        
        Organo estomago = new Organo("Estomago", "Digerir alimento");
        Organo boca = new Organo("Boca", "Masticar");
        
        ArrayList<Organo> organos = new ArrayList<Organo>();
        organos.add(estomago);
        
        digestivo.setOrganos(organos);
        digestivo.setNombre("Digestivo");
        
        digestivo.imprimir();
        
        Zapato nike = new Deportivo("Futbol",38);
        
        System.out.println(nike.toString());
    }
    
}
