package Roles;

public class Roles {

    private int CodRol;
    private String Nombre;
    private String Descripcion;

    private int opcCampo;

    public int getOpcCampo() {
        return opcCampo;
    }

    public void setOpcCampo(int opcCampo) {
        this.opcCampo = opcCampo;
    }


    public Roles() {
    }

    public Roles(int codRol, String nombre, String descripcion) {
        this.CodRol = codRol;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
    }

    public int getCodRol() {
        return CodRol;
    }

    public void setCodRol(int codRol) {
        this.CodRol = codRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
}
