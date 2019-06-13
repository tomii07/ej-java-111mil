package juegos;

import methods.CPU;
import methods.Game;
import methods.Usuario;

import java.util.Scanner;

public class RockPapperScissors {
    private static void matches(int k){
        int i = 0;
        int j = 0;
        do {
            System.out.println("\nPartida N°" + k);
            System.out.println("MARCADOR: USER[" + i + "] CPU[" + j + "]");
            String user = Usuario.usuario();
            System.out.println("Tu eleccion: " + user);
            String cpu = CPU.cpu();
            System.out.println("Mi eleccion: " + cpu);
            if (Game.tie(user, cpu)) {
                System.out.println("EMPATE!\n");
            } else if (Game.game(user, cpu)) {
                System.out.println("\n" + Game.resultado(user, cpu) + "\n");
                System.out.println("TU GANAS!\n");
                i += 1;
            } else {
                System.out.println("\n" + Game.resultado(user, cpu) + "\n");
                System.out.println("YO GANO!\n");
                j += 1;
            }
            System.out.println("----------------------------------------------");
            k -= 1;
        }while(k != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rta;
        do {
            System.out.println(
                    "1. Partida Simple\n" +
                            "2. Partida al mejor de... \n" +
                            "3. Partida CPU vs CPU\n" +
                            "0. Salir"
            );
            System.out.print("Opcion: ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("\nPARTIDA SIMPLE!\n");
                    matches(opc);
                    break;
                case 2:
                    System.out.print("Ingrese cantidad de partidas a jugar: ");
                    int nroPartidas = sc.nextInt();
                    matches(nroPartidas);
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de partidas que van a jugar las maquinas: ");
                    int partidas = sc.nextInt();
                    System.out.println("Codigo a desarrollar...");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            System.out.println("Desea jugar de nuevo?[S/N]");
            rta = sc.next();
        }while(rta.equals("S") || rta.equals("s"));
    }
}