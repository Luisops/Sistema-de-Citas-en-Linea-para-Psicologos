package PsicoInterfaz;

import javax.swing.table.DefaultTableModel;
import Controlador.Psicologia;
import Entidad.Det_Cita;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmHorario extends javax.swing.JFrame {

    Psicologia objneg;
    Det_Cita objen;
    DefaultTableModel dthorario=new DefaultTableModel();
    
      /* Variables de sesion de Usuario */
    
    String psicologo_form="";
    String cod_psico_form="";
    
    public FrmHorario() {
        initComponents();
    }
    
     public FrmHorario(String codigo,String nombre) {
        initComponents();
        this.setSize(360, 460);
        this.setLocationRelativeTo(null);
        cod_psico_form = codigo;
        psicologo_form = nombre;
        
        EstructuraHorario();
        MostrarHorarioDisponibles();
    }
    
    void EstructuraHorario(){
        dthorario.addColumn("Hora");
        dthorario.addColumn("Disponibilidad");
        tbhorario.setModel(dthorario);
        
        objneg=new Psicologia();
          /* Crea una tabla temporal*/
        DefaultTableModel model=new DefaultTableModel();
           /*Se realiza la busqueda y el resultado se asigna a la tabla temporal*/
        model=objneg.ListarHorarioAtencion();
           
        for(int i=0;i<model.getRowCount();i++){
                String dato[] = new String[2];
                dato[0] = model.getValueAt(i, 0).toString();
                dato[1] = "";
                dthorario.addRow(dato);
        } 
    }
    
    void MostrarHorarioDisponibles(){
        String fechaCita = "";
       
        String dia=Integer.toString(PsicoInterfaz.FrmMenu.FProgramar.fechahora.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes=Integer.toString(PsicoInterfaz.FrmMenu.FProgramar.fechahora.getCalendar().get(Calendar.MONTH)+1);
        String anio=Integer.toString(PsicoInterfaz.FrmMenu.FProgramar.fechahora.getCalendar().get(Calendar.YEAR));
        fechaCita = (anio + "-" + mes+ "-" +dia);
           
        lblfecha.setText(dia+"/"+mes+"/"+anio);
        
        objneg = new Psicologia();
        objen = new Det_Cita();
        objen.setFecha(fechaCita);
        objen.setEspecialista(cod_psico_form);
        
        DefaultTableModel dthor_disp = new DefaultTableModel();
        dthor_disp=objneg.ListarHorarioDisponible(objen);
        
        for(int i=0;i< tbhorario.getRowCount();i++){
             for(int j=0;j< dthor_disp.getRowCount();j++){
                if((tbhorario.getValueAt(i, 0).toString()+":00").equals(dthor_disp.getValueAt(j, 1).toString())){
                    tbhorario.setValueAt("Ocupado", i, 1);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnselec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbhorario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblfecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Horario");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(189, 223, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnselec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnselec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Check.png"))); // NOI18N
        btnselec.setText("Seleccionar");
        btnselec.setBorder(null);
        btnselec.setContentAreaFilled(false);
        btnselec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnselec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecActionPerformed(evt);
            }
        });
        jPanel1.add(btnselec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 42, 107));
        jScrollPane1.setToolTipText("");

        tbhorario.setBackground(new java.awt.Color(189, 223, 191));
        tbhorario.setForeground(new java.awt.Color(0, 42, 107));
        tbhorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8:00", null},
                {"8:30", null},
                {"9:00", null},
                {"9:30", null},
                {"10:00", null},
                {"10:30", null},
                {"11:00", null},
                {"11:30", null},
                {"12:00", null},
                {"12:30", null},
                {"13:00", null},
                {"13:30", null}
            },
            new String [] {
                "Hora", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbhorario.setToolTipText("");
        tbhorario.setGridColor(new java.awt.Color(15, 121, 134));
        tbhorario.setSelectionBackground(new java.awt.Color(33, 208, 195));
        jScrollPane1.setViewportView(tbhorario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 220));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfecha.setBackground(new java.awt.Color(255, 255, 255));
        lblfecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("$fecha");
        jPanel2.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Horario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel2.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 160));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnselecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecActionPerformed
        String Disponible=tbhorario.getValueAt(tbhorario.getSelectedRow(),1).toString();

        if(Disponible.equals("Ocupado") || Disponible.equals("Refrigerio")){
            JOptionPane.showMessageDialog(null,"Horario no disponible, ¡Seleccione otro Horario!");
        }else {
            String Hora= tbhorario.getValueAt(tbhorario.getSelectedRow(),0).toString();
            PsicoInterfaz.FrmMenu.FProgramar.txthora.setText(Hora);
            this.dispose();
        }
    }//GEN-LAST:event_btnselecActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton btnselec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTable tbhorario;
    // End of variables declaration//GEN-END:variables
}
