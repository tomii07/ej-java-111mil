package datos;

import java.util.Scanner;

public class DeMenorAMayor {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int i = 0,aux = 0;
        System.out.println("Ingrese un numero: ");
        int a = x.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = x.nextInt();
        System.out.println("Ingrese un numero: ");
        int c = x.nextInt();

        while(b < a || c < b) {
            if (b < a) {
                aux = b;
                b = a;
                a = aux;
            }
            if (c < b) {
                aux = c;
                c = b;
                b = aux;
            }
        }
        System.out.println("De menor a mayor: " + a + " " + b + " " + c);
        x.close();
    }
}

