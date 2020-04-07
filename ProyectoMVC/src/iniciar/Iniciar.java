/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciar;

import controlador.Pedido;
import modelo.MenuDia;
import vista.Formulario;
/**
 * 
 * @author Hector Fabian Perez Palmar
 */
public class Iniciar {
/**
 * Se crea el metodo que ejecuta el programa general
 * @param args 
 */
    public static void main(String[] args) {
        /**
         * Se crea el objeto en memoria formulario y menudia
         */
        Formulario formulario = new Formulario();
        MenuDia menudia = new MenuDia();
        /**
         * Se crea el objeto en memoria pedido donde resibe los objetos formulario y menudia
         */
        Pedido pedido = new Pedido(menudia, formulario);
        /**
         * Metodo de la clase pedido que nos permite visualizar el JFrame
         */
        pedido.ver();
    }

}
