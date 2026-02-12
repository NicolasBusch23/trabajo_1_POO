public class Edades {
    //Método o función para calcular la edad de Alberto
    public static double calcular_edad_alberto(double edad_juan) {
        double edad_alberto = 2 * edad_juan / 3;
        return edad_alberto;
    }

    //Método o función para calcular la edad de Ana
    public static double calcular_edad_ana(double edad_juan) {
        double edad_ana = 4 * edad_juan / 3;
        return edad_ana;
    }

    //Método o función para calcular la edad de Mamá
    public static double calcular_edad_mama(double edad_juan) {
        double edad_mama = edad_juan + calcular_edad_alberto(edad_juan) + calcular_edad_ana(edad_juan);
        return edad_mama;
    }
}
