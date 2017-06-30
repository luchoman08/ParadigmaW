/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemasCerrados.Modelos;

import java.lang.ProcessBuilder.Redirect.Type;
import javafx.util.Pair;

/**
 *
 * @author lucho
 * @param <T>
 */
public class Variable <T>{

    /**
     * @return the rango
     */
    public Pair<T,T> getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(Pair<T,T> rango) {
        this.rango = rango;
    }

    /**
     * @return the valor
     */
    public T getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

    public Variable() {
        this.tipo = valor.getClass().getSimpleName() ;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the relacion_todo
     */
    public double getRelacion_todo() {
        return relacion_todo;
    }

    /**
     * @param relacion_todo the relacion_todo to set
     */
    public void setRelacion_todo(double relacion_todo) {
        this.relacion_todo = relacion_todo;
    }
    /**
     * Nombre con el que será accedida la variable en cuestión
     * */
    private String nombre;
    /**
     * Tipo de la variable, dependiendo de el nivel de esta variable sera su 
     * padre, es decir, si tipo esta en un nivel n de quien haga parte dicha 
     * variable tendra a lo menos nivel n + 1
     * */
    private String tipo;
    /**
    * Porcentaje de afectación que tiene esta variable para con el sistema 
    * del que hace parte, un nivel arriba en su jerarquía
    * */
    private double relacion_todo;
    
    private T valor;
    
    private Pair<T,T> rango;
    
}
