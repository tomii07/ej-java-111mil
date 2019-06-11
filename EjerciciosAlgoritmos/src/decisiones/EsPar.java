package decisiones;

import java.util.Scanner;
import funciones.Formulas;
public class EsPar {
    public static void main(String[] args){
        Scanner nro = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver si es par: ");
        int a = nro.nextInt();

        if(Formulas.esPar(a)){
            System.out.println(a + " es par!");
        } else{
            System.out.println(a + " es impar");
        }
        nro.close();
    }
}
