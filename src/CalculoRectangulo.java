import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Sistema de cálculo de Área y Perímetro de un rectángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Indica la base: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.print("Indica la altura: ");
        var altura = Double.parseDouble(consola.nextLine());

        // Realizamos los calculos
        var area = base*altura;
        System.out.println("Área del rectángulo: " +area);

        var perimetro = (base + altura)*2;
        System.out.println("Perímetro del rectángulo: " +perimetro);

    }
}
