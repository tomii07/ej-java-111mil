package numeros;

import methods.Formula;
import java.util.Scanner;

public class CelciusFahrenheitConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Programa de conversion Celcius-Fahrenheits:\n" +
                "1. Conversion Celcius a Fahrenhetis\n" +
                "2. Conversion Fahrenheits a Celcius\n" +
                "0. Salir"
        );
        System.out.print("Opcion: ");
        int opc = sc.nextInt();

        switch(opc){
            case 1:
                System.out.print("C°: ");
                int c = sc.nextInt();
                System.out.print("F°: " + Formula.conver_CaF(c));
                break;
            case 2:
                System.out.print("F°: ");
                int f = sc.nextInt();
                System.out.print("C°: " + Formula.Conver_FaC(f));
                break;
            case 0:
                System.out.print("Saliendo del programa...");
                break;
        }
    }
}
