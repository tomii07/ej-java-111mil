package iteraciones;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DEL CUADRADO!");
        System.out.print("Ingrese alto: ");
        int alto = sc.nextInt();
        System.out.print("Ingrese ancho: ");
        int ancho = sc.nextInt();

        int aux = ancho;
        char cuadrado = '#';

        // alto = cantidad de filas
        // ancho = cantidad de # por fila

        if(alto <= 0 || ancho <= 0) {
            System.out.println("Numeros invalidos...");
        }
        else {
            System.out.println("Su cuadrado es de " + alto + "x" + ancho + ": ");
            while (alto != 0) {
                while (ancho != 0) {
                    System.out.print(cuadrado);
                    ancho -= 1;
                }
                ancho = aux;
                alto -= 1;
                System.out.println(" ");
            }
        }
        sc.close();
    }
}
