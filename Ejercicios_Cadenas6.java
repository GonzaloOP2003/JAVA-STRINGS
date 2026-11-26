import java.util.Scanner;

public class Ejercicios_Cadenas6 {
    public static void main(String[] args) {
     
        String cadena;
        int i = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena para darle la vuelta: ");
        cadena = entrada.nextLine();

        for (i = cadena.length() - 1; i >= 0 ; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}


