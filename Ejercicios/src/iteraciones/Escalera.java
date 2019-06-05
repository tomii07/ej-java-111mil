package iteraciones;

import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL PROGRAMA ESCALERA!");
        System.out.println("Ingrese la cantidad de pisos que va a tener su escalera: ");
        int pisos = sc.nextInt();
        int i = 1;
        int j = 1;
        int aux = pisos;
        pisos += 1;
        String spaces = " ";
        String stair = "\\";

        while(pisos >= i){
                while(j != 0){
                    System.out.print(spaces + "");
                    j--;
                }
                if(aux > 0) {
                    System.out.println(stair + " Piso N° " + aux);
                } else{
                    System.out.println(stair + " Planta Baja");
                }
            aux--;
            i++;
            j += i;
        }
    }
}


