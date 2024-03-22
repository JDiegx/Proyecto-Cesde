package Roles;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RolesDAO {

    public static void crearRolDAO(Roles roles){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query= "INSERT INTO roles(CodRol, Nombre, Descripcion)VALUES(?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1, roles.getCodRol());
                ps.setString(2, roles.getNombre());
                ps.setString(3, roles.getDescripcion());

                ps.executeUpdate();

                System.out.println("Registro de rol exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void listarRolDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.get_connection()){

            String query = "Select * from roles";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("codigo de rol: " + rs.getInt("CodRol"));
                System.out.println("Nombre de rol: " + rs.getString("Nombre"));
                System.out.println("Descripcion de rol: " + rs.getString("Descripcion"));
            }

        }catch (Exception e){
            System.out.println("NO se pudo recuperar el valor de la categoría");
            System.out.println(e);
        }
    }

    public static void eliminarRolDB(int id){

        Conexion conexion = new Conexion();


        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{


                String query = "DELETE FROM roles WHERE roles.CodRol = ?";

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

    public static void actualizarRolDB(Roles roles){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try {

                int opc = roles.getOpcCampo();

                if(opc== 1) {
                    String query = "UPDATE roles SET Nombre = ? WHERE CodRol = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, roles.getNombre());
                    ps.setInt(2, roles.getCodRol());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nombre del rol correctamente");
                } else if(opc== 2) {
                    String query = "UPDATE roles SET Descripcion = ? WHERE CodRol = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, roles.getDescripcion());
                    ps.setInt(2, roles.getCodRol());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la descripcion de rol correctamente");
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
