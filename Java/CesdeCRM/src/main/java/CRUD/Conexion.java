package miLibreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//En esta clase basicamente se hace la conexion con la base de datos
public class Conexion {

    public Connection get_connection() {

        Connection conexion = null;

        //es como decir intenta hacer la conexion y cuando lo intentes me vas a llamar
        //a una clase que se llama DriveManager
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mislibrosdb","root","");

            if (conexion != null) {System.out.println("Conexión Exitosa");}

        }catch (SQLException e) {
            System.out.println(e);
        }
        return conexion;

    }

}