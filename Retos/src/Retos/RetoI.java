package Retos;

public class RetoI {
    public static void main(String[] args) {
        System.out.println("Programa para convertir grados Fahrenheit a grados Centigrados");
        System.out.println("--------------");
        //Asignamos el valor a la variable estatica temp que corresponde a los grados °F
        double temp = 350;
        //Inicializamos la variable centi que contendra el resultado de la conversion
        double centi = 0;
        //formula
        centi = (temp - 32) / 1.8;
        //mensaje final 
        System.out.println("Abuelita, la temperatura en grados °C para precalentar el horno es: "+ centi + "°C grados centigrados");

        
    }
}
