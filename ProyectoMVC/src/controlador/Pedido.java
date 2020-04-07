/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MenuDia;

/**
 *
 * @author SuperUs
 */
public class Pedido {
    Vector vprincipal=new Vector();
 
 public void guardar(MenuDia unMenu){
     vprincipal.addElement(unMenu);
 }
 public void guardarArchivo(MenuDia menu){
     try {
         FileWriter fw = new FileWriter("pedidos.txt",true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);
         pw.print(menu.getPlato());
         pw.print("|"+menu.getAdiciones());
         pw.println("|"+menu.getCantidad());
         pw.close();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
 }
 public DefaultTableModel listaMenudia(){
     Vector cabeceras = new Vector();
     cabeceras.addElement("Plato");
     cabeceras.addElement("Adiciones");
     cabeceras.addElement("Cantidades");
     DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
     try {
         FileReader fr = new FileReader("pedidos.txt");
         BufferedReader br =new BufferedReader(fr);
         
         String d;
         while((d=br.readLine())!=null){
             StringTokenizer dato = new StringTokenizer(d,"|");
             Vector x= new Vector();
             while(dato.hasMoreTokens()){
                 x.addElement(dato.nextToken());
             }
             mdlTabla.addRow(x);
         }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
     }
     return mdlTabla;
 }
 public void cboCantidades(JComboBox cantidades){
     cantidades.removeAllItems();
     for (int x = 1; x < 60; x++) {
         cantidades.addItem(x);
     }
 }
}
