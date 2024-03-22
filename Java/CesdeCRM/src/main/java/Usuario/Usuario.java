package Usuario;

import java.sql.Date;

public class Usuario {

    private int IdUsuario;
    private int NitCedula;
    private int CodEstado;
    private int CodRol;
    private int CodDep;
    private String PrimerNombre;
    private String PrimerApellido;
    private String SegundoNombre;
    private String SegundoApellido;
    private String Contrasena;
    private String Dirrecion;
    private String CorreoElectronico;
    private int Telefono;
    private String Fechadenacimiento;

    private int opcCampo;

    public int getOpcCampo() {
        return opcCampo;
    }

    public void setOpcCampo(int opcCampo) {
        this.opcCampo = opcCampo;
    }

    public Usuario(){
    }

    public Usuario(int idUsuario, int nitCedula, int codEstado, int codRol, int codDep, String primerNombre, String primerApellido, String segundoNombre, String segundoApellido, String contrasena, String dirrecion, String correoElectronico, int telefono, String fechadenacimiento) {
        this.IdUsuario = idUsuario;
        this.NitCedula = nitCedula;
        this.CodEstado = codEstado;
        this.CodRol = codRol;
        this.CodDep = codDep;
        this.PrimerNombre = primerNombre;
        this.PrimerApellido = primerApellido;
        this.SegundoNombre = segundoNombre;
        this.SegundoApellido = segundoApellido;
        this.Contrasena = contrasena;
        this.Dirrecion = dirrecion;
        this.CorreoElectronico = correoElectronico;
        this.Telefono = telefono;
        this.Fechadenacimiento = fechadenacimiento;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.IdUsuario = idUsuario;
    }

    public int getNitCedula() {
        return NitCedula;
    }

    public void setNitCedula(int nitCedula) {
        this.NitCedula = nitCedula;
    }

    public int getCodEstado() {
        return CodEstado;
    }

    public void setCodEstado(int codEstado) {
        this.CodEstado = codEstado;
    }

    public int getCodRol() {
        return CodRol;
    }

    public void setCodRol(int codRol) {
        this.CodRol = codRol;
    }

    public int getCodDep() {
        return CodDep;
    }

    public void setCodDep(int codDep) {
        this.CodDep = codDep;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.PrimerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.PrimerApellido = primerApellido;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.SegundoNombre = segundoNombre;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.SegundoApellido = segundoApellido;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        this.Contrasena = contrasena;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.Dirrecion = dirrecion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.CorreoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        this.Telefono = telefono;
    }

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.Fechadenacimiento = fechadenacimiento;
    }
}
