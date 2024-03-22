package Departamento;

public class Departamento {

    private int CodDep;
    private String Descripcion;
    private String Cargo;
    private String NombreDep;

    private int opcCampo;

    public int getOpcCampo() {
        return opcCampo;
    }

    public void setOpcCampo(int opcCampo) {
        this.opcCampo = opcCampo;
    }


    public Departamento(){
    }

    public Departamento(int codDep, String descripcion, String cargo, String nombreDep) {
        this.CodDep = codDep;
        this.Descripcion = descripcion;
        this.Cargo = cargo;
        this.NombreDep = nombreDep;
    }

    public int getCodDep() {
        return CodDep;
    }

    public void setCodDep(int codDep) {
        this.CodDep = codDep;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public String getNombreDep() {
        return NombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.NombreDep = nombreDep;
    }
}
