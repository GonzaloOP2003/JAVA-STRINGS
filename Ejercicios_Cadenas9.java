import java.util.Scanner;

public class Ejercicios_Cadenas9 {
    public static void main(String[] args) {
     
        String cadena, cadena2, trozo;
        boolean trozoEncontrado = false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Dime una subcadena: ");
        cadena2 = entrada.nextLine();

        for (int i = 0; i < cadena.length() - cadena2.length(); i++) {
            
            trozo = cadena.substring(i, i + cadena2.length());  

            if (trozo.equals(cadena2)) 
               trozoEncontrado = true;
            
        }

        if (trozoEncontrado) {
            System.out.println("La cadena contiene la subcadena");
        } else {
            System.out.println("La cadena no contiene la subcadena");
        }
        
    }
}


