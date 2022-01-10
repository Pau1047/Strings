public class Contains {

    public static boolean contiene (String cadena1, String cadena2) {
        return cadena1.contains(cadena2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        boolean resultado = contiene(cadena1, cadena2);

        if (resultado == true) {
            System.out.println("La cadena " + cadena1 + " contiene a la cadena " + cadena2);
        }
        else if (resultado == false) {
            System.out.println("La cadena " + cadena1 + " no contiene a la cadena " + cadena2);
        }

    }

}
