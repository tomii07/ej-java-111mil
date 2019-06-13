package juegos;

import methods.CPU;
import java.util.Scanner;

public class NumberGuess {
    private static boolean guessed(int nro, int numAl){
        Scanner scnr = new Scanner(System.in);
        int intentos = 10;
        while(numAl != nro && intentos > 1){
            if(nro > numAl){
                System.out.println("El numero buscado es menor...");
            } else {
                System.out.println("El numero buscado es mayor...");
            }
            intentos -= 1;
            System.out.print("Le quedan " + intentos + " intentos, pruebe de nuevo: ");
            nro = scnr.nextInt();
        }
        return nro == numAl;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rta;
        int numAl = CPU.numAleatorio();
        System.out.println(
                "Vamos a jugar un juego...\n" +
                "Voy a pensar un numero del 1 al 100 inclusive\n" +
                "Tiene 10 intentos, trate de adivinarlo!\n"
        );
        do {
            System.out.print("Ingrese un numero: ");
            int nro = sc.nextInt();
            if (guessed(nro, numAl)) {
                System.out.println("FELICITACIONES! Número encontrado");
            } else {
                System.out.println("Game over... El numero era " + numAl);
            }
            System.out.print("Desea jugar de nuevo?[S/N]");
            rta = sc.next();
        } while(rta.equals("S") || rta.equals("s"));
    }
}
