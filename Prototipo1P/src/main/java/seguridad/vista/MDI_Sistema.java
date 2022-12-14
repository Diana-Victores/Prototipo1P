package seguridad.vista;

//import com.formdev.flatlaf.FlatDarkLaf;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import seguridad.dominio.Usuario;
import seguridad.datos.PerfilDAO;
import seguridad.dominio.Perfil;
import seguridad.dominio.Permisos;
import seguridad.dominio.Usuario;

/**
 *
 * @author Diego Vásquez
 */
public class MDI_Sistema extends javax.swing.JFrame {

    private Aplicacion_Perfil NuevaVentana;

    private Mantenimiento_Modulos formMantenimiento_Modulo;
    private Mantenimiento_Aplicacion formMantenimiento_Aplicacion;
    private Asignacion_modulos formModulos;

    private Mantenimiento_Perfil formMantenimiento_Perfil;
    private Asignacion_usuario_Perfil1 formUsuarioPerfil;
    private Asignacion_de_aplicacion_a_usuario formAsignacion_de_aplicacion_a_usuario;
    private FmrBitacora formFmrBitacora;

    /**
     * Creates new form MDI_Seguridad
     *
     * @throws java.net.UnknownHostException
     */
    MDI_Components mdi_components = new MDI_Components();

    GenerarPermisos generarPermisos = new GenerarPermisos();
    
     
    /*------------------------------------------*/
    public MDI_Sistema() throws UnknownHostException {
        initComponents();

        this.setTitle("Usuario: " + "[" + Login.usuarioSesion + "]" + " \t" + "IP: [" + mdi_components.getIp() + "]");

        var usuario = Login.usuarioSesion;
        var modulo = "Seguridad";

        //generarPermisos.getPermisos(modulo, usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane_Escritorio = new javax.swing.JDesktopPane()
        ;
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Archivo = new javax.swing.JMenu();
        JMenuItem_CerrarSesion = new javax.swing.JMenuItem();
        JMenu_Seguridad = new javax.swing.JMenu();
        JMenu_Asignaciones = new javax.swing.JMenu();
        JMenuItem_AplicacionesUsuario = new javax.swing.JMenuItem();
        JMenuItem_AplicacionesPerfiles = new javax.swing.JMenuItem();
        JMenuItem_PerfilesUsuarios = new javax.swing.JMenuItem();
        JMenuItem_AplicacionesModulos = new javax.swing.JMenuItem();
        JMenuItem_Bitacora = new javax.swing.JMenuItem();
        JMenu_Mantenimientos = new javax.swing.JMenu();
        JMenuItem_Usuarios = new javax.swing.JMenuItem();
        JMenuItem_Aplicaciones = new javax.swing.JMenuItem();
        JMenuItem_Perfiles = new javax.swing.JMenuItem();
        JMenuItem_Modulos = new javax.swing.JMenuItem();
        JMenuItemCambioC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        JDesktopPane_Escritorio.setBackground(new java.awt.Color(10, 10, 211));

        JDesktopPane_Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopPane_EscritorioLayout = new javax.swing.GroupLayout(JDesktopPane_Escritorio);
        JDesktopPane_Escritorio.setLayout(JDesktopPane_EscritorioLayout);
        JDesktopPane_EscritorioLayout.setHorizontalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDesktopPane_EscritorioLayout.createSequentialGroup()
                .addContainerGap(755, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );
        JDesktopPane_EscritorioLayout.setVerticalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDesktopPane_EscritorioLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );

