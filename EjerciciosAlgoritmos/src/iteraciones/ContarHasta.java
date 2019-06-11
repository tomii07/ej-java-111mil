package iteraciones;

import funciones.Formulas;

import java.util.Scanner;

public class ContarHasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comienzo = 1;
        System.out.println("Ingrese un numero hasta donde contar: ");
        int hasta = sc.nextInt();
        while (Formulas.esMenor(comienzo,hasta) || Formulas.esIgual(comienzo,hasta)) {
            System.out.println(comienzo);
            comienzo++;
        }
        sc.close();
    }
}