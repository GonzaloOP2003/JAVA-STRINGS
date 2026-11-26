import java.util.Scanner;

public class Ejercicios_Cadenas4 {
    public static void main(String[] args) {
     
        String cadena, porcion;
        int palabras = 0;

        String espacio = " ";

        System.out.println("Dime una cadena: ");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        
        if (cadena.length() == 0 || cadena.startsWith(espacio)) {
            System.out.println("Debes introducir una cadena o la cadena debe empear por una palabra");
        } else {

            for (int i = 0; i < cadena.length(); i++) {
            porcion = cadena.substring(i, i + 1);
            
            if (porcion.equals(espacio))
                palabras++;
            }

            System.out.println("Hay " + (palabras + 1) + " palabras");
        }   
    }
}


