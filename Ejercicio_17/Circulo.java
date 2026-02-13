package Ejercicio_17;

public class Circulo {
    //Método o función para calcular el área de un círculo
    public static double calcular_area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    //Método o función para calcular la longitud de la circunferencia de un círculo
    public static double calcular_circunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
