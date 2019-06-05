package iteraciones;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DEL CUADRADO!");
        System.out.print("Ingrese alto: ");
        int y = sc.nextInt();
        System.out.print("Ingrese ancho: ");
        int x = sc.nextInt();

        int aux = x;
        char cuadrado = '#';

        // y = cantidad de filas
        // x = cantidad de # por fila

        if(y <= 0 || x <= 0) {
            System.out.println("Numeros invalidos...");
        }
        else {
            System.out.println("Su cuadrado es de " + y + "x" + x + ": ");
            while (y != 0) {
                while (x != 0) {
                    System.out.print(cuadrado);
                    x--;
                }
                x = aux;
                y--;
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
