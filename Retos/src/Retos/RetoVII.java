package Retos;

import java.util.Scanner;

public class RetoVII {
    public static void main(String[] args) {
        //Declarar variables
        String rta = "si";
        int vJugadas = 0, acumulado =0, apuesta, eleccion, maquina;
        //Instanciamos clase Scanner
        Scanner leer = new Scanner(System.in);
        while(rta.equalsIgnoreCase("si")){
            System.out.println("¿Cuanto dinero desea apostar? La maquina apostará lo mismo que usted.");
            //capturamos valor
            apuesta = leer.nextInt();
            //solicitar lado de la moneda 
            System.out.println("Para jugar seleccione una cara de la moneda: \n 0.Cara \n 1.Sello");
            //capturar valor
            eleccion = leer.nextInt();
            //generar valor de maquina
            maquina = (int)(Math.random()*2);
            //validar ganador
            if(eleccion == maquina){
                acumulado = acumulado + apuesta;
                //contador 
                vJugadas = vJugadas +1;
                //mensaje 
                System.out.println("¡Gano!");
            }else{
                acumulado = acumulado - apuesta;
                //contador 
                vJugadas = vJugadas +1;
                //mensaje 
                System.out.println("Perdio!");
            }
            //quiere volver a jugar 
            System.out.println("¿Quiere jugar de nuevo: 'si o 'no'. ");
            //capturar valor
            rta = leer.next();
        }
        //validar e imprimir resultado de juego
        if(acumulado >0 ){
            System.out.println("Usted jugo "+vJugadas+" veces y acumulo "+acumulado+ " pesos en ganancia.");
        }else if(acumulado < 0){
            System.out.println("Usted jugo "+vJugadas+" veces y acumulo "+acumulado+ " pesos en perdidas.");
        }else{
            System.out.println("Usted jugo "+vJugadas+" veces y no gano ni perdio nada");
        }
        //limpiar el buffer
        leer.close();
    }
}
