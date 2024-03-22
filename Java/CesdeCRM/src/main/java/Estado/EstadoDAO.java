package Estado;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstadoDAO {

    public static void crearEstadoDAO(Estado estado){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query= "INSERT INTO estado(CodEstado, Nombre, Descripcion)VALUES(?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1, estado.getCodEstado());
                ps.setString(2, estado.getNombre());
                ps.setString(3, estado.getDescripcion());


                ps.executeUpdate();

                System.out.println("Registro de estado exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void listarEstadoDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.get_connection()){

            String query = "Select * from estado";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("codigo de estado: " + rs.getInt("CodEstado"));
                System.out.println("Nombre estado: " + rs.getString("Nombre"));
                System.out.println("Descripcion estado: " + rs.getString("Descripcion"));
            }

        }catch (Exception e){
            System.out.println("NO se pudo recuperar el valor de la categoría");
            System.out.println(e);
        }
    }

    public static void eliminarEstadoDB(int id){

        Conexion conexion = new Conexion();


        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{


                String query = "DELETE FROM estado WHERE estado.CodEstado = ?";

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

    public static void actualizarEstadoDB(Estado estado){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                int opc = estado.getOpcCampo();

                if(opc== 1) {
                    String query = "UPDATE estado SET Nombre = ? WHERE CodEstado = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, estado.getNombre());
                    ps.setInt(2, estado.getCodEstado());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nombre del estado correctamente");
                } else if(opc == 2) {
                    String query = "UPDATE estado SET Descripcion = ? WHERE CodEstado = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, estado.getDescripcion());
                    ps.setInt(2, estado.getCodEstado());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el autor del libro correctamente");
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
