package Usuario;

//import java.sql.Date;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class UsuarioService {

    static Scanner sc = new Scanner(System.in);

    public static void crearUsuario (Usuario usuario){

        System.out.println("Ingrese id de Usuario");
        int IdUsuario = sc.nextInt();
        System.out.println("Ingrese cedula de Usuario");
        int NitCedula = sc.nextInt();
        System.out.println("Ingrese codigo de estado de Usuario");
        int CodEstado = sc.nextInt();
        System.out.println("Ingrese codigo de rol de Usuario");
        int CodRol = sc.nextInt();
        System.out.println("Ingrese codigo de departamento : ");
        int CodDep = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre de Usuario : ");
        String ombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese primer apellido de Usuario");
        String PrimerApellido = sc.nextLine();
        System.out.println("Ingrese segundo nombre de Usuario");
        String SegundoNombre = sc.nextLine();
        System.out.println("Ingrese segundo apellido de Usuario");
        String SegundoApellido = sc.nextLine();
        System.out.println("Ingrese contraseña : ");
        String Contrasena =sc.nextLine();
        System.out.println("Ingrese direccion de Usuario");
        String Direccion = sc.nextLine();
        System.out.println("Ingrese Email : ");
        String Email = sc.nextLine();
        System.out.println("Ingrese telefono : ");
        int Telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento : ");
        String FechaNac = sc.nextLine();
        //sc.nextLine();

        /* SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Convertimos la cadena de texto a un objeto Date
            Date fecha = formato.parse(FechaNac);
            System.out.println("Fecha ingresada: " + fecha);
        } catch (ParseException e) {
            System.out.println("El formato de la fecha ingresada no es válido.");
        } */

        usuario.setIdUsuario(IdUsuario);
        usuario.setNitCedula(NitCedula);
        usuario.setCodEstado(CodEstado);
        usuario.setCodRol(CodRol);
        usuario.setCodDep(CodDep);
        usuario.setPrimerNombre(ombre);
        usuario.setPrimerApellido(PrimerApellido);
        usuario.setSegundoNombre(SegundoNombre);
        usuario.setSegundoApellido(SegundoApellido);
        usuario.setContrasena(Contrasena);
        usuario.setDirrecion(Direccion);
        usuario.setCorreoElectronico(Email);
        usuario.setTelefono(Telefono);
        usuario.setFechadenacimiento(FechaNac);

        UsuarioDAO.crearUsuarioDAO(usuario);

    }

    public static void listarUsuario(){

        UsuarioDAO.listarUsuarioDB();
    }

    public static void eliminarUsuario(){

        System.out.println("indique el id de usuario a eliminar");

        int idUsuario = sc.nextInt();

        UsuarioDAO.eliminarUsuarioDB(idUsuario);
    }

    public static void actualizarUsuario(Usuario usuario){

        System.out.println("Elija el campo que desea actualizar");

        int opcCampo= sc.nextInt();
        usuario.setOpcCampo(opcCampo);

        switch (opcCampo){
            case 1:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int id = sc.nextInt();
                usuario.setIdUsuario(id);
                sc.nextLine();
                System.out.println("Ingrese el nuevo numero de cedula del usuario: ");
                int NitCedula = sc.nextInt();
                usuario.setNitCedula(NitCedula);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 2:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idEst = sc.nextInt();
                usuario.setIdUsuario(idEst);
                sc.nextLine();
                System.out.println("Ingrese el nuevo codigo de estado del usuario: ");
                int codEstado = sc.nextInt();
                usuario.setCodEstado(codEstado);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 3:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idRol = sc.nextInt();
                usuario.setIdUsuario(idRol);
                sc.nextLine();
                System.out.println("Ingrese el nuevo codigo de rol del usuario: ");
                int codRol = sc.nextInt();
                usuario.setCodRol(codRol);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 4:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idDep = sc.nextInt();
                usuario.setIdUsuario(idDep);
                sc.nextLine();
                System.out.println("Ingrese el nuevo codigo de departamento del usuario: ");
                int codDep = sc.nextInt();
                usuario.setCodDep(codDep);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 5:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idN = sc.nextInt();
                usuario.setIdUsuario(idN);
                sc.nextLine();
                System.out.println("Ingrese el nuevo nombre del usuario: ");
                String nombre = sc.nextLine();
                usuario.setPrimerNombre(nombre);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 6:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idAp = sc.nextInt();
                usuario.setIdUsuario(idAp);
                sc.nextLine();
                System.out.println("Ingrese el nuevo apellido del usuario: ");
                String apellido = sc.nextLine();
                usuario.setPrimerApellido(apellido);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 7:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idsn = sc.nextInt();
                usuario.setIdUsuario(idsn);
                sc.nextLine();
                System.out.println("Ingrese el nuevo segundo nombre del usuario: ");
                String segundoNom = sc.nextLine();
                usuario.setSegundoNombre(segundoNom);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 8:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idsa = sc.nextInt();
                usuario.setIdUsuario(idsa);
                sc.nextLine();
                System.out.println("Ingrese el nuevo segundo apellido del usuario: ");
                String segundoApellido = sc.nextLine();
                usuario.setSegundoApellido(segundoApellido);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 9:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idC = sc.nextInt();
                usuario.setIdUsuario(idC);
                sc.nextLine();
                System.out.println("Ingrese la nueva contraseña del usuario: ");
                String Contrasena = sc.nextLine();
                usuario.setContrasena(Contrasena);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 10:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idDir = sc.nextInt();
                usuario.setIdUsuario(idDir);
                sc.nextLine();
                System.out.println("Ingrese la nueva direccion del usuario: ");
                String direccion = sc.nextLine();
                usuario.setDirrecion(direccion);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 11:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idCorreo = sc.nextInt();
                usuario.setIdUsuario(idCorreo);
                sc.nextLine();
                System.out.println("Ingrese el nuevo correo electronico del usuario: ");
                String email = sc.nextLine();
                usuario.setCorreoElectronico(email);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 12:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idT = sc.nextInt();
                usuario.setIdUsuario(idT);
                sc.nextLine();
                System.out.println("Ingrese el nuevo telefono del usuario: ");
                int telefono = sc.nextInt();
                usuario.setTelefono(telefono);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            case 13:
                System.out.println("Seleccione el id usuario que desea actualizar");
                int idF = sc.nextInt();
                usuario.setIdUsuario(idF);
                sc.nextLine();
                System.out.println("Ingrese la nueva fecha de nacimiento del usuario: ");
                String FechaNac = sc.nextLine();
                usuario.setFechadenacimiento(FechaNac);
                UsuarioDAO.actualizarUsuarioDB(usuario);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }
}
