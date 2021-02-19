package PsicoInterfaz;

import Controlador.Control;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import Controlador.Psicologia;
import Entidad.Cita;
import Entidad.Det_Cita;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class FrmCitas extends javax.swing.JFrame {
    JTable tabla;
    Psicologia objneg;
    Cita objcita;
    Control datos;
    Det_Cita objDet;
    
    String psicologo_form = "";
    String cod_psico_form = "";
   
    public FrmCitas() {
        initComponents();
        this.setSize(530, 680);
        this.setLocationRelativeTo(null);
    }
    
     public FrmCitas(String codigo,String nombre) {
        initComponents();
        this.setSize(530, 680);
        this.setLocationRelativeTo(null);
        
        psicologo_form = nombre;
        cod_psico_form = codigo;
        
        lblcodigo.setText(codigo);
        lblpsicologo.setText(nombre);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblpsicologo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fechadesde = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        fechahasta = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCitas = new javax.swing.JTable();
        btnatender = new javax.swing.JButton();
        btnagendar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblcant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(189, 223, 191));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(12, 135, 67));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Psicologo.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 130));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 60, -1));

        lblpsicologo.setBackground(new java.awt.Color(255, 255, 255));
        lblpsicologo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpsicologo.setForeground(new java.awt.Color(255, 255, 255));
        lblpsicologo.setText("$psicologo");
        jPanel4.add(lblpsicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Psicólogo:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, -1));

        lblcodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("$codigo");
        jPanel4.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 20));

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(15, 121, 134));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel4.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 80, 20));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 240, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 170));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Citacion.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 130));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Desde:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 14));
        jPanel3.add(fechadesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Hasta:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 50, 14));
        jPanel3.add(fechahasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Estado:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 60, -1));

        cboEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado", "Atendido", "Anulado" }));
        cboEstado.setBorder(null);
        cboEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboEstado.setOpaque(false);
        jPanel3.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 30));

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(null);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setFocusPainted(false);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 100, -1));

        jScrollPane2.setBackground(new java.awt.Color(189, 223, 191));
        jScrollPane2.setForeground(new java.awt.Color(0, 42, 107));
        jScrollPane2.setToolTipText("");

        jScrollPane1.setBackground(new java.awt.Color(189, 223, 191));
        jScrollPane1.setForeground(new java.awt.Color(0, 42, 107));
        jScrollPane1.setToolTipText("");

        tbCitas.setBackground(new java.awt.Color(189, 223, 191));
        tbCitas.setForeground(new java.awt.Color(0, 42, 107));
        tbCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de Cita", "Estado", "Paciente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCitas.setToolTipText("");
        tbCitas.setGridColor(new java.awt.Color(15, 121, 134));
        tbCitas.setSelectionBackground(new java.awt.Color(33, 208, 195));
        tbCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCitas);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 530, 270));

        btnatender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnatender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Atender.png"))); // NOI18N
        btnatender.setText("Atender");
        btnatender.setBorder(null);
        btnatender.setContentAreaFilled(false);
        btnatender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatenderActionPerformed(evt);
            }
        });
        jPanel3.add(btnatender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 110, 40));

        btnagendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.png"))); // NOI18N
        btnagendar.setText("Programar Cita");
        btnagendar.setBorder(null);
        btnagendar.setContentAreaFilled(false);
        btnagendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });
        jPanel3.add(btnagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 150, 40));

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png"))); // NOI18N
        btncancelar.setText("Anular Cita");
        btncancelar.setBorder(null);
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 120, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nro de Citas:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 100, -1));

        lblcant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcant.setText("0");
        jPanel3.add(lblcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 40, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 530, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        FrmMenu back = new FrmMenu();
        back.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try{
        objneg = new Psicologia();
        objcita = new Cita();
        
        /* PARAMETROS PARA LA CONSULTA*/
        datos = new Control();
        String dia = Integer.toString(fechadesde.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(fechadesde.getCalendar().get(Calendar.MONTH)+1);
        String anio = Integer.toString(fechadesde.getCalendar().get(Calendar.YEAR));
        String fechadesde = (anio + "-" + mes+ "-" +dia);
        objcita.setFechaInicio(fechadesde);
        String dia1 = Integer.toString(fechahasta.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes1 = Integer.toString(fechahasta.getCalendar().get(Calendar.MONTH)+1);
        String anio1 = Integer.toString(fechahasta.getCalendar().get(Calendar.YEAR));
        String fechahasta = (anio1 + "-" + mes1+ "-" +dia1);
        String estado = ""+cboEstado.getSelectedIndex();

        objcita.setEstado(estado);
        objcita.setFechaFin(fechahasta);
        objcita.setEspecialista(cod_psico_form);

        /* Crea una tabla temporal*/

        DefaultTableModel model = new DefaultTableModel();
        /*Se realiza la busqueda y el resultado se asigna a la tabla temporal*/
        model = objneg.ListadoCita(objcita);
        /*Se muestra el resultado en nuestra Grilla*/
        tbCitas.setModel(model);
        lblcant.setText(Integer.toString(model.getRowCount()));

        tbCitas.getColumnModel().getColumn(3).setMaxWidth(0);
        tbCitas.getColumnModel().getColumn(3).setMinWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);

        tbCitas.getColumnModel().getColumn(4).setMinWidth(180);
        tbCitas.getColumnModel().getColumn(4).setMaxWidth(250);
        tbCitas.getTableHeader().getColumnModel().getColumn(4).setMinWidth(180);
        tbCitas.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(250);

        tbCitas.getColumnModel().getColumn(5).setMinWidth(0);
        tbCitas.getColumnModel().getColumn(5).setMaxWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);

        tbCitas.getColumnModel().getColumn(6).setMaxWidth(0);
        tbCitas.getColumnModel().getColumn(6).setMinWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        tbCitas.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
         }catch(Exception e){
            
                JOptionPane.showMessageDialog(null,"Ingrese paràmetros de busqueda","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tbCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCitasMouseClicked

    }//GEN-LAST:event_tbCitasMouseClicked

    private void btnatenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatenderActionPerformed
        EnviarParametros("1");
    }//GEN-LAST:event_btnatenderActionPerformed

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        EnviarParametros("2");
    }//GEN-LAST:event_btnagendarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        int Mensaje = 0;
        Mensaje = JOptionPane.showConfirmDialog(null, "¿Esta seguro que cancelar cita?", "Mensaje",JOptionPane.YES_OPTION);

        if(Mensaje == JOptionPane.YES_OPTION){

            try{
                String tipo_cita = "";
                String idcita = "";
                tipo_cita = tbCitas.getValueAt(tbCitas.getSelectedRow(),6).toString();
                idcita = tbCitas.getValueAt(tbCitas.getSelectedRow(),0).toString();

                if(tipo_cita.equals("0")){ /* TIPO DE CITA CONSULTA*/
                    objcita = new Cita();
                    objneg = new Psicologia();
                    int Rpta=0;

                    objcita.setId_Cita(idcita);
                    objcita.setDiagnostico("");
                    objcita.setTipoCita("consulta");
                    objcita.setEstado("3");

                    Rpta=objneg.AtenderCita(objcita);

                    if(Rpta!=0){
                        JOptionPane.showMessageDialog(null,"Se Cancelo Cita Correctamente");
                    }
                }else { /* TIPO DE CITA TRATAMIENTO*/

                    objDet = new Det_Cita();
                    objneg = new Psicologia();
                    int Rpta = 0;

                    objDet.setId_cita(idcita);
                    objDet.setId_det_cita(Integer.parseInt(tipo_cita));
                    objDet.setDiagnostico("");
                    objDet.setEstado("3");

                    Rpta = objneg.AtenderCitaTratamiento(objDet);

                    if(Rpta!=0){
                        JOptionPane.showMessageDialog(null,"Se Cancelo Cita Correctamente");
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"¡Seleccione una Cita!");
            }
        }

    }//GEN-LAST:event_btncancelarActionPerformed
        
    void EnviarParametros(String accion){
        
         try{
              
            String idcita = "";
            String cod_paciente = "";
            String nom_paciente = "";
            String tipo_cita = "";

            idcita = tbCitas.getValueAt(tbCitas.getSelectedRow(),0).toString();
            cod_paciente = tbCitas.getValueAt(tbCitas.getSelectedRow(),3).toString();
            nom_paciente = tbCitas.getValueAt(tbCitas.getSelectedRow(),4).toString();
            tipo_cita = tbCitas.getValueAt(tbCitas.getSelectedRow(),6).toString();
            
            PsicoInterfaz.FrmMenu.FProgramar = new FrmProgramar(accion,tipo_cita,cod_psico_form,psicologo_form);
          
            PsicoInterfaz.FrmMenu.FProgramar.lblIdcita.setText(idcita);
            PsicoInterfaz.FrmMenu.FProgramar.txtcodpac.setText(cod_paciente);
            PsicoInterfaz.FrmMenu.FProgramar.txtpac.setText(nom_paciente);

            PsicoInterfaz.FrmMenu.FProgramar.show();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"¡Seleccione una Cita!","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCitas().setVisible(true);
            }
        });
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton btnagendar;
    private javax.swing.JButton btnatender;
    public static javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    public static javax.swing.JComboBox<String> cboEstado;
    public static com.toedter.calendar.JDateChooser fechadesde;
    public static com.toedter.calendar.JDateChooser fechahasta;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblpsicologo;
    private javax.swing.JTable tbCitas;
    // End of variables declaration//GEN-END:variables
}
