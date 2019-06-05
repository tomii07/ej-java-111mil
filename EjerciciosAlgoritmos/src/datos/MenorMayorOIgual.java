package datos;

import java.util.Scanner;

public class MenorMayorOIgual {
    public static void main(String[] args){
        Scanner nro = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = nro.nextInt();

        if(a > b){
            System.out.println(a + " es mayor que " + b);
        } else if(b > a){
            System.out.println(a + " es menor que " + b);
        } else{
            System.out.println(a + " es igual a " + b);
        }
        nro.close();
    }
}
