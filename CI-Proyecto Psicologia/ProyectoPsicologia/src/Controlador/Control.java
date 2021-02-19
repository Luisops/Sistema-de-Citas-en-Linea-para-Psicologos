package Controlador;

import javax.swing.table.DefaultTableModel;
import Entidad.Especialista;
import Entidad.Cita;
import Entidad.Det_Cita;
import Entidad.Paciente;

public class Control {
    ConexionDB DB;

    public DefaultTableModel VerificarUserDB(Especialista objesp){
        DB = new ConexionDB();
        return DB.ConsultarBD("Select DNI,contrasenia,CONCAT_WS(' ',CONCAT_WS(' ',APE_PAT,APE_MAT),NOMBRES) as Especialista from especialista WHERE DNI='"+objesp.getUsuario()+"' AND CONTRASENIA='"+ objesp.getPassword()+"'");
    }

    public DefaultTableModel BuscarPacientesDB(String Parametro){
        DB = new ConexionDB();
        return DB.ConsultarBD("Select DNI, nombres as NOMBRES, CONCAT_WS(' ',APE_PAT,ape_mat) AS APELLIDOS,telefono1 AS TELEFONO,estado AS ESTADO from pacientes\n" +
                "WHERE CONCAT_WS(' ',APE_PAT,ape_mat) LIKE '%"+Parametro+"%'");
    }
    
    public DefaultTableModel ListadoCitasDB(Cita objcita){
        DB = new ConexionDB();
        return DB.ConsultarBD("select  ID_CITA as 'NRO CITA',DATE_FORMAT(DATE(FECHA),'%d/%m/%Y')  AS FECHA,DATE_FORMAT(FECHA,'%H:%i')  AS HORA\n" +
                            ",DNI,PACIENTE,ESPECIALIDAD,id_det_cita,TIPO_CITA , CASE WHEN ESTADO = '0' THEN 'Pendiente' WHEN ESTADO = '1'  THEN 'Pagado' WHEN ESTADO = '2'  THEN 'Atendido' WHEN ESTADO = '3'  THEN 'Anulado' END as ESTADO from \n" +
                            "(SELECT  CAST(C.ID_CITA AS CHAR(11)) as ID_CITA,C.FECHA AS FECHA,p.DNI,CONCAT_WS(' ',CONCAT_WS(' ',P.APE_PAT,P.APE_MAT),P.NOMBRES) as PACIENTE,E.ESPECIALIDAD as 'ESPECIALIDAD','0' as id_det_cita ,TIPO_CITA ,C.ESTADO as ESTADO FROM cita C\n"+
                            " INNER JOIN pacientes P ON C.DNI=P.DNI INNER JOIN especialidad E ON C.ID_ESPECIALIDAD=E.ID_ESPECIALIDAD where C.ESTADO='"+objcita.getEstado()+"' and C.ID_ESPECIALISTA='"+objcita.getEspecialista()+"'\n" +
                            "union\n" +
                            "SELECT  CAST(C.ID_CITA AS CHAR(11))as ID_CITA,dc.Fecha AS FECHA\n" +
                            ",p.DNI,CONCAT_WS(' ',CONCAT_WS(' ',P.APE_PAT,P.APE_MAT),P.NOMBRES) as PACIENTE,E.ESPECIALIDAD as 'ESPECIALIDAD',id_det_cita as id_det_cita ,'Tratamiento' as TIPO_CITA ,\n" +
                            "DC.ESTADO as ESTADO FROM cita C INNER JOIN Det_cita dc on C.ID_CITA=dc.ID_CITA INNER JOIN\n" +
                            "pacientes P ON C.DNI=P.DNI INNER JOIN especialidad E ON C.ID_ESPECIALIDAD=E.ID_ESPECIALIDAD WHERE dc.Estado='"+objcita.getEstado()+"' and C.ID_ESPECIALISTA='"+objcita.getEspecialista()+"')T\n" +
                            "where  (DATE(FECHA) BETWEEN '"+objcita.getFechaInicio()+"' AND '"+objcita.getFechaFin()+"')\n"+
                            "ORDER BY DATE(FECHA),HORA");
    }
     
