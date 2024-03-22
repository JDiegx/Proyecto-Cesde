package Menu;

import Departamento.Departamento;
import Departamento.DepartamentoService;
import Estado.Estado;
import Estado.EstadoService;
import Patrocinio.Patrocinio;
import Patrocinio.PatrocinioService;
import Roles.Roles;
import Roles.RolesService;
import Usuario.Usuario;
import Usuario.UsuarioService;

import java.util.Scanner;

public class ConsolaApp {

    Scanner sc = new Scanner(System.in);

    Departamento departamento = new Departamento();
    Estado estado = new Estado();
    Patrocinio patrocinio = new Patrocinio();
    Roles roles = new Roles();
    Usuario usuario = new Usuario();

    public void menuApp(){

        System.out.println("Oprima 1 para inicializar");

        int init = sc.nextInt();

        while(init != 0){

            System.out.println("Presione: \n" +
                    "1. Registro\n" +
                    "2. Consultas\n" +
                    "3. Actualizaciones \n" +
                    "4. Eliminar\n" +
                    "5. Salir");

            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Registro");
                    menuRegistro();
                    break;
                case 2:
                    System.out.println("Consultas");
                    menuConsulta();
                    break;
                case 3:
                    System.out.println("Actulizaciones");
                    menuActualizaciones();
                    break;
                case 4:
                    System.out.println("Eliminar libro");
                    menuEliminar();
                    break;
                case 5:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }

    private void menuRegistro() {

        int opcReg;

        do{
            System.out.println("Seleccione:\n" +
                    "1. Registrar Departamento\n" +
                    "2. Registrar Estado\n" +
                    "3. Registrar Patrocinio\n"+
                    "4. Registrar Rol\n"+
                    "5. Registrar Usuario\n"+
                    "6. Volver");

            opcReg = sc.nextInt();

            switch (opcReg){
                case 1:
                    System.out.println("Registrar Departamento");
                    DepartamentoService.crearDepartamento(departamento);
                    break;
                case 2:
                    System.out.println("Registrar Estado");
                    EstadoService.crearEstado(estado);
                    break;
                case 3:
                    System.out.println("Registrar Patrocinio");
                    PatrocinioService.crearPatrocinio(patrocinio);
                    break;
                case 4:
                    System.out.println("Registrar Rol");
                    RolesService.crearRol(roles);
                    break;
                case 5:
                    System.out.println("Registrar Usuario");
                    UsuarioService.crearUsuario(usuario);
                    break;
                case 6:
                    System.out.println("Salir");
                    opcReg = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }while(opcReg != 0);
    }

    private void menuConsulta() {

        int opcCon;

        do{
            System.out.println("Seleccione:\n" +
                    "1. Consultar Departamento\n" +
                    "2. Consultar Estado\n" +
                    "3. Consultar Patrocinio\n"+
                    "4. Consultar Rol\n"+
                    "5. Consultar Usuario\n"+
                    "6. Volver");

            opcCon = sc.nextInt();

            switch (opcCon){
                case 1:
                    System.out.println("Consultar Departamento");
                    DepartamentoService.listarDepartamento();
                    break;
                case 2:
                    System.out.println("Consulatar Estado");
                    EstadoService.listarEstado();
                    break;
                case 3:
                    System.out.println("Consultar Patrocinio");
                    PatrocinioService.listarPatrocinio();
                    break;
                case 4:
                    System.out.println("Consultar Rol");
                    RolesService.listarRol();
                    break;
                case 5:
                    System.out.println("Consulat Usuario");
                    UsuarioService.listarUsuario();
                    break;
                case 6:
                    System.out.println("Salir");
                    opcCon = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }while(opcCon != 0);
    }

    private void menuActualizaciones() {

        int opcUpt;

        do{
            System.out.println("Seleccione:\n" +
                    "1. Actualizar Departamento\n" +
                    "2. Actualizar Estado\n" +
                    "3. Actualizar Patrocinio\n"+
                    "4. Actualizar Rol\n"+
                    "5. Actualizar Usuario\n"+
                    "6. Volver");

            opcUpt = sc.nextInt();

            switch (opcUpt){
                case 1:
                    System.out.println("Actualizar Departamento");
                    DepartamentoService.actualizarDepartamento(departamento);
                    break;
                case 2:
                    System.out.println("Actualizar Estado");
                    EstadoService.actualizarEstado(estado);
                    break;
                case 3:
                    System.out.println("Actualizar Patrocinio");
                    PatrocinioService.actualizarPatrocinio(patrocinio);
                    break;
                case 4:
                    System.out.println("Atualizar Rol");
                    RolesService.actualizarRol(roles);
                    break;
                case 5:
                    System.out.println("Actualizar Usuario");
                    UsuarioService.actualizarUsuario(usuario);
                    break;
                case 6:
                    System.out.println("Salir");
                    opcUpt = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }while(opcUpt != 0);
    }

    private void menuEliminar() {

        int opcDel;

        do{
            System.out.println("Seleccione:\n" +
                    "1. Eliminar Departamento\n" +
                    "2. Eliminar Estado\n" +
                    "3. Eliminar Patrocinio\n"+
                    "4. Eliminar Rol\n"+
                    "5. Eliminar Usuario\n"+
                    "6. Volver");

            opcDel = sc.nextInt();

            switch (opcDel){
                case 1:
                    System.out.println("Eliminar Departamento");
                    DepartamentoService.eliminarDepartamento();
                    break;
                case 2:
                    System.out.println("Eliminar Estado");
                    EstadoService.eliminarEstado();
                    break;
                case 3:
                    System.out.println("Eliminar Patrocinio");
                    PatrocinioService.eliminarPatrocinio();
                    break;
                case 4:
                    System.out.println("Eliminar Rol");
                    RolesService.eliminarRol();
                    break;
                case 5:
                    System.out.println("Eliminar Usuario");
                    UsuarioService.eliminarUsuario();
                    break;
                case 6:
                    System.out.println("Salir");
                    opcDel = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }while(opcDel != 0);
    }
}
