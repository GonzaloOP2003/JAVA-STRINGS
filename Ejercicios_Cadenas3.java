import java.util.Scanner;

public class Ejercicios_Cadenas3 {
    public static void main(String[] args) {
     
        String cadena1, caracter, porcion;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime una cadena");
        cadena1 = entrada.nextLine();

        System.out.println("Dime una caracter");
        caracter = entrada.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {
            porcion = cadena1.substring(i, i + 1);
            if (porcion.equals(caracter)){
                contador++;
            }
        }
        
        System.out.println("El caracter" + caracter + " se repite " + contador + " veces");
    }
}