    public String RegistrarCitaDB(Cita objcita){
        DB = new ConexionDB();
        return DB.TransaccionCodBD("INSERT into cita (DNI,TIPO_CITA,ID_ESPECIALISTA,ID_ESPECIALIDAD,FECHA,DESCRIPCION,DIAGNOSTICO,ESTADO)\n"+
                 " VALUES ('"+objcita.getDni()+"','"+objcita.getTipoCita()+"','"+objcita.getEspecialista()+"','1','"+objcita.getFecha()+"','','"+objcita.getDiagnostico()+"','"+objcita.getEstado()+"')");
    }

    public int AtenderCitaDB(Cita objcita){
        DB = new ConexionDB();
        return DB.TransaccionBD("UPDATE cita SET DIAGNOSTICO='"+objcita.getDiagnostico()+"',TIPO_CITA='"+objcita.getTipoCita()+"',ESTADO='"+objcita.getEstado()+"' WHERE ID_CITA='"+objcita.getId_Cita()+"'");
    }

    public int AtenderCitaTratamientoDB(Det_Cita objdet){
        DB = new ConexionDB();         
        return DB.TransaccionBD("UPDATE det_cita set diagnostico='"+objdet.getDiagnostico()+"', estado='"+objdet.getEstado()+"' WHERE id_cita='"+objdet.getId_cita()+"' and id_det_cita='"+objdet.getId_det_cita()+"'");
    }
  
    public int RegistrarDetalleTratamientoDB(Det_Cita objdet){
        DB = new ConexionDB();
        return DB.TransaccionBD("INSERT INTO det_cita(id_cita, fecha,diagnostico, estado, pago) VALUES\n"+
                 "('"+objdet.getId_cita()+"','"+objdet.getFecha()+"','','"+objdet.getEstado()+"','"+objdet.getPago()+"')");
    }
    
    public DefaultTableModel ListarHorarioAtencionDB(){
        DB = new ConexionDB();
        return DB.ConsultarBD("Select hora from hora");
    }
     
    public DefaultTableModel ListarHorarioDisponibleDB(Det_Cita objdet){
        DB = new ConexionDB();
        return DB.ConsultarBD("SELECT ID_CITA,DATE_FORMAT(FECHA,'%H:%i:%S') AS HORA,FECHA,ESTADO FROM\n" +
                            "(SELECT CAST(ID_CITA AS CHAR(11))as ID_CITA,FECHA AS FECHA,ESTADO as 'ESTADO' FROM cita where ID_ESPECIALISTA='"+objdet.getEspecialista()+"'\n" +
                            "UNION \n" +
                            "SELECT CAST(dc.ID_CITA AS CHAR(11))as ID_CITA,dc.Fecha AS FECHA,dc.ESTADO as 'ESTADO' FROM cita C INNER JOIN\n" +
                            "Det_cita dc on C.ID_CITA=dc.ID_CITA where C.ID_ESPECIALISTA='"+objdet.getEspecialista()+"') T WHERE ESTADO IN ('0','1') AND DATE(FECHA)='"+objdet.getFecha()+"' ORDER BY FECHA");
    }
    
    public int RegistrarPacienteDB(Paciente objpac){
        DB = new ConexionDB();
        return DB.TransaccionBD("INSERT INTO pacientes (DNI,NOMBRES,APE_PAT,APE_MAT,SEXO,CORREO,CONTRASENA,ESTADO,F_NACIMIENTO,TELEFONO1,TELEFONO2,F_REGISTRO)VALUES('"+objpac.getDni()+"','"+objpac.getNombres()+"','"+objpac.getApePat()+"','"+objpac.getApeMate()+"','"+objpac.getSexo()+"','"+objpac.getCorreo()+"','"+objpac.getDni()+"','1','0000-00-00','','','0000-00-00 00:00:00')");
    } 
}
