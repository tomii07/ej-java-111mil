package decisiones;

import java.util.Scanner;
import formulas.Formulas;
public class Triangulos {
    public static void main(String[] args){
        Scanner nro = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int a = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = nro.nextInt();
        System.out.println("Ingrese un numero: ");
        int c = nro.nextInt();

        if(!(Formulas.esMenor(a,1)) || Formulas.esMenor(b,1) || Formulas.esMenor(c,1))
            System.out.println("Numeros ingresados inválidos...");
        else
            if (Formulas.esIgual(a, b) && Formulas.esIgual(b, c)) {
                System.out.println("Triangulo equilatero.");
            } else if (!(Formulas.esIgual(a, b)) && !(Formulas.esIgual(b, c))) {
                System.out.println("Triangulo escaleno.");
            } else {
                System.out.println("Triangulo isosceles");
            }
        nro.close();
    }
}
