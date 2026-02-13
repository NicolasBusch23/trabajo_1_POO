package Ejercicio_17;
import java.util.Scanner; //Se utiliza la clase 'Scanner' dentro de la librería 'java.util' para leer la entrada del usuario

//Programa Principal para resolver el ejercicio 17
public class Resolución_Ejercicio_17 {
    public static void main(String[] args) {
        double radio;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();
        System.out.println("El área del círculo es: " + Circulo.calcular_area(radio));
        System.out.println("La longitud de la circunferencia del círculo es: " + Circulo.calcular_circunferencia(radio));
    }
}