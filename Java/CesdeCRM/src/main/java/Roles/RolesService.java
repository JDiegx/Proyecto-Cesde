package Roles;

import java.util.Scanner;

public class RolesService {

    static Scanner sc = new Scanner(System.in);

    public static void crearRol(Roles roles){

        System.out.println("Ingrese el cod de rol");
        int codRol = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de rol");
        String nombre = sc.nextLine();
        System.out.println("Ingrese descripcion de rol: ");
        String descripcion = sc.nextLine();

        sc.nextLine();

        roles.setCodRol(codRol);
        roles.setNombre(nombre);
        roles.setDescripcion(descripcion);


        RolesDAO.crearRolDAO(roles);
    }

    public static void listarRol(){

        RolesDAO.listarRolDB();
    }

    public static void eliminarRol(){

        System.out.println("Indique el codigo de rol a eliminar");

        int codRol = sc.nextInt();

        RolesDAO.eliminarRolDB(codRol);
    }

    public static void actualizarRol(Roles roles){

        System.out.println("Elija el campo que desea actualizar");

        int opcCampo= sc.nextInt();
        roles.setOpcCampo(opcCampo);

        switch(opcCampo){
            case 1:
                System.out.println("Seleccione el codigo de rol que desea actualizar");
                int id = sc.nextInt();
                roles.setCodRol(id);
                sc.nextLine();
                System.out.println("Ingrese el nuevo nombre del rol: ");
                String nombre = sc.nextLine();
                roles.setNombre(nombre);
                RolesDAO.actualizarRolDB(roles);
                break;
            case 2:
                System.out.println("Seleccione el codigo de rol que desea actualizar");
                int idDesc = sc.nextInt();
                roles.setCodRol(idDesc);
                sc.nextLine();
                System.out.println("Ingrese la nueva descripcion del rol: ");
                String descrip = sc.nextLine();
                roles.setDescripcion(descrip);
                RolesDAO.actualizarRolDB(roles);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }
}
