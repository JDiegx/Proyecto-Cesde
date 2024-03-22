package Estado;

import java.util.Scanner;

public class EstadoService {

    static Scanner sc = new Scanner(System.in);

    public static void crearEstado(Estado estado){
        System.out.println("Ingrese el codigo de estado");
        int idEst = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de estado");
        String nombre = sc.nextLine();
        System.out.println("Ingrese descripcion: ");
        String descripcion = sc.nextLine();
        sc.nextLine();

        estado.setCodEstado(idEst);
        estado.setNombre(nombre);
        estado.setDescripcion(descripcion);

        EstadoDAO.crearEstadoDAO(estado);

    }

    public static void listarEstado(){

        EstadoDAO.listarEstadoDB();
    }

    public static void eliminarEstado(){
        System.out.println("Indique codigo de estado a eliminar");

        int codE = sc.nextInt();

        EstadoDAO.eliminarEstadoDB(codE);

    }

    public static void actualizarEstado(Estado estado){

        System.out.println("Elija el campo que desea actualizar");

        int opcCampo= sc.nextInt();
        estado.setOpcCampo(opcCampo);

        switch(opcCampo){
            case 1:
                System.out.println("Seleccione el codigo de estado que desea actualizar");
                int idN = sc.nextInt();
                estado.setCodEstado(idN);
                sc.nextLine();
                System.out.println("Ingrese el nuevo nombre del estado: ");
                String nombre = sc.nextLine();
                estado.setNombre(nombre);
                EstadoDAO.actualizarEstadoDB(estado);
                break;
            case 2:
                System.out.println("Seleccione el codigo de estado que desea actualizar");
                int idD = sc.nextInt();
                estado.setCodEstado(idD);
                sc.nextLine();
                System.out.println("Ingrese la nueva descripcion del estado: ");
                String descripcion = sc.nextLine();
                estado.setDescripcion(descripcion);
                EstadoDAO.actualizarEstadoDB(estado);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }
}
