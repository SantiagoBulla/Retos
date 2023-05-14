package Retos;

import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        //Declarar la variables
        int dVacuna = 0, pBebe, mBebe;
        String namEnfermera, namePadre, namBebe;
        //Solicitar el ingreso de los valores de las variables de entrada
        //Instanciamos la clase Scanner 
        Scanner capturar = new Scanner(System.in);
        //Solicitar el ingreso de los valores de las variables de entrada
        //datos enfermera
        System.out.print("Por favor ingrese el nombre de la enefermera");
        namEnfermera = capturar.nextLine();
        //datos padre
        System.out.println("Ingrese el nombre del padre o madre: ");
        namePadre = capturar.nextLine();
        //datos bebe
        System.out.println("Por favor ingrese los datos del bebe");
        System.out.print("Nombre bebe: ");
        namBebe = capturar.nextLine();
        System.out.print("Edad en meses del bebe: ");
        mBebe = capturar.nextInt();
        System.out.print("Peso del bebe: ");
        pBebe = capturar.nextInt();
        //calcular la dosis de la vacuna 
        dVacuna = (pBebe + 10/mBebe * 10)*8;
        //Mostrar la dosis a aplicar y los datos de los actores
        System.out.println("El nombre del paciente es: "+namBebe);
        System.out.println("El nombre del padre es: "+namePadre); 
        System.out.println("El nombre de la enefermera es: "+namEnfermera);
        System.out.println("El peso del bebe es: "+pBebe+" kg y la edad del bebe es:"+mBebe + " meses");
        System.out.println("La dosis de la vacuna a aplicar es: "+dVacuna);
        //limpiar buffer
        capturar.close();

    }
}
