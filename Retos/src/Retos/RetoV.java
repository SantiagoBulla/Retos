package Retos;
import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
       //Declarar variables 
        String mes;
        int dia;
        //Solicta el mes de nacimiento
        System.out.println("ingrese su mes: ");
        //Instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        //capturar el mes del usuario
        mes = leer.nextLine();
        //Solicita el dia de nacimiento
        System.out.println("ingrese su dia");
        //captura el dia de nacimiento
        dia = leer.nextInt();
        //Evalua de acuerdo al mes y el dia que signo zodiacal es.//
        //aries
        if(mes.equalsIgnoreCase("marzo") && (dia >= 21 && dia <=31)){
            System.out.println("Usted es aries y en el 2023 se ganara la loteria");
        }else if(mes.equalsIgnoreCase("abril") && (dia >= 1 && dia <=20)){
            System.out.println("Usted es aries y en el 2023 se ganara la loteria");
        }
        //Tauro
        else if(mes.equalsIgnoreCase("abril") && (dia >= 21 && dia <=30)){
            System.out.println("Usted es tauro y en el 2023 se casara");
        }else if(mes.equalsIgnoreCase("mayo") && (dia >= 1 && dia <=20)){
            System.out.println("Usted es tauro y en el 2023 se casara");
        }
        //Geminis
        else if(mes.equalsIgnoreCase("mayo") && (dia >= 21 && dia <=31)){
            System.out.println("Usted es geminis y en el 2023 tendra gemel@s");
        }else if(mes.equalsIgnoreCase("junio") && (dia >= 1 && dia <=20)){
            System.out.println("Usted es geminis y en el 2023 tendra gemel@s");
        }
        //Cancer
        else if(mes.equalsIgnoreCase("junio") && (dia >= 21 && dia <=30)){
            System.out.println("Usted es cancer y en el 2023 viajara a europa");
        }else if(mes.equalsIgnoreCase("julio") && (dia >= 1 && dia <=22)){
            System.out.println("Usted es cancer y en el 2023 viajara a europa");
        }
        //Leo
        else if(mes.equalsIgnoreCase("agosto") && (dia >= 1 && dia <=23)){
            System.out.println("Usted es leo y en el 2023 llegara la fortuna");
        }else if(mes.equalsIgnoreCase("julio") && (dia >= 23 && dia <=30)){
            System.out.println("Usted es leo y en el 2023 llegara la fortuna");
        }
        //Virgo
        else if(mes.equalsIgnoreCase("agosto") && (dia >= 24 && dia <=31)){
            System.out.println("Usted es virgo y en el 2023 aprendera a hablar japones");
        }else if(mes.equalsIgnoreCase("septiembre") && (dia >= 1 && dia <=22)){
            System.out.println("Usted es virgo y en el 2023 aprendera a hablar japones");
        }
        //Libra
        else if(mes.equalsIgnoreCase("septiembre") && (dia >= 23 && dia <=30)){
            System.out.println("Usted es libra y en el 2023 conocera a su famoso favorito");
        }else if(mes.equalsIgnoreCase("octubre") && (dia >= 1 && dia <=23)){
            System.out.println("Usted es libra y en el 2023 conocera a su famoso favorito");
        }
        //escorpio
        else if(mes.equalsIgnoreCase("octubre") && (dia >= 24 && dia <=31)){
            System.out.println("Usted es escorpio y en el 2023 ira a vivir a otro pais");
        }else if(mes.equalsIgnoreCase("noviembre") && (dia >= 1 && dia <=22)){
            System.out.println("Usted es escorpio y en el 2023 ira a vivir a otro pais");
        }
        //sagitario
        else if(mes.equalsIgnoreCase("noviembre") && (dia >= 23 && dia <=30)){
            System.out.println("Usted es sagitario y en el 2023 tendra la mayor de las sorpresas");
        }else if(mes.equalsIgnoreCase("diciembre") && (dia >= 1 && dia <=21)){
            System.out.println("Usted es sagitario y en el 2023 tendra la mayor de las sorpresas");
        }
        //capricornio
        else if(mes.equalsIgnoreCase("diciembre") && (dia >= 22 && dia <=31)){
            System.out.println("Usted es capricornio y en el 2023 comprara carro deportivo");
        }else if(mes.equalsIgnoreCase("enero") && (dia >= 1 && dia <=20)){
            System.out.println("Usted es capricornio y en el 2023 comprara carro deportivo");
        }
        //piscis
        else if(mes.equalsIgnoreCase("febrero") && (dia >= 20 && dia <=28)){
            System.out.println("Usted es piscis y en el 2023 encontrara el amor de su vida");
        }else if(mes.equalsIgnoreCase("marzo") && (dia <= 20 && dia >=1)){
            System.out.println("Usted es piscis y en el 2023 encontrara el amor de su vida");
        }
        //acuario
        else if(mes.equalsIgnoreCase("febrero") && (dia >= 1 && dia <=19)){
            System.out.println("Usted es acuario y en el 2023 comprara casa/apartamento");
        }else if(mes.equalsIgnoreCase("enero") && (dia >= 21 && dia <=31)){
            System.out.println("Usted es acuario y en el 2023 comprara casa/apartamento");
        }
        //limpiar el buffer
        leer.close();
    }
}
