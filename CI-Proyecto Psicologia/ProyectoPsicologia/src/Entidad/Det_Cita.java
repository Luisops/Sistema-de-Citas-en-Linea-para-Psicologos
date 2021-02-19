package Entidad;

public class Det_Cita {
    int Id_det_cita;
    String Id_cita;
    String Fecha;
    String Estado;
    String Diagnostico;
    double Pago;
    
    String especialista;
    public Det_Cita() {
    }

    public int getId_det_cita() {
        return Id_det_cita;
    }

    public void setId_det_cita(int id_det_cita) {
        Id_det_cita = id_det_cita;
    }

    public String getId_cita() {
        return Id_cita;
    }

    public void setId_cita(String id_cita) {
        Id_cita = id_cita;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    
    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
    
     public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }
    
    public double getPago() {
        return Pago;
    }

    public void setPago(double pago) {
        Pago = pago;
    }
}
