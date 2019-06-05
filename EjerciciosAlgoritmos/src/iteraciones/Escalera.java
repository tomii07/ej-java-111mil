package iteraciones;

import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL PROGRAMA ESCALERA!");
        System.out.print("Ingrese la cantidad de pisos que va a tener su escalera: ");
        int pisos = sc.nextInt();
        int i = 1;
        int j = 1;
        int aux = pisos;
        pisos += 1;
        String spaces = " ";
        String stair = "\\";

        if(pisos < 1) {
            System.out.println("Numero ingresado invalido...");
        }
        else{
            while(pisos >= i) {
                while (j != 0) {
                    System.out.print(spaces + "");
                    j--;
                }
                if (aux > 0) {
                    System.out.println(stair + " Piso N° " + aux);
                } else {
                    System.out.println(stair + " Planta Baja");
                }
                aux--; // aux= Numero de piso de mayor a menor
                i++; // i = Cantidad de filas
                j += i; // j = Cantidad de espacios por fila
            }
        }
    }
}


