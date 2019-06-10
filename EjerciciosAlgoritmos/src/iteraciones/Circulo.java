package iteraciones;

import java.util.Scanner;
import funciones.Formulas;
public class Circulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un radio para el circulo: ");
        int r = sc.nextInt();

        int y = -r;
        int x = -r;

        while(y <= r){
            while(x <= r){
                // (x*x) + (y*y) == (r*r) --->  IMPRIME LOS PUNTOS FRONTERA-VERTICES.
                // (x*x) + (y*y) < (r*r)  ---> IMPRIME EL CIRCULO SIN LOS EJES COORDERNADOS.
                // (x*x) + (y*y) <= (r*r) ---> IMPRIME EL CIRCULO CON LOS EJES COORDENADOS.
                if(Formulas.perteneceAlCirculo(x,y,r)){
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
        sc.close();
    }
}