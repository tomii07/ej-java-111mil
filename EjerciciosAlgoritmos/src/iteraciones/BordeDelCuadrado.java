package iteraciones;

import java.util.Scanner;
import formulas.Formulas;

public class BordeDelCuadrado {
    private static void edgeDraw(int alto, int altoy, int x, char b, char c, String spaces, int ax){
        while(!(Formulas.sonIguales(alto,0))){
            if(Formulas.sonIguales(alto,altoy)) {
                System.out.print("┌");
                while (!(Formulas.sonIguales(x,0))) {
                    System.out.print(b);
                    x -= 1;
                }
                System.out.print("┐");
            } else if((Formulas.sonIguales(alto,1))){
                System.out.print("└");
                while(!(Formulas.sonIguales(x,0))){
                    System.out.print(b);
                    x -= 1;
                }
                System.out.print("┘");
            } else{
                System.out.print(c);
                while(!(Formulas.sonIguales(x,0))){
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

        if(Formulas.esMenor(x,1) || Formulas.esMenor(y,1))
            System.out.println("Numeros ingresados invalidos...");
        else
            System.out.println("El borde del cuadrado va a ser de: " + x + "x" + y);
            edgeDraw(alto,altoy,x,b,c,spaces,ax);
        sc.close();
    }
}
