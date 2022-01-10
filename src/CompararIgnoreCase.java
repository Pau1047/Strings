public class CompararIgnoreCase {

    public static int comparar (String cadena1, String cadena2) {
        return cadena1.compareToIgnoreCase(cadena2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        int resultado = comparar(cadena1, cadena2);

        if (resultado == 0 ) {
            System.out.println("Las cadenas son iguales");
        }
        else if (resultado > 0 ) {
            System.out.println("La cadena " + cadena1 + " es mayor que la cadena " + cadena2);
        }
        else if (resultado < 0)  {
            System.out.println("La cadena " + cadena1 + " es mayor que la cadena " + cadena2);
        }


    }
}
