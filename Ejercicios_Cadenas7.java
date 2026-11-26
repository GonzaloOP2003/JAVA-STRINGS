import java.util.Scanner;

public class Ejercicios_Cadenas7 {
    public static void main(String[] args) {
     
        String cadena, cadenaNueva;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Dime un caracter : ");
        char letra = entrada.nextLine().charAt(0);

        System.out.println("Dime por cual caracter quieres remplazarlo: ");
        char letra2 = entrada.nextLine().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            
            cadenaNueva = cadena.substring(i, i + 1);
            if (cadena.charAt(i) == letra) {
                cadenaNueva = String.valueOf(letra2);
            }
            System.out.print(cadenaNueva);
        }

    }
}


