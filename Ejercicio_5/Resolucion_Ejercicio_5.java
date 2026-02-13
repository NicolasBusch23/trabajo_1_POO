package Ejercicio_5;
//Programa Principal para resolver el ejercicio 5
public class Resolucion_Ejercicio_5 {
    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        suma = Operaciones_Intermedias.primer_actualizacion(suma, x);

        y = 40;
        x = x + Math.pow(y,2);
        suma = Operaciones_Intermedias.segunda_actualizacion(suma, x, y);

        System.out.println("El valor de la suma es: " + suma);
    }
}