package iteraciones;

import java.util.Scanner;

public class ContarDesde {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de partida para contar: ");
        int desde = sc.nextInt();
        while(desde == desde){
            System.out.println(desde);
            desde++;
        }
    }
}
