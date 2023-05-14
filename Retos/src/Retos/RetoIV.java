package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        //Declaramos variables 
        int eleccion, maquina; 
        //Instanciamos clase Scanner 
        Scanner leer = new Scanner(System.in);
        //Solicitamos opcion del usuario 
        System.out.println("Para juagar elija una opcion: \n 1.Piedra \n 2.Papel \n 3.Tijera");
        //capturamos valor 
        eleccion = leer.nextInt();
        //creamos objeto random
        Random r = new Random();
        //asiganamos valor aleatorio a la variable maquina
        maquina = r.nextInt(3);
        //evaluamos si existe empate 
        if(maquina == (eleccion -1)){
            System.out.println("Hay un empate los dos jugadores sacaraon lo mismo");
            //Maquina jugando piedra
        }else if(maquina == 0 && eleccion == 2){
            System.out.println("Usted saco papel y la maquina piedra. ¡GANO!");
        }else if(maquina == 0 && eleccion == 3){
            System.out.println("Usted saco tijera y la maquina piedra. !PERDIO!");
            //maquina jugando pepel
        }else if(maquina == 1 && eleccion == 3){
            System.out.println("Usted saco tijera y la maquina papel. !GANO!!");
        }else if(maquina == 1 && eleccion == 1){
            System.out.println("Usted saco piedra y la maquina papel. !PERDIO!");
            //maquina jugando tijera 
        }else if(maquina == 2 && eleccion == 1){
            System.out.println("Usted saco peidra y la maquina tijera. ¡GANO!");
        }else{
            System.out.println("Usted saco papel y la maquina tijera. !PERDIO!");
        }
        leer.close();
    }
}
