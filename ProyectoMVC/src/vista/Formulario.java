/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author SuperUs
 */
public class Formulario extends javax.swing.JFrame {
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantidades = new javax.swing.JComboBox<String>();
        txt_adiciones = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablapedidos = new javax.swing.JTable();
        txt_plato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidades.setBackground(new java.awt.Color(18, 120, 206));
        cantidades.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cantidades.setForeground(new java.awt.Color(255, 255, 255));
        cantidades.setMaximumRowCount(10);
        cantidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        cantidades.setToolTipText("");
        cantidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cantidades.setName(""); // NOI18N
        getContentPane().add(cantidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        txt_adiciones.setBackground(new java.awt.Color(51, 153, 255));
        txt_adiciones.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt_adiciones.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_adiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 138, -1));

        guardar.setBackground(new java.awt.Color(51, 153, 255));
        guardar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        mostrar.setBackground(new java.awt.Color(51, 153, 255));
        mostrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar Pedido");
        mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Plato");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 59, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adiciones");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidades");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        tablapedidos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tablapedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Plato", "Adicion", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablapedidos.setToolTipText("");
        tablapedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tablapedidos.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tablapedidos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 20, 400, 106));

        txt_plato.setBackground(new java.awt.Color(51, 153, 255));
        txt_plato.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt_plato.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_plato, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/formulario.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 430, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

    }//GEN-LAST:event_guardarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
      
    }//GEN-LAST:event_mostrarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cantidades;
    public javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton mostrar;
    public javax.swing.JTable tablapedidos;
    public javax.swing.JTextField txt_adiciones;
    public javax.swing.JTextField txt_plato;
    // End of variables declaration//GEN-END:variables
}
