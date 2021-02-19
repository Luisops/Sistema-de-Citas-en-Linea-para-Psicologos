
package PsicoInterfaz;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controlador.Psicologia;
import Entidad.Paciente;

public class FrmBuscarPaciente extends javax.swing.JFrame {

    Psicologia objneg;
    public FrmBuscarPaciente() {
        initComponents();
        this.setSize(560, 340);
        this.setLocationRelativeTo(null);
       
       /*Llamar al metodo de busqueda de pacientes */
       ListarPaciente("");
        PnNuevo.setVisible(false);
    }
    
    /*Metodo de busqueda de paceitnes*/
    void ListarPaciente(String buscar){
      try {
           /* Instancia a la clase negocio de la capa Negocio*/
           objneg=new Psicologia();
          /* Crea una tabla temporal*/
           DefaultTableModel model=new DefaultTableModel();
           /*Se realiza la busqueda y el resultado se asigna a la tabla temporal*/
           model=objneg.BuscarPaciente(buscar);
           /*Se muestra el resultado en nuestra Grilla*/
           tbpaciente.setModel(model);
            PnNuevo.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
      void LimpiarPaciente(){
        txtdni.setText("");
        txtnom.setText("");
        txtpat.setText("");
        txtmat.setText("");
        txtcorreo.setText("");
        PnNuevo.setVisible(false);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PnNuevo = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtpat = new javax.swing.JTextField();
        txtmat = new javax.swing.JTextField();
        cbosexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpaciente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtbusq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Cerrar = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnsel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(189, 223, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnNuevo.setBackground(new java.awt.Color(130, 194, 133));
        PnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PnNuevo.setToolTipText("");
        PnNuevo.setLayout(null);

        btnregistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(0, 53, 134));
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Registrar.png"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.setBorder(null);
        btnregistrar.setContentAreaFilled(false);
        btnregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        PnNuevo.add(btnregistrar);
        btnregistrar.setBounds(220, 110, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 53, 134));
        jLabel1.setText("DNI:");
        PnNuevo.add(jLabel1);
        jLabel1.setBounds(330, 20, 40, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 134));
        jLabel4.setText("Nombres:");
        PnNuevo.add(jLabel4);
        jLabel4.setBounds(30, 20, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 53, 134));
        jLabel5.setText("Ap Paterno:");
        PnNuevo.add(jLabel5);
        jLabel5.setBounds(20, 50, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 53, 134));
        jLabel6.setText("Correo:");
        PnNuevo.add(jLabel6);
        jLabel6.setBounds(40, 80, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 53, 134));
        jLabel8.setText("Ap Materno:");
        PnNuevo.add(jLabel8);
        jLabel8.setBounds(290, 50, 80, 20);
        PnNuevo.add(txtcorreo);
        txtcorreo.setBounds(100, 80, 140, 20);
        PnNuevo.add(txtdni);
        txtdni.setBounds(370, 20, 140, 20);
        PnNuevo.add(txtnom);
        txtnom.setBounds(100, 20, 140, 20);
        PnNuevo.add(txtpat);
        txtpat.setBounds(100, 50, 140, 20);
        PnNuevo.add(txtmat);
        txtmat.setBounds(370, 50, 140, 20);

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        PnNuevo.add(cbosexo);
        cbosexo.setBounds(370, 80, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 53, 134));
        jLabel7.setText("Sexo:");
        PnNuevo.add(jLabel7);
        jLabel7.setBounds(320, 80, 50, 20);

        jPanel1.add(PnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 560, 150));

        jScrollPane1.setBackground(new java.awt.Color(189, 223, 191));
        jScrollPane1.setForeground(new java.awt.Color(0, 53, 134));

        tbpaciente.setBackground(new java.awt.Color(189, 223, 191));
        tbpaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbpaciente.setForeground(new java.awt.Color(0, 42, 107));
        tbpaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombres", "Apellidos", "DNI"
            }
        ));
        tbpaciente.setToolTipText("");
        tbpaciente.setGridColor(new java.awt.Color(15, 121, 134));
        tbpaciente.setSelectionBackground(new java.awt.Color(33, 208, 195));
        jScrollPane1.setViewportView(tbpaciente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 560, 150));

        jPanel2.setBackground(new java.awt.Color(15, 121, 134));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbusq.setBackground(new java.awt.Color(15, 121, 134));
        txtbusq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbusq.setForeground(new java.awt.Color(255, 255, 255));
        txtbusq.setBorder(null);
        txtbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusqActionPerformed(evt);
            }
        });
        jPanel2.add(txtbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 300, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paciente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, -1));

        jSeparator2.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator2.setForeground(new java.awt.Color(45, 45, 45));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, 20));

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel2.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setBorder(null);
        btnnuevo.setContentAreaFilled(false);
        btnnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/paciente.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 150));

        btnsel.setBackground(new java.awt.Color(255, 255, 255));
        btnsel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/check.png"))); // NOI18N
        btnsel.setText("Seleccionar");
        btnsel.setBorder(null);
        btnsel.setContentAreaFilled(false);
        btnsel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselActionPerformed(evt);
            }
        });
        jPanel1.add(btnsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusqActionPerformed
        String buscar="";
        buscar=txtbusq.getText();
        ListarPaciente(buscar);
    }//GEN-LAST:event_txtbusqActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselActionPerformed
        try{
        String dni= tbpaciente.getValueAt(tbpaciente.getSelectedRow(),0).toString();
        String pacientes= tbpaciente.getValueAt(tbpaciente.getSelectedRow(),1).toString()+" " +tbpaciente.getValueAt(tbpaciente.getSelectedRow(),2).toString();

        PsicoInterfaz.FrmMenu.FProgramar.txtcodpac.setText(dni);
        PsicoInterfaz.FrmMenu.FProgramar.txtpac.setText(pacientes);
        this.dispose();
        
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Seleccione un paciente","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnselActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
           PnNuevo.setVisible(true);
    }//GEN-LAST:event_btnnuevoActionPerformed
      
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        try{
        objneg=new Psicologia();
        Paciente objpac=new Paciente();
        
        objpac.setDni(txtdni.getText());
        objpac.setNombres(txtnom.getText());
        objpac.setApePat(txtpat.getText());
        objpac.setApeMate(txtmat.getText());
        objpac.setCorreo(txtcorreo.getText());
        String cad=cbosexo.getSelectedItem().toString();
        objpac.setSexo(""+cad.charAt(0));
        int Rpta=0;
        
        Rpta=objneg.RegistrarPaciente(objpac);

        if(Rpta>0){
            JOptionPane.showMessageDialog(null,"Se registro Paciente Correctamente");
            LimpiarPaciente();
            ListarPaciente("");
          }
        
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al insertar paciente","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarPaciente().setVisible(true);
            }
        });

         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel PnNuevo;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsel;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbpaciente;
    private javax.swing.JTextField txtbusq;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtmat;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpat;
    // End of variables declaration//GEN-END:variables
}
