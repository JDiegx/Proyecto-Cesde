package CRUD;

import java.sql.Connection;

public class TestConexion {

    public static void main(String[] args) {

        miLibreria.Conexion conexion = new miLibreria.Conexion();
        //creamos un tray con recursos osea que recibe parametros
        try (Connection connect = conexion.get_connection()){

        }catch (Exception e){

        }
    }


}
