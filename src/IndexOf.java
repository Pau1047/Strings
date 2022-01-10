public class IndexOf {

    public static int index(String cadena1, String cadena2) {
        return cadena1.indexOf(cadena2);
    }

    public static void main(String[] args) {
      String cadena1 = Utilidades.leerCadena("introduce una cadena");
      String cadena2 = Utilidades.leerCadena("Introducir otra cadena");
      int resultado = index(cadena1, cadena2);

      if (resultado == -1) {
          System.out.println("No coinciden, no se puede devolver la posicion");
      }
      else if (resultado >= 0)  {
          System.out.println("Las posiciones son " + resultado);
      }
    }

}
