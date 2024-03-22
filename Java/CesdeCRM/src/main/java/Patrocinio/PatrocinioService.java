package Patrocinio;


import java.util.Scanner;

public class PatrocinioService {

    static Scanner sc = new Scanner(System.in);

    public static void crearPatrocinio(Patrocinio patrocinio) {

        System.out.println("Ingrese Nit/cedula de patrocinio");
        int nitCedula = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de patrocinio");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese numero de cupos: ");
        int cupos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese fecha de inicio: ");
        String inicio = sc.nextLine();
        System.out.println("Ingrese fecha de finalizacion: ");
        String finalizacion = sc.nextLine();
        System.out.println("Ingrese tiempo de duracion: ");
        String duracion = sc.nextLine();
        System.out.println("Ingrese beneficios: ");
        String beneficios = sc.nextLine();
        System.out.println("Ingrese tipo de convenio: ");
        String tipoConv = sc.nextLine();
        sc.nextLine();

        patrocinio.setNitCedula(nitCedula);
        patrocinio.setNombre(nombre);
        patrocinio.setDescripcion(descripcion);
        patrocinio.setCupos(cupos);
        patrocinio.setInicio(inicio);
        patrocinio.setFinalizacion(finalizacion);
        patrocinio.setDuracion(duracion);
        patrocinio.setBeneficios(beneficios);
        patrocinio.setTipodeConvenio(tipoConv);


        PatrocinioDAO.crearPatrocinioDAO(patrocinio);
    }

    public static void listarPatrocinio (){

        PatrocinioDAO.listarPatrocinioDB();
    }

    public static void eliminarPatrocinio(){
        System.out.println("Indique NitCedula que desea eliminar");

        int nitCedula = sc.nextInt();

        PatrocinioDAO.eliminarPatrocinioDB(nitCedula);

    }

    public static void actualizarPatrocinio(Patrocinio patrocinio){

        System.out.println("Elija el campo que desea actualizar");

        int opcCampo= sc.nextInt();
        patrocinio.setOpcCampo(opcCampo);

        switch (opcCampo){
            case 1:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int id = sc.nextInt();
                patrocinio.setNitCedula(id);
                sc.nextLine();
                System.out.println("Ingrese el nuevo Nombre : ");
                String nombre = sc.nextLine();
                patrocinio.setNombre(nombre);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 2:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idD = sc.nextInt();
                patrocinio.setNitCedula(idD);
                sc.nextLine();
                System.out.println("Ingrese la nueva descripcion : ");
                String descrip = sc.nextLine();
                patrocinio.setDescripcion(descrip);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 3:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idCp = sc.nextInt();
                patrocinio.setNitCedula(idCp);
                sc.nextLine();
                System.out.println("Ingrese el nuevo nnumero de cupos : ");
                int cupos = sc.nextInt();
                patrocinio.setCupos(cupos);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 4:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idIn = sc.nextInt();
                patrocinio.setNitCedula(idIn);
                sc.nextLine();
                System.out.println("Ingrese la nueva fecha de inicio : ");
                String inicio = sc.nextLine();
                patrocinio.setInicio(inicio);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 5:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idFin = sc.nextInt();
                patrocinio.setNitCedula(idFin);
                sc.nextLine();
                System.out.println("Ingrese la nueva fecha de finalizacion : ");
                String finalizacion = sc.nextLine();
                patrocinio.setFinalizacion(finalizacion);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 6:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idDur = sc.nextInt();
                patrocinio.setNitCedula(idDur);
                sc.nextLine();
                System.out.println("Ingrese el nuevo tiempo de duracion : ");
                String duracion = sc.nextLine();
                patrocinio.setDuracion(duracion);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 7:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idBen = sc.nextInt();
                patrocinio.setNitCedula(idBen);
                sc.nextLine();
                System.out.println("Ingrese el nuevo campo beneficios : ");
                String beneficios = sc.nextLine();
                patrocinio.setBeneficios(beneficios);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            case 8:
                System.out.println("Seleccione el Nit/Cedula que desea actualizar");
                int idConv = sc.nextInt();
                patrocinio.setNitCedula(idConv);
                sc.nextLine();
                System.out.println("Ingrese el nuevo tipo de convenio : ");
                String convenio = sc.nextLine();
                patrocinio.setTipodeConvenio(convenio);
                PatrocinioDAO.actualizarPatrocinioDB(patrocinio);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }

}
