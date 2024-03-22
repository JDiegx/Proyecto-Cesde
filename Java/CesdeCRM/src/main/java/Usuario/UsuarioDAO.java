package Usuario;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public static void crearUsuarioDAO (Usuario usuario){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

         try{

             String query = "INSERT INTO usuario(IdUsuario, NitCedula, CodEstado, CodRol, CodDep, PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Contrasena, Direccion, CorreoElectronico, Telefono, Fechadenacimiento)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

             ps = connect.prepareStatement(query);

             ps.setInt(1,usuario.getIdUsuario());
             ps.setInt(2,usuario.getNitCedula());
             ps.setInt(3,usuario.getCodEstado());
             ps.setInt(4,usuario.getCodRol());
             ps.setInt(5,usuario.getCodDep());
             ps.setString(6,usuario.getPrimerNombre());
             ps.setString(7,usuario.getPrimerApellido());
             ps.setString(8,usuario.getSegundoNombre());
             ps.setString(9,usuario.getSegundoApellido());
             ps.setString(10,usuario.getContrasena());
             ps.setString(11,usuario.getDirrecion());
             ps.setString(12,usuario.getCorreoElectronico());
             ps.setInt(13,usuario.getTelefono());
             ps.setString(14,usuario.getFechadenacimiento());

             ps.executeUpdate();

             System.out.println("Registro de usuario exitoso");

         }catch (Exception e){
             System.out.println(e);
         }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void listarUsuarioDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.get_connection()){

            String query = "Select * from usuario";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println("Id Usuario: " + rs.getInt("IdUsuario"));
                System.out.println("NitCedula: " + rs.getInt("NitCedula"));
                System.out.println("codigo estado: " + rs.getInt("CodEstado"));
                System.out.println("codigo rol: " + rs.getInt("CodRol"));
                System.out.println("codigo departamento: " + rs.getInt("CodDep"));
                System.out.println("nombe usuario: " + rs.getString("PrimerNombre"));
                System.out.println("apellido usuario: " + rs.getString("PrimerApellido"));
                System.out.println("segundo nombe de usuario: " + rs.getString("SegundoNombre"));
                System.out.println("segundo apellido de usuario: " + rs.getString("SegundoApellido"));
                System.out.println("contraeña usuario: " + rs.getString("Contrasena"));
                System.out.println("direccion de usuario: " + rs.getString("Direccion"));
                System.out.println("email usuario: " + rs.getString("CorreoElectronico"));
                System.out.println("telefono usuario: " + rs.getInt("Telefono"));
                System.out.println("fecha de nacimiento usuario: " + rs.getString("Fechadenacimiento"));
            }

        }catch (Exception e){
            System.out.println("No se pudo recuperar los valores de la tabla");
            System.out.println(e);
        }

    }

    public static void eliminarUsuarioDB (int id){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query = "DELETE FROM usuario WHERE usuario.IdUsuario = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("El registro ha sido eliminado correctamente");

            }catch (Exception e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void actualizarUsuarioDB (Usuario usuario){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                int opc = usuario.getOpcCampo();

                if(opc== 1) {
                    String query = "UPDATE usuario SET NitCedula = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, usuario.getNitCedula());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nuemro de cedula correctamente");
                } else if (opc==2) {
                    String query = "UPDATE usuario SET CodEstado = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, usuario.getCodEstado());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el codigo de estado correctamente");
                } else if (opc==3) {
                    String query = "UPDATE usuario SET CodRol = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, usuario.getCodRol());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el codigo de Rol correctamente");
                }else if (opc==4) {
                    String query = "UPDATE usuario SET CodDep = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, usuario.getCodDep());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el codigo de departamento correctamente");
                }else if (opc==5) {
                    String query = "UPDATE usuario SET PrimerNombre = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getPrimerNombre());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el Nombre correctamente");
                }else if (opc==6) {
                    String query = "UPDATE usuario SET PrimerApellido = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getPrimerApellido());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el primer apellido correctamente");
                }else if (opc==7) {
                    String query = "UPDATE usuario SET SegundoNombre = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getSegundoNombre());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el segundo nombre correctamente");
                }else if (opc==8) {
                    String query = "UPDATE usuario SET SegundoApellido = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getSegundoApellido());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el segundo apellido correctamente");
                }else if (opc==9) {
                    String query = "UPDATE usuario SET Contrasena = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getContrasena());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la contraseña correctamente");
                }else if (opc==10) {
                    String query = "UPDATE usuario SET Direccion = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getDirrecion());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la direccion correctamente");
                }else if (opc==11) {
                    String query = "UPDATE usuario SET CorreoElectronico = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getCorreoElectronico());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el correo electronico correctamente");
                }else if (opc==12) {
                    String query = "UPDATE usuario SET Telefono = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, usuario.getTelefono());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el telefono correctamente");
                }else if (opc==13) {
                    String query = "UPDATE usuario SET Fechadenacimiento = ? WHERE IdUsuario = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, usuario.getFechadenacimiento());
                    ps.setInt(2, usuario.getIdUsuario());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la fecha de nacimiento correctamente");
                }


            }catch (Exception e){
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
