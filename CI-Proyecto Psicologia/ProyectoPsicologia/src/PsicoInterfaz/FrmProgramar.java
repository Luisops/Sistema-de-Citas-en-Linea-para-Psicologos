package PsicoInterfaz;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import Controlador.Psicologia;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entidad.Cita;
import Entidad.Det_Cita;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FrmProgramar extends javax.swing.JFrame {
    
    Cita objcita;
    Det_Cita objDet;
    
    Psicologia objneg;
    DefaultTableModel dtagenda = new DefaultTableModel();
    String accion_form = "";
    String tipo_cita_form = "";
    
    String pcicologo_form = "";
    String cod_psico_form = "";
    
    public FrmProgramar() {
        initComponents();
        this.setSize(550, 750);
        this.setLocationRelativeTo(null);
    }
    
     public FrmProgramar(String codigo,String nombre) {
        initComponents();
        this.setSize(550, 750);
        this.setLocationRelativeTo(null);
        
        dtagenda.addColumn("Fecha");
        dtagenda.addColumn("Hora");
        dtagenda.addColumn("Costo");
        
        tbagenda.setModel(dtagenda);
        lblIdcita.setVisible(false);
        lbltextcita.setVisible(false);
        accion_form = "3";
        cod_psico_form = codigo;
        pcicologo_form = nombre;
        
        lblcodigo.setText(codigo);
        lblpsicologo.setText(nombre);
    }
    
     public FrmProgramar(String accion,String TipoCita,String codigo,String nombre) {
        initComponents();
        this.setSize(550, 750);
        this.setLocationRelativeTo(null);
        
        dtagenda.addColumn("Fecha");
        dtagenda.addColumn("Hora");
        dtagenda.addColumn("Costo");
        tbagenda.setModel(dtagenda);
        
        lblIdcita.setVisible(true);
         lbltextcita.setVisible(true);
        accion_form = accion;
        tipo_cita_form = TipoCita;
        
        cod_psico_form = codigo;
        pcicologo_form = nombre;
        
        lblcodigo.setText(codigo);
        lblpsicologo.setText(nombre);
         
        if(accion.equals("1")){
            HabilitarControles(false);
             if(tipo_cita_form.equals("0")){ /* TIPO DE CITA CONSULTA*/
                 cbotipo.setSelectedIndex(1);
             }else{
                 cbotipo.setSelectedIndex(0);
             }
        }else {
            if(accion.equals("2")){
            HabilitarControles(true);
            }
        }
        
     }
    void HabilitarControles(boolean accion){
        btnver.setEnabled(accion);
        btnbus.setEnabled(accion);
        cbotipo.setEnabled(accion);
        btnagendar.setEnabled(accion);
        btneliminar.setEnabled(accion);
        fechahora.setEnabled(accion);
        txtpag.setEnabled(accion);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblpsicologo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lblIdcita = new javax.swing.JLabel();
        lbltextcita = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        Cerrar2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtcodpac = new javax.swing.JTextField();
        txtpac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtpac1 = new javax.swing.JTextField();
        txtcodpac1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnbus1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnbus = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        label_cod = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblpsicologo1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblcodigo1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        Cerrar = new javax.swing.JLabel();
        btnver = new javax.swing.JButton();
        txtpag = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechahora = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnagendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbagenda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdes = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnreg = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cbotipo = new javax.swing.JComboBox<>();
        btneliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGENDA");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(12, 135, 67));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Psicologo_1.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 110));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Código:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));

        lblpsicologo.setBackground(new java.awt.Color(255, 255, 255));
        lblpsicologo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpsicologo.setForeground(new java.awt.Color(255, 255, 255));
        lblpsicologo.setText("$psicologo");
        jPanel4.add(lblpsicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 210, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Psicólogo: ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, -1));

        lblcodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("$codigo");
        jPanel4.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 80, 20));

        lblIdcita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdcita.setForeground(new java.awt.Color(255, 255, 255));
        lblIdcita.setText("0000000000");
        lblIdcita.setToolTipText("");
        jPanel4.add(lblIdcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 20));

        lbltextcita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltextcita.setForeground(new java.awt.Color(255, 255, 255));
        lbltextcita.setText("Nro Cita:");
        jPanel4.add(lbltextcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 20));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 210, 10));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, 10));
        jPanel4.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 110, 20));

        Cerrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar2.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar2MouseClicked(evt);
            }
        });
        jPanel4.add(Cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 130));
        jPanel4.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcodpac.setEditable(false);
        txtcodpac.setBackground(new java.awt.Color(0, 102, 102));
        txtcodpac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcodpac.setForeground(new java.awt.Color(255, 255, 255));
        txtcodpac.setBorder(null);
        jPanel2.add(txtcodpac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 250, 30));

        txtpac.setEditable(false);
        txtpac.setBackground(new java.awt.Color(0, 102, 102));
        txtpac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpac.setForeground(new java.awt.Color(255, 255, 255));
        txtpac.setBorder(null);
        jPanel2.add(txtpac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/paciente.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        jSeparator2.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator2.setForeground(new java.awt.Color(45, 45, 45));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 20));

        jSeparator3.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator3.setForeground(new java.awt.Color(45, 45, 45));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 250, 20));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpac1.setEditable(false);
        txtpac1.setBackground(new java.awt.Color(0, 102, 102));
        txtpac1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpac1.setForeground(new java.awt.Color(255, 255, 255));
        txtpac1.setBorder(null);
        jPanel3.add(txtpac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 30));

        txtcodpac1.setEditable(false);
        txtcodpac1.setBackground(new java.awt.Color(0, 102, 102));
        txtcodpac1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcodpac1.setForeground(new java.awt.Color(255, 255, 255));
        txtcodpac1.setBorder(null);
        jPanel3.add(txtcodpac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 250, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/paciente.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        btnbus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        btnbus1.setBorderPainted(false);
        btnbus1.setContentAreaFilled(false);
        btnbus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbus1.setFocusPainted(false);
        btnbus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbus1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnbus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 30, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Paciente:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator4.setForeground(new java.awt.Color(45, 45, 45));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 20));

        jSeparator5.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator5.setForeground(new java.awt.Color(45, 45, 45));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 250, 20));

        btnbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        btnbus.setBorderPainted(false);
        btnbus.setContentAreaFilled(false);
        btnbus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbus.setFocusPainted(false);
        btnbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusActionPerformed(evt);
            }
        });
        jPanel3.add(btnbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 30, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Paciente:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        label_cod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_cod.setForeground(new java.awt.Color(255, 255, 255));
        label_cod.setText("Código Paciente:");
        jPanel3.add(label_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Código Paciente:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Paciente:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 550, -1));

        jPanel6.setBackground(new java.awt.Color(130, 194, 133));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator6.setForeground(new java.awt.Color(45, 45, 45));
        jPanel6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 200, 20));

        jSeparator1.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator1.setForeground(new java.awt.Color(45, 45, 45));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 170, 20));

        jSeparator7.setBackground(new java.awt.Color(60, 63, 65));
        jSeparator7.setForeground(new java.awt.Color(45, 45, 45));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 90, 20));

        jPanel7.setBackground(new java.awt.Color(12, 135, 67));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Psicologo_1.png"))); // NOI18N
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 102, 110));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Código:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));

        lblpsicologo1.setBackground(new java.awt.Color(255, 255, 255));
        lblpsicologo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpsicologo1.setForeground(new java.awt.Color(255, 255, 255));
        lblpsicologo1.setText("$psicologo");
        jPanel7.add(lblpsicologo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 210, 20));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Psicólogo:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, -1));

        lblcodigo1.setBackground(new java.awt.Color(255, 255, 255));
        lblcodigo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcodigo1.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo1.setText("$codigo");
        jPanel7.add(lblcodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 80, 20));
        jPanel7.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 210, 10));
        jPanel7.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, 10));

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel7.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 130));

        btnver.setBackground(new java.awt.Color(0, 0, 0));
        btnver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Hora.png"))); // NOI18N
        btnver.setBorder(null);
        btnver.setBorderPainted(false);
        btnver.setContentAreaFilled(false);
        btnver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnver.setFocusPainted(false);
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel6.add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, 30));

        txtpag.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpag.setToolTipText("");
        txtpag.setBorder(null);
        jPanel6.add(txtpag, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Hora:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de  Cita:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, 30));

        fechahora.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(fechahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Costo Tratamiento:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 140, 30));

        btnagendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/agregar.png"))); // NOI18N
        btnagendar.setText("Agregar Fecha");
        btnagendar.setBorder(null);
        btnagendar.setContentAreaFilled(false);
        btnagendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });
        jPanel6.add(btnagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(130, 194, 133));
        jScrollPane1.setToolTipText("");

        tbagenda.setBackground(new java.awt.Color(130, 194, 133));
        tbagenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        tbagenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbagenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbagenda.setToolTipText("");
        tbagenda.setGridColor(new java.awt.Color(15, 121, 134));
        tbagenda.setSelectionBackground(new java.awt.Color(33, 208, 195));
        jScrollPane1.setViewportView(tbagenda);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 490, 90));

        txtdes.setBackground(new java.awt.Color(130, 194, 133));
        txtdes.setColumns(20);
        txtdes.setRows(5);
        txtdes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 121, 134)));
        jScrollPane2.setViewportView(txtdes);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 490, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Descripcion:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        btnreg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Registrar.png"))); // NOI18N
        btnreg.setText("Registrar");
        btnreg.setBorder(null);
        btnreg.setContentAreaFilled(false);
        btnreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });
        jPanel6.add(btnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Programar.png"))); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 130));

        cbotipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tratamiento", "Consulta" }));
        cbotipo.setBorder(null);
        cbotipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbotipo.setOpaque(false);
        jPanel6.add(cbotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 200, 30));

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png"))); // NOI18N
        btneliminar.setText("Eliminar Fecha");
        btneliminar.setBorder(null);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel6.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Fecha:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, 30));

        txthora.setEditable(false);
        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txthora.setBorder(null);
        jPanel6.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 90, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 750));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 550, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String CambiarFormatoFecha(String cadfecha){
        DateFormat formato1 = new SimpleDateFormat("dd/mm/yyyy");
        DateFormat formato2 = new SimpleDateFormat("yyyy-mm-dd");
        Date fecha;
        String fechanueva = "";
        try{        
            fecha = formato1.parse(cadfecha);    
            fechanueva = formato2.format(fecha);   
                
            }
        catch(ParseException e){        
            e.printStackTrace();
        }
        return fechanueva;
    }
    
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try{
           dtagenda.removeRow(tbagenda.getSelectedRow());
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"Seleccione fecha a eliminar","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusActionPerformed
        FrmBuscarPaciente frm = new FrmBuscarPaciente();
        frm.show();
    }//GEN-LAST:event_btnbusActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnbus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbus1ActionPerformed
        FrmBuscarPaciente frm = new FrmBuscarPaciente();
        frm.show();
    }//GEN-LAST:event_btnbus1ActionPerformed

    private void Cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar2MouseClicked
        dispose();
    }//GEN-LAST:event_Cerrar2MouseClicked

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        FrmHorario frm = new FrmHorario(cod_psico_form,pcicologo_form);
        frm.show();
    }//GEN-LAST:event_btnverActionPerformed

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
       if(!txthora.getText().equals("")){
           if(!txtpag.getText().equals("")){

                String fechaCita = "";
                String dato[] = new String[3];

                String dia = Integer.toString(fechahora.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(fechahora.getCalendar().get(Calendar.MONTH)+1);
                String anio = Integer.toString(fechahora.getCalendar().get(Calendar.YEAR));
                fechaCita = dia+"/"+mes+"/"+anio;

                dato[0] = fechaCita;
                dato[1] = txthora.getText();
                dato[2] = txtpag.getText();
                dtagenda.addRow(dato);
                
                txthora.setText("");
                txtpag.setText("");
                
           }else {
                JOptionPane.showMessageDialog(null,"Ingrese costo de tratamiento","MENSAJE",JOptionPane.WARNING_MESSAGE);
           }
        }else{
            JOptionPane.showMessageDialog(null,"Selecione Horario para la cita","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnagendarActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        int Mensaje = 0;
        String Mensaje_conf = "";
        if(accion_form.equals("1")){
            Mensaje_conf = "Registrar Atencion de la Cita?";
        }
         if(accion_form.equals("2") || accion_form.equals("3")){
            Mensaje_conf = "Agendar Citas de tratamiento?";
        }
        
        Mensaje=JOptionPane.showConfirmDialog(null, "¿Desea "+Mensaje_conf, "Mensaje",JOptionPane.YES_OPTION);
        
        if(Mensaje == JOptionPane.YES_OPTION){
            if(accion_form.equals("1")){ /* ACCION DE ATENDER CITA*/
                
                if(!txtdes.getText().equals("")){
                    
                      if(tipo_cita_form.equals("0")){ /* TIPO DE CITA CONSULTA*/
                        objcita = new Cita();
                        objneg = new Psicologia();
                        int Rpta = 0;

                        objcita.setId_Cita(lblIdcita.getText());
                        objcita.setDiagnostico(txtdes.getText());
                        objcita.setTipoCita("consulta");
                        objcita.setEstado("2");

                        Rpta = objneg.AtenderCita(objcita);

                        if(Rpta!=0){
                            JOptionPane.showMessageDialog(null,"Se registro atencion de la Cita Correctamente");
                        }
                 }else { /* TIPO DE CITA TRATAMIENTO*/
                     
                        objDet = new Det_Cita();
                        objneg = new Psicologia();
                        int Rpta = 0;

                        objDet.setId_cita(lblIdcita.getText());
                        objDet.setId_det_cita(Integer.parseInt(tipo_cita_form));
                        objDet.setDiagnostico(txtdes.getText());
                        objDet.setEstado("2");

                        Rpta = objneg.AtenderCitaTratamiento(objDet);
                        
                        if(Rpta!=0){
                            JOptionPane.showMessageDialog(null,"Se registro atencion de la Cita Correctamente");
                        }
                 }
                      
                }else {
                    JOptionPane.showMessageDialog(null,"Ingrese Diagnostico","MENSAJE",JOptionPane.WARNING_MESSAGE);
                
                }
            }
            
            if(accion_form.equals("2")){  /* ACCION DE AGENDAR TRATAMIENTO*/
                
                 if(tbagenda.getRowCount()>0){
                      if(!txtdes.getText().equals("")){
                           String Fechacita="";
                
                            int Rpta=0;

                            objcita=new Cita();
                            objneg=new Psicologia();


                            objcita.setId_Cita(lblIdcita.getText());
                            objcita.setTipoCita("consulta");
                            objcita.setDiagnostico(txtdes.getText());
                            objcita.setEstado("2");

                            Rpta=objneg.AtenderCita(objcita);

                            if(Rpta!=0){
                                 objDet=new Det_Cita();
                                 objneg=new Psicologia();
                                 int Rpta02=0;

                                 objDet.setId_cita(lblIdcita.getText());

                                 for(int i=0;i<tbagenda.getRowCount();i++){
                                     Fechacita=CambiarFormatoFecha((String)tbagenda.getValueAt(i,0))+" "+(String)tbagenda.getValueAt(i,1)+":00";
                                     objDet.setFecha(Fechacita);
                                     objDet.setPago(Double.parseDouble(tbagenda.getValueAt(i,2).toString()));
                                     objDet.setEstado("0");
                                     Rpta02+=objneg.RegistrarDetalleTratamiento(objDet);
                                 }

                                 if(Rpta02>0){
                                   JOptionPane.showMessageDialog(null,"Se Registro Agenda para tratamiento Correctamente");
                                 }
                            }
                      }else {
                         JOptionPane.showMessageDialog(null,"Ingrese diagnostico para tratamiento","MENSAJE",JOptionPane.WARNING_MESSAGE);
                      }
                 }
                 else{
                       JOptionPane.showMessageDialog(null,"No hay fechas para agendar tratamiento","MENSAJE",JOptionPane.WARNING_MESSAGE);
                 }
            }
            if(accion_form.equals("3")){  /* ACCION DE AGENDAR TRATAMIENTO*/
                 if(!txtcodpac.getText().equals("")){
                 if(tbagenda.getRowCount()>0){
                      if(!txtdes.getText().equals("")){
                          
                        String Fechacita="";

                             String RptaIdCita="0";
                             
                             String cadenaFecha; 
                             Calendar fecha = new GregorianCalendar();
                             int anio = fecha.get(Calendar.YEAR);
                             int mes = fecha.get(Calendar.MONTH)+1;
                             int dia = fecha.get(Calendar.DAY_OF_MONTH);
                             int hora = fecha.get(Calendar.HOUR_OF_DAY);
                             int minuto = fecha.get(Calendar.MINUTE);
                             
                             cadenaFecha=anio+"-"+mes+"-"+dia+" "+hora+":00:"+ "00";
                             
                             objcita=new Cita();
                             objneg=new Psicologia();

                              objcita.setDni(txtcodpac.getText());
                              objcita.setEspecialista(cod_psico_form);
                              objcita.setEspecialidad(1);

                              objcita.setFecha(cadenaFecha);
                              objcita.setDiagnostico(txtdes.getText());
                              objcita.setTipoCita("consulta");
                              /*objcita.setTipoCita(cbotipo.getSelectedItem().toString());*/
                              objcita.setEstado("2");

                              RptaIdCita=objneg.RegistrarCita(objcita);


                             if(RptaIdCita.equals("")==false){
                                  objDet=new Det_Cita();
                                  objneg=new Psicologia();
                                  int Rpta02=0;

                                  objDet.setId_cita(RptaIdCita);

                                  for(int i=0;i<tbagenda.getRowCount();i++){
                                      Fechacita=CambiarFormatoFecha((String)tbagenda.getValueAt(i,0))+" "+(String)tbagenda.getValueAt(i,1)+":00";
                                      objDet.setFecha(Fechacita);
                                      objDet.setPago(Double.parseDouble(tbagenda.getValueAt(i,2).toString()));
                                      objDet.setEstado("0");
                                      Rpta02+=objneg.RegistrarDetalleTratamiento(objDet);
                                  }

                                  if(Rpta02>0){
                                    JOptionPane.showMessageDialog(null,"Se Registro Agenda para tratamiento Correctamente");
                                  }
                             }
                             
                      }else {
                         JOptionPane.showMessageDialog(null,"Ingrese diagnostico para tratamiento","MENSAJE",JOptionPane.WARNING_MESSAGE);
                      }
                 }
                 else{
                       JOptionPane.showMessageDialog(null,"No hay fechas para agendar tratamiento","MENSAJE",JOptionPane.WARNING_MESSAGE);
                 }
                 } else{
                       JOptionPane.showMessageDialog(null,"Seleccione Paciente","MENSAJE",JOptionPane.WARNING_MESSAGE);
                 }   
                     
            }
          
            
        }

    }//GEN-LAST:event_btnregActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProgramar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProgramar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProgramar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProgramar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProgramar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Cerrar2;
    private javax.swing.JButton btnagendar;
    private javax.swing.JButton btnbus;
    private javax.swing.JButton btnbus1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnreg;
    private javax.swing.JButton btnver;
    private javax.swing.JComboBox<String> cbotipo;
    public static com.toedter.calendar.JDateChooser fechahora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_cod;
    public javax.swing.JLabel lblIdcita;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcodigo1;
    private javax.swing.JLabel lblpsicologo;
    private javax.swing.JLabel lblpsicologo1;
    private javax.swing.JLabel lbltextcita;
    private javax.swing.JTable tbagenda;
    public javax.swing.JTextField txtcodpac;
    public javax.swing.JTextField txtcodpac1;
    private javax.swing.JTextArea txtdes;
    public javax.swing.JTextField txthora;
    public javax.swing.JTextField txtpac;
    public javax.swing.JTextField txtpac1;
    public javax.swing.JTextField txtpag;
    // End of variables declaration//GEN-END:variables
}
