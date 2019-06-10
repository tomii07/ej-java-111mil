package iteraciones;

import java.util.Scanner;

public class BordeDelCuadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DEL BORDE DEL CUADRADO!");
        System.out.print("Ingrese alto: ");
        int y = sc.nextInt();
        System.out.print("Ingrese ancho: ");
        int x = sc.nextInt();

        int alto = y + 2;
        int ancho = x + 2;
        int ax = x;
        int altoy = alto;
        char b = '─';
        char c = '│';
        String spaces = " ";

        System.out.println("El borde del cuadrado va a ser de: " + x + "x" + y);

        if(y < 1 || x < 1){
            System.out.println("Numeros ingresados invalidos...");
        }else {
            while(alto != 0){
                if(alto == altoy) {
                    System.out.print("┌");
                    while (x != 0) {
                        System.out.print(b);
                        x -= 1;
                    }
                    System.out.print("┐");
                } else if(alto == 1){
                    System.out.print("└");
                    while(x != 0){
                        System.out.print(b);
                        x -= 1;
                    }
                    System.out.print("┘");
                } else{
                    System.out.print(c);
                    while(x != 0){
                        System.out.print(spaces);
                        x -= 1;
                    }
                    System.out.print(c);
                }
                x = ax;
                System.out.println(" ");
                alto -= 1;
            }
        }
        sc.close();
    }
}
