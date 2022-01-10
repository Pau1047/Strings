import java.util.Scanner;

public class Reemplazar {

    public static String reemplaza(String cadena1, char caracter1, char caracter2) {
        return cadena1.replace(caracter1, caracter2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir una cadena");
        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char caracter1 = introducir.next().charAt(0);
        System.out.println("Introduce otro caracter");
        char caracter2 = introducir.next().charAt(0);
        String resultado = reemplaza(cadena1, caracter1, caracter2);

        System.out.println(resultado);

    }
}
