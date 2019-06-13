package Ejercicios;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PROMEDIO DE NOTAS.");
        System.out.print("Ingrese la cantidad de notas a promediar: ");
        int cantNotas = sc.nextInt();
        double suma = 0;
        int i = cantNotas;
        while (i != 0) {
            System.out.print("Ingrese nota: ");
            double nota = sc.nextDouble();
            suma = nota + suma;
            i -= 1;
        }
        double total = suma / cantNotas;
        System.out.println("Promedio: " + total);
    }
}
