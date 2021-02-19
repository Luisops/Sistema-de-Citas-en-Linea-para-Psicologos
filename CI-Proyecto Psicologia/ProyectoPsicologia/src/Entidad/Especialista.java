package Entidad;

public class Especialista {
  
    String usuario;
    String password;
    int Id_Especialidad;
    String Dni;
    String Nombres;
    String ApeMate;
    String ApePat;
    String Sexo;
    String Correo;
    String F_Nac;
    String F_Reg;
    String Telf1;
    String Telf2;
    String Estado;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getId_Especialidad() {
        return Id_Especialidad;
    }

    public void setId_Especialidad(int id_Especialidad) {
        Id_Especialidad = id_Especialidad;
    }
    
    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApeMate() {
        return ApeMate;
    }

    public void setApeMate(String apeMate) {
        ApeMate = apeMate;
    }

    public String getApePat() {
        return ApePat;
    }

    public void setApePat(String apePat) {
        ApePat = apePat;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getF_Nac() {
        return F_Nac;
    }

    public void setF_Nac(String f_Nac) {
        F_Nac = f_Nac;
    }

    public String getF_Reg() {
        return F_Reg;
    }

    public void setF_Reg(String f_Reg) {
        F_Reg = f_Reg;
    }

    public String getTelf1() {
        return Telf1;
    }

    public void setTelf1(String telf1) {
        Telf1 = telf1;
    }

    public String getTelf2() {
        return Telf2;
    }

    public void setTelf2(String telf2) {
        Telf2 = telf2;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
    
    public Especialista() {
    }
}
