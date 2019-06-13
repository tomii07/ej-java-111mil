package numeros;

import formulas.Formula;

import java.util.Scanner;

public class NumeroPrimo {
    private static boolean esPrimo(int p){
        int rto = 0;
        int i = p;
        while(i != 0){
            if(Formula.esPrimo(p,i)){
                rto += 1;
                if(rto > 2){
                    return false;
                }
            }
            i -= 1;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Es Primo?");
        System.out.print("Ingrese un numero: ");
        int p = sc.nextInt();

        if(esPrimo(p)){
            System.out.println(p + " es PRIMO!");
        } else{
            System.out.println(p + " no es primo...");
        }

    }
}
