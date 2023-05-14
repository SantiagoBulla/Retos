package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        /*//Declaro variables 
        int cantidad; 
        double precio, total =0;
        //solicitamos la cantidad de productos
        System.out.println("Ingrese la cantidad de productos que desea comprar: ");
        //instanciamos clase Scanner 
        Scanner leer = new Scanner(System.in);
        //asignamod valor 
        cantidad = leer.nextInt();
        //bucle for 
        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese el precio del producto: " + (i+1));
            precio = leer.nextDouble();
            total = total + precio;
        }
        System.out.println("El total de la compra es: " + total);
        //limpiar buffer
        leer.close();*/
        //Declaro variables 
        String rta= "si"; 
        double precio, total =0;
        //instanciamos clase Scanner 
        Scanner leer = new Scanner(System.in);
        //while
        while(rta.equalsIgnoreCase("si")){
            System.out.println("Ingrese el precio del producto: ");
            precio = leer.nextDouble();
            total = total + precio;
            System.out.println("Desea sumar a su cuenta otro producto, reponda 'si' o 'no'.");
            rta = leer.next();
        }
        System.out.println("El total de la compra es: " + total);
        //limpiar buffer
        leer.close();
    }
}
