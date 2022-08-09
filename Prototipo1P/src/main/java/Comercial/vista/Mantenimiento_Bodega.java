/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.BodegaDAO;
import Comercial.datos.Conexion;
import Comercial.dominio.Bodega;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Diana
 */
public class Mantenimiento_Bodega extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Bodega
     */
      public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Bodega");
        modelo.addColumn("Nombre Bodega");
        modelo.addColumn("Estatus Bodega");
        BodegaDAO bodegaDAO = new BodegaDAO();

        List<Bodega> bodega = bodegaDAO.select();
        Tbl_tablabodega.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < bodega.size(); i++) {
            
            dato[0] = Integer.toString(bodega.get(i).getPKcodigoBodega());
            dato[1] = bodega.get(i).getNombreBodega();
            dato[2] = bodega.get(i).getEstatusBodega();

            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscar() {
        Bodega bodegaAConsultar = new Bodega();
        BodegaDAO bodegaDAO = new BodegaDAO();
        bodegaAConsultar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        
        bodegaAConsultar = bodegaDAO.query(bodegaAConsultar);
        Txt_nombre.setText(bodegaAConsultar.getNombreBodega());
        Txt_estatus.setText(String.valueOf(bodegaAConsultar.getEstatusBodega()));
//        cbx_bodega.setSelectedItem(String.valueOf(0));
    }

    public void limpiar() {
        Txt_id.setText("");
        Txt_nombre.setText("");
        Txt_estatus.setText("");
//        cbx_bodega.setSelectedIndex(0);
    }
    public Mantenimiento_Bodega() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Txt_estatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Reporte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_tablabodega = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Btn_Ayuda = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID ");

        Txt_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Btn_Buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Bodega");

        Txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Txt_estatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_estatusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Estado Bodega");

        Btn_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Reporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Reporte.setText("Reporte");
        Btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        Tbl_tablabodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_tablabodega);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento Bodega");

        Btn_Ayuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Ayuda.setText("Ayuda");
        Btn_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Btn_Ayuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        // TODO add your handling code here:
        buscar();

    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        //        MDI_Components mdi_Components = new MDI_Components();
        String id = "0";
        Mantenimiento_Bodega mntbodegaDAO = new Mantenimiento_Bodega();
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAInsertar = new Bodega();
        //String cbxbodega = cbx_bodega.getSelectedItem().toString();
        bodegaAInsertar.setPKcodigoBodega((int) Integer.parseInt(Txt_id.getText()));
       bodegaAInsertar.setNombreBodega(Txt_nombre.getText());
        bodegaAInsertar.setEstatusBodega(Txt_estatus.getText());
        bodegaDAO.insert(bodegaAInsertar);
        llenadoDeTablas();
        limpiar();
        
       
//        
//                Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        // TODO add your handling code here:
       
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAActualizar = new Bodega();
        ;
        bodegaAActualizar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        bodegaAActualizar.setNombreBodega(Txt_nombre.getText());
        bodegaAActualizar.setEstatusBodega(Txt_estatus.getText());
        bodegaDAO.update(bodegaAActualizar);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa.");

        llenadoDeTablas();
        limpiar();
        
//         Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        // TODO add your handling code here:
        BodegaDAO bodegaDAO = new BodegaDAO();
        Bodega bodegaAEliminar = new Bodega();
        bodegaAEliminar.setPKcodigoBodega(Integer.parseInt(Txt_id.getText()));
        
        bodegaDAO.delete(bodegaAEliminar);
        JOptionPane.showMessageDialog(null, "Registro Eliminado.");

        llenadoDeTablas();
        limpiar();
        
//         Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_EliminarActionPerformed
    
    private Connection connection = null;
    private void Btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReporteActionPerformed
        // TODO add your handling code here:
        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Comercial/reportes/bodega.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte Mantenimiento Bodega");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
// Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
    }//GEN-LAST:event_Btn_ReporteActionPerformed

    private void Btn_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoBodega.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoBodega.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
//         Bitacora Insertar = new Bitacora();
//                Insertar.setId_Usuario(Login.usuarioComercial);
//                Insertar.setAccion("Insertar");
//        
//                Insertar.setCodigoAplicacion("3001");
//                Insertar.setModulo("3000");
//        
//                try {
//                        BitacoraDAO.insert(Insertar);
//                    } catch (UnknownHostException ex) {
//                        Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                
//                Registro_ventaDao  DAO = new Registro_ventaDao();
//        
//                Registro_venta Inserta = new Registro_venta();
//                Inserta.setUsuario(Login.usuarioComercial);
//                Inserta.setAccion("Insertar");
//        
//                Inserta.setTabla("3001");
//                Inserta.setTotal(Txt_total.getText());
        
        
    }//GEN-LAST:event_Btn_AyudaActionPerformed

    private void Txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_estatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ayuda;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Reporte;
    private javax.swing.JTable Tbl_tablabodega;
    private javax.swing.JTextField Txt_estatus;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}