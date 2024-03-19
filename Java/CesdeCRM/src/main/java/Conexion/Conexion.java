package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() {

        Connection conexion = null;


        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cesdedbcrm","root","");

            if (conexion != null) {System.out.println("Conexión Exitosa!");}

        }catch (SQLException e) {
            System.out.println(e);
        }
        return conexion;

    }

}