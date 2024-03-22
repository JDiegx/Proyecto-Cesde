package Departamento;

import java.util.Scanner;

public class DepartamentoService {

    static Scanner sc = new Scanner(System.in);

    public static void crearDepartamento (Departamento departamento){

        System.out.println("ingrese codigo de departamento");
        int codDep = sc.nextInt();
        System.out.println("ingrese descripcion de departamento");
        String Descripcion = sc.nextLine();
        sc.nextLine();
        System.out.println("ingrese Cargo");
        String Cargo = sc.nextLine();
        System.out.println("ingrese nombre de departamento");
        String NombreDep = sc.nextLine();

        departamento.setCodDep(codDep);
        departamento.setDescripcion(Descripcion);
        departamento.setCargo(Cargo);
        departamento.setNombreDep(NombreDep);

        DepartamentoDAO.crearDepatamentoDAO(departamento);

    }

    public static void listarDepartamento(){

        DepartamentoDAO.listarDepartamentoDB();
    }

    public static void eliminarDepartamento(){
        System.out.println("Indique el id del departamento a eliminar");

        int codDepartamento = sc.nextInt();

        DepartamentoDAO.eliminarDepartamentoDB(codDepartamento);

    }

    public static void actualizarDepartamento(Departamento departamento){

        System.out.println("Elija el campo que desea actualizar");

        int opcCampo= sc.nextInt();
        departamento.setOpcCampo(opcCampo);

        switch (opcCampo){
            case 1:
                System.out.println("Seleccione el codigo de departamento que desea actualizar");
                int id = sc.nextInt();
                departamento.setCodDep(id);
                sc.nextLine();
                System.out.println("Ingrese la nueva descripcion del departamento: ");
                String descrip = sc.nextLine();
                departamento.setDescripcion(descrip);
                DepartamentoDAO.actualizarDepartamentoDB(departamento);
                break;
            case 2:
                System.out.println("Seleccione el codigo de departamento que desea actualizar");
                int idC = sc.nextInt();
                departamento.setCodDep(idC);
                sc.nextLine();
                System.out.println("Ingrese el nuevo cargo del departamento: ");
                String cargo = sc.nextLine();
                departamento.setCargo(cargo);
                DepartamentoDAO.actualizarDepartamentoDB(departamento);
                break;
            case 3:
                System.out.println("Seleccione el codigo de departamento que desea actualizar");
                int idN = sc.nextInt();
                departamento.setCodDep(idN);
                sc.nextLine();
                System.out.println("Ingrese el nuevo nombre del departamento: ");
                String nombreDep = sc.nextLine();
                departamento.setNombreDep(nombreDep);
                DepartamentoDAO.actualizarDepartamentoDB(departamento);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }

}
