package Ejercicio_14;
import java.util.Scanner; //Se utiliza la clase 'Scanner' dentro de la librería 'java.util' para leer la entrada del usuario

//Programa Principal para resolver el ejercicio 14
public class Resolución_Ejercicio_14 {
    public static void main(String[] args) {
        double numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su cuadrado y su cubo: ");
        numero = entrada.nextDouble();
        System.out.println("El cuadrado del número " + numero + " es: " + Potencias.calcular_cuadrado(numero));
        System.out.println("El cubo del número " + numero + " es: " + Potencias.calcular_cubo(numero));
    }
}