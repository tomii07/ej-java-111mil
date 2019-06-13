package numeros;

import formulas.Formula;
import java.util.Scanner;

public class AnioBiciesto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Es Bisiesto?");
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if(Formula.esBisiesto(anio)){
            System.out.println(anio + " es BISIESTO!!");
        } else {
            System.out.println(anio + " no es bisiesto...");
        }
    }
}
