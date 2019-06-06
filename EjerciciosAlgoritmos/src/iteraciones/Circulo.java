package iteraciones;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un radio para el circulo: ");
        int r = sc.nextInt();

        int y = r;
        int x = -r;

        while(y >= -r){
            while(x <= r){
                if((x*x) + (y*y) <= r*r ){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                x++;
            }
            System.out.println(" ");
            y--;
            x = -r;
        }
        sc.close();
    }
}
