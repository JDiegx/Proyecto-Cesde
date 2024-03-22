package Departamento;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartamentoDAO {

    static Scanner sc = new Scanner(System.in);

    public static void crearDepatamentoDAO(Departamento departamento) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.get_connection()) {

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO departamento(CodDep, Descripcion, Cargo, NombreDep)VALUES(?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1, departamento.getCodDep());
                ps.setString(2, departamento.getDescripcion());
                ps.setString(3, departamento.getCargo());
                ps.setString(4, departamento.getNombreDep());

                ps.executeUpdate();

                System.out.println("Registro de departamento exitoso");

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void listarDepartamentoDB() {

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try (Connection connect = conexion.get_connection()) {

            String query = "Select * from departamento";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("codigo departamento: " + rs.getInt("CodDep"));
                System.out.println("Descripcion: " + rs.getString("Descripcion"));
                System.out.println("Cargo: " + rs.getString("Cargo"));
                System.out.println("Nombre departamento: " + rs.getString("NombreDep"));
            }

        } catch (Exception e) {
            System.out.println("No se pudo recuperar los valores de departamento");
            System.out.println(e);
        }
    }

    public static void eliminarDepartamentoDB(int id) {

        Conexion conexion = new Conexion();


        try (Connection connect = conexion.get_connection()) {

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM departamento WHERE departamento.CodDep = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("El registro ha sido eliminado correctamente");

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void actualizarDepartamentoDB(Departamento departamento) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.get_connection()) {

            PreparedStatement ps = null;

            try {

                int opc = departamento.getOpcCampo();

                if (opc == 1) {
                    String query = "UPDATE departamento SET Descripcion = ? WHERE CodDep = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, departamento.getDescripcion());
                    ps.setInt(2, departamento.getCodDep());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la descripcion correctamente");
                }else if(opc == 2) {
                    String query = "UPDATE departamento SET Cargo = ? WHERE CodDep = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, departamento.getCargo());
                    ps.setInt(2, departamento.getCodDep());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el cargo correctamente");
                }else if(opc == 3) {
                    String query = "UPDATE departamento SET NombreDep = ? WHERE CodDep = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, departamento.getNombreDep());
                    ps.setInt(2, departamento.getCodDep());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nombre del departamento correctamente");
                }


                }catch(SQLException e ){
                    System.out.println("No se pudo actualizar el registro seleccionado");

                    System.out.println(e);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    
}


