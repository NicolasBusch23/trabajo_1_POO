package Ejercicio_12;
//Programa Principal para resolver el ejercicio 12
public class Resolución_Ejercicio_12 {
    public static void main(String[] args) {
        double horas_trabajadas = 48;
        double valor_hora = 5000;
        double porcentaje_retencion_fuente = 0.125;

        //Se usan los 3 métodos definidos en la clase 'Operaciones'
        double salario_bruto = Operaciones.calcular_salario_bruto(horas_trabajadas, valor_hora);
        double retencion_fuente = Operaciones.calcular_retencion_fuente(salario_bruto, porcentaje_retencion_fuente);
        double salario_neto = Operaciones.calcular_salario_neto(salario_bruto, retencion_fuente);

        System.out.println("El salario bruto del trabajador es: $" + salario_bruto);
        System.out.println("La retención en la fuente del salario del trabajador es: $" + retencion_fuente);
        System.out.println("El salario neto del trabajador es: $" + salario_neto);
        
    }
}
