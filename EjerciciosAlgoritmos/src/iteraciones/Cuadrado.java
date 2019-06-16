package iteraciones;

import formulas.Formulas;
import java.util.Scanner;

public class Cuadrado {
    private static void sqreDraw(int alto, int ancho, String cuadrado, int aux) {
        System.out.println("Su cuadrado es de " + alto + "x" + ancho + ": ");
        while (!(Formulas.sonIguales(alto, 0))) {
            while (!(Formulas.sonIguales(ancho, 0))) {
                System.out.print(cuadrado);
                ancho -= 1;
            }
            ancho = aux;
            alto -= 1;
            System.out.println(" ");
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DEL CUADRADO!");
        System.out.print("Ingrese alto: ");
        int alto = sc.nextInt();
        System.out.print("Ingrese ancho: ");
        int ancho = sc.nextInt();
        int aux = ancho;
        String cuadrado = "##";
            // alto = cantidad de filas
            // ancho = cantidad de # por fila

        if (Formulas.esMenor(alto, 1) || Formulas.esMenor(ancho, 1))
            System.out.println("Numeros invalidos...");
        else
            sqreDraw(alto, ancho, cuadrado, aux);
        sc.close();
    }
}
