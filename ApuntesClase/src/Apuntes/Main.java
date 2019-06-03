package Apuntes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Ingrese su nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre  = sc.next();
        System.out.println("Hola," + nombre);
        sc.close();

        int a = 0;
        while(a >= 0){
            System.out.println(a);
            a++;
        }

    }
}
