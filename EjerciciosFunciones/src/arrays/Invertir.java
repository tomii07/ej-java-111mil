package arrays;

import methods.CargarArray;

import java.util.Scanner;

public class Invertir {
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
        System.out.println("\nSu array invertido: ");
        for(int i = arr.length - 1; i >= 0; i -= 1){
            System.out.print("[" + arr[i] + "] ");
        }
    }
}
