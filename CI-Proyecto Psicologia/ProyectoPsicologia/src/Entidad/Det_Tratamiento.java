package Entidad;

public class Det_Tratamiento {
    int Id_det_trata;
    int Id_tratamiento;
    String Fecha;
    String Estado;

    public Det_Tratamiento() {
    }

    public int getId_det_trata() {
        return Id_det_trata;
    }

    public void setId_det_trata(int id_det_trata) {
        Id_det_trata = id_det_trata;
    }

    public int getId_tratamiento() {
        return Id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        Id_tratamiento = id_tratamiento;
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
