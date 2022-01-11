import java.util.Scanner;

public class Longitud3 {


    public static int longitud(String cadena, int numero) {
        int contador = 0;
        for (String palabra:Utilidades.dividirEnPalabras(cadena)) {
            if (palabra.length()>= numero) {
                contador--;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        String cadena = Utilidades.leerCadena("Introduce una cadena");

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = introducir.nextInt();

        int resultado = longitud(cadena, numero);

        if (resultado <= -1) {
            System.out.println("Hay alguna palabra larga");
        }
        else if (resultado >=0) {
            System.out.println("Todas las cadenas son cortas");
        }
    }
}
