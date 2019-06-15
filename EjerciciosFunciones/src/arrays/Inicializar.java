package arrays;

import methods.CargarArray;

import java.util.Scanner;

public class Inicializar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su array: ");
        int tam = sc.nextInt();
        String[] arr = new String[tam];
        arr = CargarArray.loadedArr(arr);
        System.out.println("Su array: ");
        for(int i = 0; i < arr.length; i += 1){
            System.out.print("[" + arr[i] + "] ");
        }
    }
}
