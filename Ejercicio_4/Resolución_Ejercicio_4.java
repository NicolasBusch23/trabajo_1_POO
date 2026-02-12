package Ejercicio_4;
public class Resolución_Ejercicio_4 {
        public static void main(String[] args) {

        double edad_juan = 9;
        double edad_alberto, edad_ana, edad_mama;

        //Se usan los 3 métodos definidos en la clase 'Edades'
        edad_alberto = Edades.calcular_edad_alberto(edad_juan);
        edad_ana = Edades.calcular_edad_ana(edad_juan);
        edad_mama = Edades.calcular_edad_mama(edad_juan);

        System.out.println("Las edades son: Alberto = " + edad_alberto + 
        " años, Juan = " + edad_juan + " años, Ana = " + edad_ana + 
        " años, Mamá = "+ edad_mama +" años.");
    }
}

