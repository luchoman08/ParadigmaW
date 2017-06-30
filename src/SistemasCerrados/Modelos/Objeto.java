/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemasCerrados.Modelos;

import java.util.Hashtable;
import javafx.util.Pair;

/**
 *
 * @author lucho
 */
public class Objeto {
    Hashtable<String, Variable> variables;
    Hashtable<String, RelacionFuncion_Variable> relaciones_funcion_variables;
    
    Objeto(){
        variables = new Hashtable<>();
        relaciones_funcion_variables = new Hashtable<>();
        
        //creacion de variables
        Variable var;
        var = new Variable <Integer> ();
        var.setNombre("x");
        var.setRelacion_todo(0.8);
        var.setValor(5);
        var.setRango(new Pair(0,20));
        this.variables.put(var.getNombre(), var);
        
        var = new Variable <Integer> ();
        var.setNombre("y");
        var.setRelacion_todo(0.15);
        var.setValor(5);
        var.setRango(new Pair(0,5));
        this.variables.put(var.getNombre(), var);
        
        var = new Variable <Integer> ();
        var.setNombre("z");
        var.setRelacion_todo(0.05);
        var.setValor(100);
        var.setRango(new Pair(0,100));
        this.variables.put(var.getNombre(), var);
        
        
        
    }
    
}
