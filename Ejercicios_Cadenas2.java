import java.util.Scanner;

public class Ejercicios_Cadenas2 {
    public static void main(String[] args) {
     
        String cadena1, cadena2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena");
        cadena1 = entrada.nextLine();

        System.out.println("Dime una subcadena");
        cadena2 = entrada.nextLine();

        
        if (cadena1.startsWith(cadena2)) {
            System.out.println("La cadena empieza por la subcadena");
        } else {
            System.out.println("La cadena no empeiza por la subcadena");
        }
        
    }
}


