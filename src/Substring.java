public class Substring {

    public static String Subs (String cadena1, String cadena2){
        return cadena1.substring(Integer.parseInt(cadena2));
    }

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introducir cadena1");
        String cadena2 = Utilidades.leerCadena("Introducir cadena2");
        String resultado = Subs(cadena1,cadena2);

        System.out.println(resultado);
    }
}
