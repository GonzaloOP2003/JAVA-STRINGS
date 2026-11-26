import java.util.Scanner;

public class Ejercicios_Cadenas8 {
    public static void main(String[] args) {
     
        String cadena;
        String resultado = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            
            char letra = cadena.charAt(i);
            if (Character.isUpperCase(letra)) {
                letra = Character.toLowerCase(letra);
            } else {
                letra = Character.toUpperCase(letra);
            }

            resultado += letra;
        }
        System.out.println(resultado);
    }
}


