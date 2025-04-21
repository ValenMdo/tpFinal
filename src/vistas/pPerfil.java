/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelos.BaseUsuarios;
import modelos.Usuario;

/**
 *
 * @author valen
 */
public class pPerfil extends javax.swing.JPanel {

    /**
     * Creates new form pPerfil
     * @param usuario
     * @param b1
     */
    
    // original: pPerfil(){ init() }
    public pPerfil(Usuario usuario, BaseUsuarios b1) {
        //-------------------------
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Perfil de " + usuario.getNombre(), JLabel.CENTER);
        add(titulo, BorderLayout.NORTH);
       

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));

        panelCentro.add(new JLabel("Correo: " + usuario.getEmail()));
        panelCentro.add(Box.createVerticalStrut(10));

        if (usuario.obtenerTipoUsuario().equalsIgnoreCase("Administrador")) {
            JButton btnUsuarios = new JButton("Gestionar Usuarios");
            panelCentro.add(btnUsuarios);

            btnUsuarios.addActionListener(e -> {
                StringBuilder sb = new StringBuilder("📋 Lista de usuarios registrados:\n\n");
                for (Usuario u : b1.getUsuarios().values()) {
                    sb.append("• ").append(u.getNombre()).append(" - ").append(u.obtenerTipoUsuario()).append("\n");
                }
                JOptionPane.showMessageDialog(this, sb.toString(), "Usuarios del sistema", JOptionPane.INFORMATION_MESSAGE);
            });
        }

        add(panelCentro, BorderLayout.CENTER);
        //---------
        //initComponents();
    }
    //-------------------------

    //-------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setMaximumSize(new java.awt.Dimension(1010, 782));
        BG.setMinimumSize(new java.awt.Dimension(1010, 782));
        BG.setPreferredSize(new java.awt.Dimension(1010, 782));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PERFIL");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(717, Short.MAX_VALUE))
        );

        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
