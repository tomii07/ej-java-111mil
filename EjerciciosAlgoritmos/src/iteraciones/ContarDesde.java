package iteraciones;

import formulas.Formulas;

import java.util.Scanner;

public class ContarDesde {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de partida para contar: ");
        int desde = sc.nextInt();
        while(Formulas.sonIguales(desde,desde)){
            System.out.println(desde);
            desde += 1;
        }
        sc.close();
    }
}
