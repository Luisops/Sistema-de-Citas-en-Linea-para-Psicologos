package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConexionDB {
    
    public Connection conexionMysql(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdpsicologia","root","");

                return con;
           } catch (Exception e) {
                System.out.println(e);
                return null;
         }
    }
    
    /*Consulta de Paciente*/
    public DefaultTableModel ConsultarBD(String Consulta){
        try {
            Connection con;
            con = conexionMysql();
            Statement StaCon = con.createStatement();
            ResultSet TablaDB = StaCon.executeQuery(Consulta);
            ResultSetMetaData tbcolumnas = TablaDB.getMetaData();
            int ncol = tbcolumnas.getColumnCount();
            DefaultTableModel dtmodel = new DefaultTableModel();

            for(int i=1; i<=ncol; i++){
                dtmodel.addColumn(tbcolumnas.getColumnLabel(i));
            }
            while(TablaDB.next()){
                String fila[] = new String[ncol];
                for(int j=0; j<ncol ;j++){
                    fila[j] = TablaDB.getString(j+1);
                }
                dtmodel.addRow(fila);
             }
             TablaDB.close();
             con.close();

             return dtmodel;

         } catch (Exception e) {
             System.out.println(e);
             return null;
         }
    }
    
    /*Transaccion de Paciente*/
    public int TransaccionBD(String Consulta){
        try {
            Connection con;
            con = conexionMysql();
            Statement StaTra = con.createStatement();
            int rpta = StaTra.executeUpdate(Consulta);
            StaTra.close();    
            con.close();

            return rpta;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public String TransaccionCodBD(String Consulta){
        try {
            Connection con;
            con = conexionMysql();
            Statement StaTra = con.createStatement();
            ResultSet RS;
            String codigo = "";
            int rpta = StaTra.executeUpdate(Consulta, Statement.RETURN_GENERATED_KEYS);
            RS = StaTra.getGeneratedKeys(); 
             
            while(RS.next()){
                codigo = RS.getString(1);
            }
            StaTra.close();
            RS.close();
            con.close();

            return codigo;
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }
}
