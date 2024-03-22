package Patrocinio;

public class Patrocinio {

    private int NitCedula;
    private String Nombre;
    private String Descripcion;
    private int Cupos;
    private String Inicio;
    private String Finalizacion;
    private String Duracion;
    private String Beneficios;
    private String TipodeConvenio;

    private int opcCampo;

    public int getOpcCampo() {
        return opcCampo;
    }

    public void setOpcCampo(int opcCampo) {
        this.opcCampo = opcCampo;
    }

    public Patrocinio() {
    }

    public Patrocinio(int nitCedula, String nombre, String descripcion, int cupos, String inicio, String finalizacion, String duracion, String beneficios, String tipodeConvenio) {
        this.NitCedula = nitCedula;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Cupos = cupos;
        this.Inicio = inicio;
        this.Finalizacion = finalizacion;
        this.Duracion = duracion;
        this.Beneficios = beneficios;
        this.TipodeConvenio = tipodeConvenio;
    }

    public int getNitCedula() {
        return NitCedula;
    }

    public void setNitCedula(int nitCedula) {
        this.NitCedula = nitCedula;
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

    public int getCupos() {
        return Cupos;
    }

    public void setCupos(int cupos) {
        this.Cupos = cupos;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String inicio) {
        this.Inicio = inicio;
    }

    public String getFinalizacion() {
        return Finalizacion;
    }

    public void setFinalizacion(String finalizacion) {
        this.Finalizacion = finalizacion;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String duracion) {
        this.Duracion = duracion;
    }

    public String getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.Beneficios = beneficios;
    }

    public String getTipodeConvenio() {
        return TipodeConvenio;
    }

    public void setTipodeConvenio(String tipodeConvenio) {
        this.TipodeConvenio = tipodeConvenio;
    }
}
