import java.util.Scanner;

public class Ejercicios_Cadenas {
    public static void main(String[] args) {
     
        int i;
        String cadena;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        cadena = entrada.nextLine();

        for (i=0; i<cadena.length(); i++){
        //  System.out.println("Caracter " + i + ": " + cadena.charAt(i));
            System.out.println("Caracter " + i + ": " + cadena.substring( i, i + 1) );
        }
    }
}


