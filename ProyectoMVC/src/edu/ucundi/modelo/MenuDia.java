/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.modelo;

/**
 *
 * Hector Fabian Perez Palmar
 */
public class MenuDia {
/**
 * Se crean los respectivos atributos
 */
    private String plato;
    private String adiciones;
    private int cantidad;
/**
 * Se crea el constructor
 */
    public MenuDia() {

    }
/**
 * Se crea un cnstructor sobre cargado que resibe los respectivos atributos
 * @param plato
 * @param adiciones
 * @param cantidad 
 */
    public MenuDia(String plato, String adiciones, int cantidad) {
        this.plato = plato;
        this.adiciones = adiciones;
        this.cantidad = cantidad;
    }
/**
 * Funcion que retorna el plato
 * @return 
 */
    public String getPlato() {
        return plato;
    }
/**
 * Metodo que resibe el plato y lo iguala a los atributos globales
 * @param plato 
 */
    public void setPlato(String plato) {
        this.plato = plato;
    }
/**
 * Funcion que retorna las Adiciones
 * @return 
 */
    public String getAdiciones() {
        return adiciones;
    }
/**
 * Metodo que resibe las adiciones y lo iguala a los atributos globales
 * @param adiciones 
 */
    public void setAdiciones(String adiciones) {
        this.adiciones = adiciones;
    }
/**
 * Funcion que retorna las cantidades
 * @return 
 */
    public int getCantidad() {
        return cantidad;
    }
/**
 * Metodo que resibe las cantidades y lo iguala a los atributos globales
 * @param cantidad 
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
