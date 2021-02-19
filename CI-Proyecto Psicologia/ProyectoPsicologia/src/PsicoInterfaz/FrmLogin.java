package PsicoInterfaz;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.Psicologia;
import Entidad.Especialista;

public class FrmLogin extends javax.swing.JFrame {

    Especialista Especialista;
    Psicologia Psico;
    public FrmLogin() {
        initComponents();
        
        this.setSize(580, 440);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btning = new javax.swing.JButton();
        txtpwd = new javax.swing.JPasswordField();
        txtusu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Cerrar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCESO");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btning.setBackground(new java.awt.Color(0, 153, 153));
        btning.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Iniciar.png"))); // NOI18N
        btning.setToolTipText("");
        btning.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btning.setBorderPainted(false);
        btning.setContentAreaFilled(false);
        btning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btning.setFocusPainted(false);
        btning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningActionPerformed(evt);
            }
        });
        jPanel1.add(btning, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 30));

        txtpwd.setBackground(new java.awt.Color(33, 45, 62));
        txtpwd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtpwd.setForeground(new java.awt.Color(255, 255, 255));
        txtpwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpwd.setBorder(null);
        jPanel1.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 190, 40));

        txtusu.setBackground(new java.awt.Color(33, 45, 62));
        txtusu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtusu.setForeground(new java.awt.Color(255, 255, 255));
        txtusu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusu.setToolTipText("");
        txtusu.setBorder(null);
        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });
        jPanel1.add(txtusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario (DNI):");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 120, -1));

        jSeparator1.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 4));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 190, 20));

        jSeparator2.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 190, 30));

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(15, 121, 134));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/User.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 40, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Contraseña.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 40));

        jPanel2.setBackground(new java.awt.Color(133, 175, 203));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Logo.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Bienvenido.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 440));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningActionPerformed
        try {
            Especialista = new Especialista();
            Psico = new Psicologia();

            Especialista.setUsuario(txtusu.getText());
            Especialista.setPassword(txtpwd.getText());

            boolean check = false;

            DefaultTableModel Modelo = new DefaultTableModel();
            Modelo = Psico.VerificarUser(Especialista);

            if(Modelo.getRowCount() == 1){
                check = true;
            }else{
                check = false;
            }

            if(check == true){
                String especialista = "";
                String codigo = "";

                especialista = Modelo.getValueAt(0, 2).toString();
                codigo = Modelo.getValueAt(0, 0).toString();

                FrmMenu frm = new FrmMenu(codigo,especialista);
                frm.setVisible(true);
                this.setVisible(false);
            }else {
                JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecto");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btningActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton btning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
