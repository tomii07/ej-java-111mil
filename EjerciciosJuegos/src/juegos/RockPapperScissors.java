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
        System.out.println("MARCADOR FINAL: USER[" + i + "] CPU[" + j + "]");
        if(i > j){
            System.out.println("TU ERES EL GANADOR FINAL!");
            System.out.println("CPU PIERDE...");
        } else if(j > i){
            System.out.println("CPU ES EL GANADOR FINAL!");
            System.out.println("TU PIERDES...\n\nlooser :)");
        }
    }
    private static void cpuVsCpu(int partidas){
        int i = 0;
        int j = 0;
        do {
            String cpu1 = CPU.cpu();
            String cpu2 = CPU.cpu();
            System.out.println("MARCADOR: CPU1[" + i + "] CPU2[" + j + "]");
            System.out.println("Eleccion CPU1: " + cpu1);
            System.out.println("Eleccion CPU2: " + cpu2);
            if (Game.tie(cpu1, cpu2)) {
                System.out.println("Empate");
            } else if (Game.game(cpu1, cpu2)) {
                System.out.println("\n" + Game.resultado(cpu1, cpu2) + "\n");
                System.out.println("CPU1 GANA\n");
                i += 1;
            } else if(j > i){
                System.out.println("\n" + Game.resultado(cpu1, cpu2) + "\n");
                System.out.println("CPU2 GANA\n");
                j += 1;
            }
            System.out.println("----------------------------------------------");
            partidas -= 1;
        }while(partidas != 0);
        System.out.println("MARCADOR FINAL: CPU1[" + i + "] CPU2[" + j + "]");
        if(i > j){
            System.out.println("CPU1 ES EL GANADOR FINAL!");
            System.out.println("CPU2 PIERDE...");
        } else{
            System.out.println("CPU2 ES EL GANADOR FINAL!");
            System.out.println("CPU1 PIERDE...");
        }
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
                    System.out.print("Ingrese la cantidad de partidas que van a jugar las maquinas: ");
                    int partidas = sc.nextInt();
                    cpuVsCpu(partidas);
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