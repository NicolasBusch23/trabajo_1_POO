package Ejercicio_12;

public class Operaciones {
    //Método o función para calcular el salario bruto
    public static double calcular_salario_bruto(double horas_trabajadas, double valor_hora) {
        double salario_bruto = horas_trabajadas * valor_hora;
        return salario_bruto;
    }

    //Método o función para calcular la retención en la fuente
    public static double calcular_retencion_fuente(double salario_bruto, double porcentaje_retencion_fuente) {
        double retencion_fuente = salario_bruto * porcentaje_retencion_fuente;
        return retencion_fuente;
    }

    //Método o función para calcular el salario neto
    public static double calcular_salario_neto(double salario_bruto, double retencion_fuente) {
        double salario_neto = salario_bruto - retencion_fuente;
        return salario_neto;
    }
}
