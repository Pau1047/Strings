public class Ends {

    public static boolean ultima (String cadena1, String cadena2) {
        return cadena1.endsWith(cadena2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        boolean resultado = ultima(cadena1, cadena2);

        if(resultado == true) {
            System.out.println("La cadena " + cadena1 + " contiene al final la cadena " + cadena2);
        }
        else if (resultado == false) {
            System.out.println("La cadena " + cadena1 + " no contiene al final a la cadena " + cadena2);
        }

    }
}
