public class Digitos {

    public static int digito (String cadena){
        int contador = 0;
        for (int i = 0; i > cadena.length(); i++){
            if (Character.isDigit(Utilidades.leerCaracter(cadena))){
                contador++;
            }
        }
        return contador;
    }


    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena");
        int resultado = digito(cadena);

        if (resultado >= 1){
            System.out.println("Hay " + resultado + " digitos en la cadena");
        }
       else if (resultado == 0){
            System.out.println("No hay digitos en la cadena");
        }
    }
}
