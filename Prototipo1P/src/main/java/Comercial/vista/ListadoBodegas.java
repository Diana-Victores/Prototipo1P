
/*
 * 
 *
 * @author SipaqueRitaMaria
 */
package Comercial.vista;

import Comercial.datos.BodegaDAO;
import Comercial.dominio.Bodega;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListadoBodegas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form clientes
     */
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID BODEGA");
        modelo.addColumn("Nombre BODEGA");
        modelo.addColumn("COSTO");

        BodegaDAO proveedorDAO = new BodegaDAO();

        List<Bodega> proveedor = proveedorDAO.select();
        tbcbodega.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < proveedor.size(); i++) {

            dato[0] = Integer.toString(proveedor.get(i).getPKcodigoBodega());
            dato[1] = proveedor.get(i).getNombreBodega();
            dato[2] = proveedor.get(i).getEstatusBodega();

            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public ListadoBodegas() {
        initComponents();
        llenadoDeTablas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnenviar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcbodega = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPopupMenu1.setForeground(new java.awt.Color(204, 0, 204));

        mnenviar.setText("Enviar Datos");
        mnenviar.setToolTipText("");
        mnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnenviarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnenviar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listado de Bodegas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbcbodega.setComponentPopupMenu(jPopupMenu1);
        tbcbodega.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbcbodega.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbcbodegaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tbcbodegaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbcbodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcbodegaMouseClicked(evt);
            }
        });
        tbcbodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcbodegaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbcbodega);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listado de bodegas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnenviarActionPerformed
// TODO add your handling code here:

    String cod = "", uno = "", dos = "";
    String cod1 = "", uno1 = "", dos1 = "";
    int fila = tbcbodega.getSelectedRow();
    int fila1 = tbcbodega.getSelectedRow();
    int fila2 = tbcbodega.getSelectedRow();
    int fila3 = tbcbodega.getSelectedRow();

    try {
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");

        } else {
            cod = (String) tbcbodega.getValueAt(fila, 0);

            Porceso_FacturaCompras.txt_IdBodega.setDisabledTextColor(Color.blue);
            Porceso_FacturaCompras.txt_IdBodega.setText(cod);

            this.dispose();
        }
    } catch (Exception e) {

    }

    try {
        if (fila1 == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");

        } else {
            uno = (String) tbcbodega.getValueAt(fila1, 0);

            Proceso_OrdenCompra.txt_IdBodega.setDisabledTextColor(Color.blue);
            Proceso_OrdenCompra.txt_IdBodega.setText(uno);

            this.dispose();
        }

    } catch (Exception e) {

    }

    try {
        if (fila2 == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");

        } else {
            cod1 = (String) tbcbodega.getValueAt(fila2, 0);

            ProcesoDevolucionCompra.txt_IdBodega.setDisabledTextColor(Color.blue);
            ProcesoDevolucionCompra.txt_IdBodega.setText(cod1);

            this.dispose();
        }

    } catch (Exception e) {

    }

    try {
        if (fila3 == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");

        } else {
            uno1 = (String) tbcbodega.getValueAt(fila3, 0);

            ProcesoRecepcionCompra.txt_IdBodega.setDisabledTextColor(Color.blue);
            ProcesoRecepcionCompra.txt_IdBodega.setText(uno1);

            this.dispose();
        }

    } catch (Exception e) {

    }


}//GEN-LAST:event_mnenviarActionPerformed

    private void tbcbodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcbodegaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcbodegaMouseClicked

    private void tbcbodegaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbcbodegaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcbodegaAncestorMoved

    private void tbcbodegaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbcbodegaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcbodegaAncestorAdded

    private void tbcbodegaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcbodegaKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_tbcbodegaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnenviar;
    private javax.swing.JTable tbcbodega;
    // End of variables declaration//GEN-END:variables
//    conectar cc= new conectar();
//    Connection cn = cc.conexion();
}
