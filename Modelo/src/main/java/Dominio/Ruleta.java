/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import Dominio.Ruleta.AccionRuleta;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class Ruleta {

    public List<AccionRuleta> accionesPosibles;
    
    
    public AccionRuleta girarRuleta(){
        Random r= new Random();
        return accionesPosibles.get(r.nextInt(0, 3));
        
        
    }
    
    
    public enum AccionRuleta {
        Accion1,Accion2,Accion3,Accion4
    }

}
