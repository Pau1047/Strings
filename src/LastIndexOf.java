public class LastIndexOf {

    public static int index(String cadena1, String cadena2) {
        return cadena1.lastIndexOf(cadena2);
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        int resultado = index(cadena1,cadena2);

        if(resultado == -1){
            System.out.println("No se puede, no coinciden las cadenas");
        }
        else if (resultado >=0){
            System.out.println("Las posiciones son " + resultado);
        }
    }
}
