package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de Carisellazo");
        //Decarar variable
        int eleccion, maquina; 
        //Instanciamos la clase random
        Random r = new Random();
        //Instanciar clase Scanner
        Scanner leer = new Scanner(System.in);
        //solicitamos al usuario que elija cara o sello 
        System.out.println("Ingrese el lado de la moneda con el que desea jugar: \n 1.Cara \n 2.Sello");
        //capturamos valor
        eleccion = leer.nextInt();
        //generar lado de la moneda para jugar 
        maquina = r.nextInt(2);
        //Condicion que evalua si gana o pierde
        if(eleccion == (maquina + 1 )){
            if(eleccion == 1 && maquina == 0){
                System.out.println("Usted eligio cara y la maquina ha elegido cara. Usted ha ganado. ¡Felicitaciones!");            
            }else{
                System.out.println("Usted eligio la sello y la maquina ha elegido sello. Usted ha ganado. ¡Felicitaciones!");            
            }
        }else{
            if(eleccion == 1 && maquina != 0){
                System.out.println("Usted eligio cara y la maquina ha elegido sello. Usted ha perdido.");            
            }else{
                System.out.println("Usted eligio la sello y la maquina ha elegido cara. Usted ha perdido.");            
            }
        }
        System.out.println("----------------");
        //limpiar el buffer 
        leer.close();
    }
}
