package Entidad;

public class Cita {

    String Id_Cita;
    String NOperacion;
    String Dni;
    String especialista;
    int especialidad;
    String Fecha;
    String Estado;
    String Descripcion;
    String Diagnostico;
    String TipoCita;
    
    String FechaInicio;
    String FechaFin;
    
    public Cita() {
    }

    public String getId_Cita() {
        return Id_Cita;
    }

    public void setId_Cita(String id_Cita) {
        Id_Cita = id_Cita;
    }

    public String getNOperacion() {
        return NOperacion;
    }

    public void setNOperacion(String NOperacion) {
        this.NOperacion = NOperacion;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    
      public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public String getTipoCita() {
        return TipoCita;
    }

    public void setTipoCita(String tipoCita) {
        TipoCita = tipoCita;
    }
    
    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fecha) {
        FechaInicio = fecha;
    }
    
    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String fecha) {
        FechaFin = fecha;
    }
}
