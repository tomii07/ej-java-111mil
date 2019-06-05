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
        int ax = x;
        int altoy = alto;
        char a = '+';
        char b = '-';
        char c = '|';
        String spaces = " ";

        while(alto != 0){
                if(alto == altoy || alto == 1) {
                    System.out.print(a);
                    while (x != 0) {
                        System.out.print(b);
                        x--;
                    }
                    System.out.print(a);
                } else{
                    System.out.print(c);
                    while(x != 0){
                        System.out.print(spaces);
                        x--;
                    }
                    System.out.print(c);
                }
            x = ax;
            System.out.println(" ");
            alto--;
        }
    }
}
