import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        var consola = new Scanner(System.in);

        final var USUARIO_VALIDO = "user";
        final var CONTRASENA_VALIDA = "password";

        System.out.print("Cual es tu usuario? ");
        var usuarioIntroducido = consola.nextLine();

        System.out.print("Cual es tu password? ");
        var contrasenaIntroducida = consola.nextLine();

        var datosCorrectos =
                usuarioIntroducido.equals(USUARIO_VALIDO)
                && contrasenaIntroducida.equals(CONTRASENA_VALIDA);

        System.out.println("Los datos son correctos? " +datosCorrectos);
    }
}
