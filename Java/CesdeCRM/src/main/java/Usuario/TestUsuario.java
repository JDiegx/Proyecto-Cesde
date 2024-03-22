package Usuario;

public class TestUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        UsuarioService.crearUsuario(usuario);

        //UsuarioService.listarUsuario();

        //UsuarioService.eliminarUsuario();

        //UsuarioService.actualizarUsuario(usuario);
    }
}
