import java.util.Scanner;

public class Ejercicios_Cadenas5 {
    public static void main(String[] args) {
     
        String nombre, apellidos;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellidos");

        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        nombre = nombre.toUpperCase();
        
        System.out.println("Apellidos: ");
        apellidos = entrada.nextLine();
        apellidos = apellidos.toUpperCase();

        System.out.println("Tus iniciales son " + nombre.substring(0, 1) + apellidos.substring(0, 1));
        
    }
}


