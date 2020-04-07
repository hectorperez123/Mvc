/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MenuDia;
import vista.Formulario;

/**
 *
 * @author SuperUs
 */
public class Pedido implements ActionListener, MouseListener {

    private MenuDia menudia;
    private Formulario formulario;

    public Pedido(MenuDia menudia, Formulario formulario) {
        this.menudia = menudia;
        this.formulario = formulario;
        this.formulario.guardar.addActionListener(this);
        this.formulario.mostrar.addMouseListener(this);
    }
    public void ver() {
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        formulario.tablapedidos.setModel(listaMenudia());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        menudia.setPlato(formulario.txt_plato.getText());
        menudia.setAdiciones(formulario.txt_adiciones.getText());
        menudia.setCantidad(Integer.parseInt(formulario.cantidades.getSelectedItem().toString()));
        guardar(menudia);
        guardarArchivo(menudia);
    }

    public void guardar(MenuDia unMenu) {
        Vector vprincipal = new Vector();
        vprincipal.addElement(unMenu);
    }

    public void guardarArchivo(MenuDia menu) {
        try {
            FileWriter fw = new FileWriter("pedidos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(menu.getPlato());
            pw.print("|" + menu.getAdiciones());
            pw.println("|" + menu.getCantidad());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel listaMenudia() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Plato");
        cabeceras.addElement("Adiciones");
        cabeceras.addElement("Cantidades");
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        try {
            FileReader fr = new FileReader("pedidos.txt");
            BufferedReader br = new BufferedReader(fr);

            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
