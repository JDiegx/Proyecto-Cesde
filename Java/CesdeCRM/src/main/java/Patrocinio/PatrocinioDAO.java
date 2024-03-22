package Patrocinio;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatrocinioDAO {

    public static void crearPatrocinioDAO(Patrocinio patrocinio){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query= "INSERT INTO patrocinio(NitCedula, Nombre, Descripcion, Cupos, Inicio, Finalizacion, Duracion, Beneficios, TipodeConvenio)VALUES(?,?,?,?,?,?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1, patrocinio.getNitCedula());
                ps.setString(2, patrocinio.getNombre());
                ps.setString(3, patrocinio.getDescripcion());
                ps.setInt(4,patrocinio.getCupos());
                ps.setString(5, patrocinio.getInicio());
                ps.setString(6, patrocinio.getFinalizacion());
                ps.setString(7, patrocinio.getDuracion());
                ps.setString(8, patrocinio.getBeneficios());
                ps.setString(9, patrocinio.getTipodeConvenio());

                ps.executeUpdate();

                System.out.println("Registro de patrocinio exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void listarPatrocinioDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.get_connection()){

            String query = "Select * from patrocinio";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Nit/Cedula: " + rs.getInt("NitCedula"));
                System.out.println("Nombre : " + rs.getString("Nombre"));
                System.out.println("Descripcion : " + rs.getString("Descripcion"));
                System.out.println("Cupos: " + rs.getInt("Cupos"));
                System.out.println("Fecha de inicio : " + rs.getString("Inicio"));
                System.out.println("Fecha de finalizacion : " + rs.getString("Finalizacion"));
                System.out.println("Tiempo de duracion: " + rs.getString("Duracion"));
                System.out.println("Beneficios : " + rs.getString("Beneficios"));
                System.out.println("Tipo de convenio : " + rs.getString("TipodeConvenio"));
            }

        }catch (Exception e){
            System.out.println("NO se pudo recuperar el valor de la tabla ");
            System.out.println(e);
        }
    }

    public static void eliminarPatrocinioDB(int id){

        Conexion conexion = new Conexion();


        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{


                String query = "DELETE FROM patrocinio WHERE patrocinio.NitCedula = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("El registro ha sido eliminado correctamente");

            }catch (SQLException e){
                System.out.println("No fue posible eliminar el registro");
                System.out.println(e);
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void actualizarPatrocinioDB(Patrocinio patrocinio){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                int opc = patrocinio.getOpcCampo();

                if(opc== 1) {
                    String query = "UPDATE patrocinio SET Nombre = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getNombre());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nombre de la tabla patrocinio correctamente");
                } else if (opc== 2) {
                    String query = "UPDATE patrocinio SET Descripcion = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getDescripcion());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la descripcion correctamente");
                } else if (opc== 3) {
                    String query = "UPDATE patrocinio SET Cupos = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, patrocinio.getCupos());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado los cupos correctamente");
                } else if (opc== 4) {
                    String query = "UPDATE patrocinio SET Inicio = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getInicio());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado fecha de inicio correctamente");
                } else if (opc== 5) {
                    String query = "UPDATE patrocinio SET Finalizacion = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getFinalizacion());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado fecha de finalizacion correctamente");
                } else if (opc== 6) {
                    String query = "UPDATE patrocinio SET Duracion = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getDuracion());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la duracion correctamente");
                } else if (opc== 7) {
                    String query = "UPDATE patrocinio SET Beneficios = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getBeneficios());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado beneficios correctamente");
                } else if (opc== 8) {
                    String query = "UPDATE patrocinio SET TipodeConvenio = ? WHERE NitCedula = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, patrocinio.getTipodeConvenio());
                    ps.setInt(2, patrocinio.getNitCedula());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado tipo de convenio correctamente");
                }

            }catch (SQLException e ){
                System.out.println("No se pudo actualizar el registro seleccionado");

                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
