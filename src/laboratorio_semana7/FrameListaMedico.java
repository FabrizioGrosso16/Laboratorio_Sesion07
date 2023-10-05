/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio_semana7;

/**
 *
 * @author User001
 */
public class FrameListaMedico extends javax.swing.JFrame {

   private FrameNuevaCita padre;
    public FrameListaMedico(FrameNuevaCita padre) {
        initComponents();
        this.padre = padre;
    }

    private FrameListaMedico() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarMedicoCMP = new javax.swing.JTextField();
        bttCancelarFLP = new javax.swing.JButton();
        bttBuscarMedicoCMP = new javax.swing.JButton();
        bttCrearMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMedico = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBuscarMedicoCMP.setText("jTextField1");
        txtBuscarMedicoCMP.setMaximumSize(new java.awt.Dimension(149, 30));
        txtBuscarMedicoCMP.setMinimumSize(new java.awt.Dimension(149, 30));
        txtBuscarMedicoCMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMedicoCMPActionPerformed(evt);
            }
        });

        bttCancelarFLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 4.png"))); // NOI18N
        bttCancelarFLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarFLPActionPerformed(evt);
            }
        });

        bttBuscarMedicoCMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 8.png"))); // NOI18N
        bttBuscarMedicoCMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarMedicoCMPActionPerformed(evt);
            }
        });

        bttCrearMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 10 (2).png"))); // NOI18N
        bttCrearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCrearMedicoActionPerformed(evt);
            }
        });

        lstMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstMedico);

        jLabel3.setText("Ingresa CMP a buscar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Medicos");

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clinica oeste 1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(bttCrearMedico))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bttCancelarFLP))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBuscarMedicoCMP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(bttBuscarMedicoCMP))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3))
            .addComponent(fondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(bttCrearMedico))
            .addComponent(jLabel2)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(bttCancelarFLP))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtBuscarMedicoCMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bttBuscarMedicoCMP))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3))
            .addComponent(fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMedicoCMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMedicoCMPActionPerformed

    }//GEN-LAST:event_txtBuscarMedicoCMPActionPerformed

    private void bttCancelarFLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarFLPActionPerformed
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttCancelarFLPActionPerformed

    private void bttBuscarMedicoCMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarMedicoCMPActionPerformed
        
    }//GEN-LAST:event_bttBuscarMedicoCMPActionPerformed

    private void bttCrearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCrearMedicoActionPerformed

        FrameAgregarMedico ventanacurso = new FrameAgregarMedico(this);
        ventanacurso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttCrearMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttBuscarMedicoCMP;
    private javax.swing.JButton bttCancelarFLP;
    private javax.swing.JButton bttCrearMedico;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstMedico;
    private javax.swing.JTextField txtBuscarMedicoCMP;
    // End of variables declaration//GEN-END:variables
}