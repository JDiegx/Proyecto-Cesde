package Estado;

public class Estado {

    private int CodEstado;
    private String Nombre;
    private String Descripcion;

    private int opcCampo;

    public int getOpcCampo() {
        return opcCampo;
    }

    public void setOpcCampo(int opcCampo) {
        this.opcCampo = opcCampo;
    }

    public Estado() {

    }

    public Estado (int CodEstado, String Nombre, String Descripcion) {
        this.CodEstado = CodEstado;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getCodEstado() {
        return CodEstado;
    }

    public void setCodEstado(int codEstado) {
        this.CodEstado = codEstado;
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
