package methods;

import java.util.Scanner;

public class Usuario {
    public static String usuario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu eleccion?" + "[piedra ; papel ; tijera]: ");
        String eleccion = sc.next();
        System.out.print("\n");
        return eleccion;
    }
}
