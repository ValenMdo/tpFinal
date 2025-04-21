package vistas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import modelos.Administrador;
import modelos.BaseUsuarios;
import modelos.Trabajador;
import modelos.Usuario;

public class VentanaPrincipal extends javax.swing.JFrame {

    private JPanel panelInicio;
    private JPanel panelTickets;
    private JPanel panelUsuarios;
    private JPanel panelSoporte;

    private Usuario usuarioActual; //para aplicar dinamismo a la vista segun el rol
    private BaseUsuarios baseUs;

    public VentanaPrincipal(Usuario usuarioActual, BaseUsuarios baseUs) {
        this.usuarioActual = usuarioActual;
        this.baseUs = baseUs;

        initComponents();

        //mostrar vista por defecto al inicio
        pInicio p1 = new pInicio();
        mostrarVista(p1);

    }

    //------------------------------------------------------------------------------------------
    private void mostrarVista(JPanel panel) { //funcion para mostrar la vista correspondiente
        panel.setSize(1010, 782);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    //------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnSoporte = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar.setBackground(new java.awt.Color(153, 153, 255));

        btnInicio.setBackground(new java.awt.Color(153, 153, 255));
        btnInicio.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnTickets.setBackground(new java.awt.Color(153, 153, 255));
        btnTickets.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(0, 0, 0));
        btnTickets.setText("TICKETS");
        btnTickets.setBorder(null);
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(153, 153, 255));
        btnPerfil.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setText("PERFIL");
        btnPerfil.setBorder(null);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnSoporte.setBackground(new java.awt.Color(153, 153, 255));
        btnSoporte.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnSoporte.setForeground(new java.awt.Color(0, 0, 0));
        btnSoporte.setText("SOPORTE");
        btnSoporte.setBorder(null);
        btnSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnSoporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        background.add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        content.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 782));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pInicio p1 = new pInicio();
        mostrarVista(p1);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        pTickets p2 = new pTickets();
        mostrarVista(p2);
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        pPerfil p3 = new pPerfil(usuarioActual, baseUs);//ojo
        mostrarVista(p3);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoporteActionPerformed
        pSoporte p4 = new pSoporte();
        mostrarVista(p4);
    }//GEN-LAST:event_btnSoporteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        BaseUsuarios sistemaUs1 = new BaseUsuarios(); //prueba -------------------------------------
        Usuario us1 = new Administrador(101, "Carlos", "carlos@gmail.com", sistemaUs1);
        Usuario us2 = new Trabajador(102, "Lucas", "lucas@gmail.com");

        Usuario us3 = new Trabajador(106, "Lujan", "luji@gmail.com");

        Usuario us4 = new Trabajador(110, "pepe", "pepe@gmail.com");

        sistemaUs1.agregarUsuario(us4);
        sistemaUs1.agregarUsuario(us3);
        sistemaUs1.agregarUsuario(us2);

        // prueba -----------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(us1, sistemaUs1).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSoporte;
    private javax.swing.JButton btnTickets;
    private javax.swing.JPanel content;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}
