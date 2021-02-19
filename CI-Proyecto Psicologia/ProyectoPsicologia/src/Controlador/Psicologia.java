package Controlador;

import Controlador.ConexionDB;
import javax.swing.table.DefaultTableModel;
import Controlador.Control;
import Entidad.Cita;
import Entidad.Det_Cita;
import Entidad.Especialista;
import Entidad.Paciente;

public class Psicologia { 
    /*Todos los metodos se enviaran al Control del controlador donde se imprime o lee los datos*/
    Control objetoDatos;  
    
    public DefaultTableModel VerificarUser(Especialista x){
        objetoDatos = new Control();
        return  objetoDatos.VerificarUserDB(x);
    }
     
    public DefaultTableModel BuscarPaciente(String Parametro){
        objetoDatos = new Control();
        return  objetoDatos.BuscarPacientesDB(Parametro);
    }
     
    public DefaultTableModel ListadoCita(Cita objcita){
        objetoDatos = new Control();
        return  objetoDatos.ListadoCitasDB(objcita);
     }
    
    public String RegistrarCita(Cita objcita){
        objetoDatos = new Control();
        return objetoDatos.RegistrarCitaDB(objcita);
    }
     
    public int AtenderCita(Cita objcita){
        objetoDatos = new Control();
        return objetoDatos.AtenderCitaDB(objcita);
    }
     
    public int AtenderCitaTratamiento(Det_Cita objdet){
         objetoDatos = new Control();
        return objetoDatos.AtenderCitaTratamientoDB(objdet);
    }
       
    public int RegistrarDetalleTratamiento(Det_Cita objdet){
        objetoDatos = new Control();
        return objetoDatos.RegistrarDetalleTratamientoDB(objdet);
    }
    
    public DefaultTableModel ListarHorarioDisponible(Det_Cita objdet){
        objetoDatos = new Control();
        return objetoDatos.ListarHorarioDisponibleDB(objdet);
    }
    
    public DefaultTableModel ListarHorarioAtencion(){
        objetoDatos = new Control();
        return objetoDatos.ListarHorarioAtencionDB();
    }
       
    public int RegistrarPaciente(Paciente objpac){
        objetoDatos = new Control();
        return objetoDatos.RegistrarPacienteDB(objpac);
    }
}