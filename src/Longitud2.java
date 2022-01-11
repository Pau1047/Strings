import java.util.Scanner;

public class Longitud2 {

    public static int longitud(String cadena, int numero) {
        int contador = 0;
        for (String palabra :Utilidades.dividirEnPalabras(cadena)) {
            if (palabra.length() == numero) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean corrector (int contador) {
        if (contador >= 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce el numero");

        int numero = introducir.nextInt();
        int contadorprincipal = longitud(cadena,numero);

        boolean resultado = corrector(contadorprincipal);

        if (resultado == true) {
            System.out.println("Si que hay");
        }
        else if (resultado == false) {
            System.out.println("No hay");
        }
    }
}
