/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab07_Pantallas;

import Lab07_Entidades.Paciente;
import laboratorio07.Laboratorio07;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;




import java.util.List;
import javax.swing.DefaultListModel;


/**
 *
 * @author Frank
 */
public class JFramePaciente extends javax.swing.JFrame {

    private JFrameCita padre;
    private List<Paciente> pacientes;
    private DefaultListModel<String> modeloListPacientes;
    /**
     * Creates new form JFramePaciente
     */
    public JFramePaciente(JFrameCita padre) {
        initComponents();
        this.padre = padre;
        this.pacientes = Laboratorio07.listaDePacientes;
        modeloListPacientes = new DefaultListModel<>();
        this.lstPacientes.setModel(modeloListPacientes);
        buscar("");
    }
    
    private void buscar (String criterio){
        this.modeloListPacientes.removeAllElements();
        
        for (Paciente paciente: pacientes){
            if(paciente.getNombre()!=null && paciente.getNombre().contains(criterio)){
                this.modeloListPacientes.addElement(paciente.getDatosMostrar());
            }
        }
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
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPacientes = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/lblPacientes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        txtBuscar.setText("|");
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 360, 30));

        lstPacientes.setBackground(new java.awt.Color(255, 204, 51));
        lstPacientes.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lstPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPacientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 570, 270));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 130, 70));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 160, 80));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/btnCrearPaciente.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 200, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab07_ImagenesFigma/txtBuscar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

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

    private void lstPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPacientesMouseClicked

        if(evt.getClickCount()>1){
            Paciente paciente = pacientes.get(lstPacientes.getSelectedIndex());
            this.padre.setPaciente(paciente);
            salir();
        }
    }//GEN-LAST:event_lstPacientesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        buscar (txtBuscar.getText().trim());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        JFrameEditarPaciente pantallaPaciente = new JFrameEditarPaciente(this);
        pantallaPaciente.setLocationRelativeTo(null);
        pantallaPaciente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        pantallaPaciente.setVisible(true);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void agregarNuevoPaciente(Paciente paciente){
        pacientes.add(paciente);
        buscar("");
    }
    
    private void salir(){
        padre.setVisible(true);
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(JFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePaciente(new JFrameCita(new JFrameGestorDeCitas())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
