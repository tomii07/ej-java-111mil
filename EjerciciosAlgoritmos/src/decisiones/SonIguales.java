package decisiones;

import java.util.Scanner;
import funciones.Formulas;

public class SonIguales {
    public static void main(String[] args){
        Scanner nro = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = nro.nextInt();

        if(Formulas.esIgual(a,b))
            System.out.println("Son iguales!");
        else
            System.out.println("Son distintos...");
        nro.close();
    }
}
