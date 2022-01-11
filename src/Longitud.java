import java.util.Scanner;

public class Longitud {

    public static int longitud (String cadena, int numero)  {
        int contador = 0;
        String[] palabras = Utilidades.dividirEnPalabras(cadena);
        for (String palabra : palabras){
            if(palabra.length() == numero){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        String cadena = Utilidades.leerCadena("Introduce la cadena");
        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce el numero de longitud");
        int numero = introducir.nextInt();
        int resultado = longitud(cadena, numero);

        if (resultado >= 1) {
            System.out.println("Hay " + resultado + " palabras con esa longitud de digitos");
        }
        else if (resultado == 0){
            System.out.println("No hay palabras con esa longitud");
        }


    }
}
