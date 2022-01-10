public class Concat {

    public static String juntar (String cadena1, String cadena2) {
        return cadena1.concat(cadena2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        String resultado = juntar(cadena1,cadena2);

        System.out.println("El resultado de concatenar las dos cadenas es: " + resultado);

    }
}
