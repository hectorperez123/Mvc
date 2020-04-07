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
 * @author SuperUs
 */
public class Iniciar {
    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        MenuDia menudia = new  MenuDia();
        Pedido pedido = new Pedido(menudia,formulario);
        pedido.ver();  
    }
    
}
