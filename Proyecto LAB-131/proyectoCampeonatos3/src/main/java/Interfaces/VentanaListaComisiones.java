/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Archivos.ArchivoArrayListComision;
import Clases.Comision;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class VentanaListaComisiones extends javax.swing.JFrame {

    private String rutaComisiones  = "D:\\LAB-131\\TALLER INTERFACES GRAFICAS\\proyectoCampeonatos3\\src\\main\\java\\Datos\\datosComisiones.dat";
    /**
     * Creates new form VentanaListaComites
     */
    public VentanaListaComisiones() {
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

        jPanelCabecera = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelCuerpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaComisiones = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCabecera.setBackground(new java.awt.Color(46, 124, 175));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel3.setText("Lista de Comisiones");

        javax.swing.GroupLayout jPanelCabeceraLayout = new javax.swing.GroupLayout(jPanelCabecera);
        jPanelCabecera.setLayout(jPanelCabeceraLayout);
        jPanelCabeceraLayout.setHorizontalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabeceraLayout.setVerticalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelCuerpo.setBackground(new java.awt.Color(207, 228, 236));

        jTableListaComisiones.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jTableListaComisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de comision", "Numero de autoridades"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaComisiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableListaComisiones.setRowHeight(30);
        jScrollPane1.setViewportView(jTableListaComisiones);

        jButtonListar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonListar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(51, 153, 0));
        jButtonAgregar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonVer.setBackground(new java.awt.Color(204, 204, 0));
        jButtonVer.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButtonVer.setText("Ver");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCuerpoLayout = new javax.swing.GroupLayout(jPanelCuerpo);
        jPanelCuerpo.setLayout(jPanelCuerpoLayout);
        jPanelCuerpoLayout.setHorizontalGroup(
            jPanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListar)
                .addGap(19, 19, 19))
        );
        jPanelCuerpoLayout.setVerticalGroup(
            jPanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuerpoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        int posicionComision = jTableListaComisiones.getSelectedRow();
        ArchivoArrayListComision  arch = new ArchivoArrayListComision(rutaComisiones);
        ArrayList<Comision> lista = arch.leerArchivo();
        
        Comision c = lista.get(posicionComision);
        
        VentanaComision ventana = new VentanaComision(this, c, posicionComision, rutaComisiones);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVerActionPerformed

    public void actualizarDesdeOtraVentana() {
        DefaultTableModel modelo = (DefaultTableModel) jTableListaComisiones.getModel();
        modelo.setNumRows(0);
        actualizaVentana();
    }
    
    private void actualizaVentana () {
        ArchivoArrayListComision  arch = new ArchivoArrayListComision(rutaComisiones);
        ArrayList<Comision> lista = arch.leerArchivo();        

        DefaultTableModel modelo = (DefaultTableModel) jTableListaComisiones.getModel();
        
        for (int i = 0 ;i < lista.size() ;i++) {
            Comision c = lista.get(i);
            modelo.addRow(new Object[] {
                c.getNombreComision(), 
                c.getPa().nroElem()
            });
        }
    }
    
    
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTableListaComisiones.getModel();
        modelo.setNumRows(0);
        actualizaVentana();
    }//GEN-LAST:event_jButtonListarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaListaComisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaComisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaComisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaComisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListaComisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCuerpo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaComisiones;
    // End of variables declaration//GEN-END:variables
}
