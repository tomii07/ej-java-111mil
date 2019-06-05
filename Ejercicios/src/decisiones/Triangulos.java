package decisiones;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args){
        Scanner nro = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int a = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int c = nro.nextInt();

        if(a == b && b == c){
            System.out.println("Triangulo equilatero.");
        } else if(a != b && b != c){
            System.out.println("Triangulo escaleno.");
        } else{
            System.out.println("Triangulo isosceles");
        }
    }
}
