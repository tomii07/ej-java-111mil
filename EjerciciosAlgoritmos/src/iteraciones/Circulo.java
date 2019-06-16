package iteraciones;

import java.util.Scanner;
import formulas.Formulas;
public class Circulo {
    private static void circleDraw(int x, int y, int r){
        while (y <= r) {
            while (x <= r) {

                if (Formulas.perteneceAlCirculo(x, y, r)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                x += 1;
            }
            System.out.println(" ");
            y += 1;
            x = -r;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un radio para el circulo: ");
        int r = sc.nextInt();

        int y = -r;
        int x = -r;

        if(Formulas.esMenor(r,1))
            System.out.println("Numeros Ingresados inválidos...");
        else
            circleDraw(x,y,r);
        sc.close();
    }
}