package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        System.out.println("El programa consiste en jugar piedra papel o tijera al mejor de 3 contra la maquina");
        //Declarar variables 
        int eleccion, maquina, vGanadasUsu=0, vGanadasMaqui=0;
        // //Instanciamos clase Scanner 
        Scanner leer = new Scanner(System.in);
        //ciclo que evalua las veces de juego 
        do{
            //Solicitamos opcion del usuario 
            System.out.println("Para juagar elija una opcion: \n 0.Piedra \n 1.Papel \n 2.Tijera");
            //capturamos valor 
            eleccion = leer.nextInt();
            //creamos objeto random
            Random r = new Random();
            //asiganamos valor aleatorio a la variable maquina
            maquina = r.nextInt(2);
                //Maquina jugando piedra
            if(maquina == 0 && eleccion == 1){
                System.out.println("Usted saco papel y la maquina piedra. ¡GANO!");
                vGanadasUsu = vGanadasUsu +1;
            }else if(maquina == 0 && eleccion == 2){
                System.out.println("Usted saco tijera y la maquina piedra. !PERDIO!");
                vGanadasMaqui = vGanadasMaqui +1;
                //maquina jugando pepel
            }else if(maquina == 1 && eleccion == 2){
                System.out.println("Usted saco tijera y la maquina papel. !GANO!!");
                vGanadasUsu = vGanadasUsu +1;
            }else if(maquina == 1 && eleccion == 0){
                System.out.println("Usted saco piedra y la maquina papel. !PERDIO!");
                vGanadasMaqui = vGanadasMaqui +1;
                //maquina jugando tijera 
            }else if(maquina == 2 && eleccion == 0){
                System.out.println("Usted saco peidra y la maquina tijera. ¡GANO!");
                vGanadasUsu = vGanadasUsu +1;
            }else if(maquina == 2 && eleccion == 1){
                System.out.println("Usted saco papel y la maquina tijera. !PERDIO!");
                vGanadasMaqui = vGanadasMaqui + 1;
            }else{
                System.out.println("Hay empate este intento no cuenta");
            }
        }while((vGanadasMaqui <3) && (vGanadasUsu <3));
        
        //valida quien gana el mejor de 3
        if(vGanadasMaqui > vGanadasUsu){
            System.out.println("Jugando al mejor de 3, el ganador del juego fue 'MAQUINA'");
        }else{
            System.out.println("Jugando al mejor de 3, el ganador del juego fue 'USTED'");
        }
        //limpiar buffer
        leer.close();
    }
}
