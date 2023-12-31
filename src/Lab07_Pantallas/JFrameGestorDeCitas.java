/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab07_Pantallas;

import Lab07_Entidades.Cita;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import laboratorio07.Laboratorio07;


/**
 *
 * @author Frank
 */
public class JFrameGestorDeCitas extends javax.swing.JFrame {
    
    private List<Cita> listaCitas;
    private DefaultListModel<String> modelListCitasShow;

    /**
     * Creates new form JFrameGestorDeCitas
     */
    public JFrameGestorDeCitas() {
        initComponents();
        listaCitas = Laboratorio07.citasEnElSistema;
        modelListCitasShow = new DefaultListModel<>();
        this.lstCitas.setModel(modelListCitasShow);
        modelListCitasShow.removeAllElements();
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
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCitas = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnALtF4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        txtBuscar.setText("|");
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 360, 30));

        lstCitas.setBackground(new java.awt.Color(51, 255, 204));
        lstCitas.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lstCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 610, 300));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnCancelarCita.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnNuevaCita.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        btnALtF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnAltF4.png"))); // NOI18N
        btnALtF4.setBorder(null);
        btnALtF4.setContentAreaFilled(false);
        btnALtF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALtF4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnALtF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/lblGestordeCitas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/txtBuscar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        volverACargarCitas(txtBuscar.getText().trim());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void agregarCita(Cita nuevaCita){
        listaCitas.add(nuevaCita);
        
        modelListCitasShow.removeAllElements();
        for(Cita citaDeLista: listaCitas){
            modelListCitasShow.addElement(citaDeLista.mostrarDatos());
        }

    }
    private void volverACargarCitas(String criterio){
            
        modelListCitasShow.removeAllElements();
        for(Cita cita: listaCitas){
            if(cita.getPaciente().getNombre().contains(criterio)){
                modelListCitasShow.addElement(cita.mostrarDatos());
            }
        }
    }
        
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        JFrameCita nuevaCita = new JFrameCita(this);
        nuevaCita.setLocationRelativeTo(this);
        nuevaCita.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void lstCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCitasMouseClicked

        if(evt.getClickCount()>1){
            JFrameCita cita = new JFrameCita(this, listaCitas.get(lstCitas.getSelectedIndex()));
            cita.setLocationRelativeTo(null);
            cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lstCitasMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int index = lstCitas.getSelectedIndex();
        listaCitas.remove(index);
        volverACargarCitas("");
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnALtF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALtF4ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnALtF4ActionPerformed


    
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
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorDeCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestorDeCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALtF4;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstCitas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
