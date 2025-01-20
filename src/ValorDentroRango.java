import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro de un Rango ***");
        // Definimos los límites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        // Solicitamos un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificamos si el dato está dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango? = " + estaDentroRango);
    }
}