        JMenu_Archivo.setText("Archivo");
        JMenu_Archivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_CerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_CerrarSesion.setText("Cerrar Sesión");
        JMenuItem_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_CerrarSesionActionPerformed(evt);
            }
        });
        JMenu_Archivo.add(JMenuItem_CerrarSesion);

        jMenuBar1.add(JMenu_Archivo);

        JMenu_Seguridad.setText("Seguridad");
        JMenu_Seguridad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenu_Asignaciones.setText("Asignaciones");
        JMenu_Asignaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_AplicacionesUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_AplicacionesUsuario.setText("Aplicaciones - Usuario");
        JMenuItem_AplicacionesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_AplicacionesUsuarioActionPerformed(evt);
            }
        });
        JMenu_Asignaciones.add(JMenuItem_AplicacionesUsuario);

        JMenuItem_AplicacionesPerfiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_AplicacionesPerfiles.setText("Aplicaciones - Perfiles");
        JMenuItem_AplicacionesPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_AplicacionesPerfilesActionPerformed(evt);
            }
        });
        JMenu_Asignaciones.add(JMenuItem_AplicacionesPerfiles);

        JMenuItem_PerfilesUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_PerfilesUsuarios.setText("Perfiles - Usuarios");
        JMenuItem_PerfilesUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_PerfilesUsuariosActionPerformed(evt);
            }
        });
        JMenu_Asignaciones.add(JMenuItem_PerfilesUsuarios);

        JMenuItem_AplicacionesModulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_AplicacionesModulos.setText("Aplicaciones - Módulos");
        JMenuItem_AplicacionesModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_AplicacionesModulosActionPerformed(evt);
            }
        });
        JMenu_Asignaciones.add(JMenuItem_AplicacionesModulos);

        JMenu_Seguridad.add(JMenu_Asignaciones);

        JMenuItem_Bitacora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Bitacora.setText("Bitácora");
        JMenuItem_Bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_BitacoraActionPerformed(evt);
            }
        });
        JMenu_Seguridad.add(JMenuItem_Bitacora);

        JMenu_Mantenimientos.setText("Mantenimientos");
        JMenu_Mantenimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_Usuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Usuarios.setText("Usuarios");
        JMenuItem_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_UsuariosActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Usuarios);

        JMenuItem_Aplicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Aplicaciones.setText("Aplicaciones");
        JMenuItem_Aplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_AplicacionesActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Aplicaciones);

        JMenuItem_Perfiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Perfiles.setText("Perfiles");
        JMenuItem_Perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_PerfilesActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Perfiles);

        JMenuItem_Modulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Modulos.setText("Módulos");
        JMenuItem_Modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_ModulosActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Modulos);

        JMenu_Seguridad.add(JMenu_Mantenimientos);

        JMenuItemCambioC.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuItemCambioC.setText("Cambio de contraseña");
        JMenuItemCambioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemCambioCActionPerformed(evt);
            }
        });
        JMenu_Seguridad.add(JMenuItemCambioC);

        jMenuBar1.add(JMenu_Seguridad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void JMenuItem_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_CerrarSesionActionPerformed
        /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_JMenuItem_CerrarSesionActionPerformed


    private void JMenuItem_ModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_ModulosActionPerformed
        formMantenimiento_Modulo = new Mantenimiento_Modulos();
        formMantenimiento_Modulo.setVisible(true);
        JDesktopPane_Escritorio.add(formMantenimiento_Modulo);
    }//GEN-LAST:event_JMenuItem_ModulosActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        formMantenimiento_Modulo = new Mantenimiento_Modulos();
        JDesktopPane_Escritorio.add(formMantenimiento_Modulo);


    }//GEN-LAST:event_jMenuItem10ActionPerformed


    private void JMenuItem_AplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_AplicacionesActionPerformed
        formMantenimiento_Aplicacion = new Mantenimiento_Aplicacion();
        formMantenimiento_Aplicacion.setVisible(true);
        JDesktopPane_Escritorio.add(formMantenimiento_Aplicacion);
    }//GEN-LAST:event_JMenuItem_AplicacionesActionPerformed

    private void JMenuItem_PerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_PerfilesActionPerformed
        formMantenimiento_Perfil = new Mantenimiento_Perfil();
        JDesktopPane_Escritorio.add(formMantenimiento_Perfil);

    }//GEN-LAST:event_JMenuItem_PerfilesActionPerformed

    private void JMenuItem_AplicacionesPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_AplicacionesPerfilesActionPerformed
        // TODO add your handling code here:
        NuevaVentana = new Aplicacion_Perfil();
        JDesktopPane_Escritorio.add(NuevaVentana);
    }//GEN-LAST:event_JMenuItem_AplicacionesPerfilesActionPerformed

    private void JMenuItem_AplicacionesModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_AplicacionesModulosActionPerformed
        //  Asignacionmodulos Rita Sipaque
        formModulos = new Asignacion_modulos();
        formModulos.setVisible(true);
        JDesktopPane_Escritorio.add(formModulos);
    }//GEN-LAST:event_JMenuItem_AplicacionesModulosActionPerformed

    private void JMenuItem_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_UsuariosActionPerformed
        Mantenimiento_Usuario frm_mantusu = new Mantenimiento_Usuario();
        frm_mantusu.setVisible(true);
        JDesktopPane_Escritorio.add(frm_mantusu);
    }//GEN-LAST:event_JMenuItem_UsuariosActionPerformed

    private void JMenuItem_PerfilesUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_PerfilesUsuariosActionPerformed
        // TODO add your handling code here:

        formUsuarioPerfil = new Asignacion_usuario_Perfil1();
        JDesktopPane_Escritorio.add(formUsuarioPerfil);
    }//GEN-LAST:event_JMenuItem_PerfilesUsuariosActionPerformed

    private void JMenuItem_AplicacionesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_AplicacionesUsuarioActionPerformed
        formAsignacion_de_aplicacion_a_usuario = new Asignacion_de_aplicacion_a_usuario();
        JDesktopPane_Escritorio.add(formAsignacion_de_aplicacion_a_usuario);
    }//GEN-LAST:event_JMenuItem_AplicacionesUsuarioActionPerformed

    private void JMenuItemCambioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemCambioCActionPerformed
        CambioC cambioContraseña = new CambioC();
        cambioContraseña.setVisible(true);
    }//GEN-LAST:event_JMenuItemCambioCActionPerformed

    private void JMenuItem_BitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_BitacoraActionPerformed
        formFmrBitacora = new FmrBitacora();
        formFmrBitacora.setVisible(true);
        JDesktopPane_Escritorio.add(formFmrBitacora);
    }//GEN-LAST:event_JMenuItem_BitacoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
//            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDI_Sistema().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDI_Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane_Escritorio;
    private javax.swing.JMenuItem JMenuItemCambioC;
    public static javax.swing.JMenuItem JMenuItem_Aplicaciones;
    public static javax.swing.JMenuItem JMenuItem_AplicacionesModulos;
    public static javax.swing.JMenuItem JMenuItem_AplicacionesPerfiles;
    public static javax.swing.JMenuItem JMenuItem_AplicacionesUsuario;
    public static javax.swing.JMenuItem JMenuItem_Bitacora;
    private javax.swing.JMenuItem JMenuItem_CerrarSesion;
    public static javax.swing.JMenuItem JMenuItem_Modulos;
    public static javax.swing.JMenuItem JMenuItem_Perfiles;
    public static javax.swing.JMenuItem JMenuItem_PerfilesUsuarios;
    public static javax.swing.JMenuItem JMenuItem_Usuarios;
    public javax.swing.JMenu JMenu_Archivo;
    public static javax.swing.JMenu JMenu_Asignaciones;
    public static javax.swing.JMenu JMenu_Mantenimientos;
    public javax.swing.JMenu JMenu_Seguridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
