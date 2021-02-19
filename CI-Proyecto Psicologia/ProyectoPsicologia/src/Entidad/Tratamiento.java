package Entidad;

public class Tratamiento
{
    int Id_tratamiento;
    int Id_cita;
    String Descripcion;
    String Fecha;
    String Estado;

    public Tratamiento() {
    }

    public int getId_tratamiento() {
        return Id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        Id_tratamiento = id_tratamiento;
    }

    public int getId_cita() {
        return Id_cita;
    }

    public void setId_cita(int id_cita) {
        Id_cita = id_cita;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
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
}
