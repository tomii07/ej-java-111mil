package arrays;

import methods.CargarArray;

import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamañaño de su array: ");
        int tam = sc.nextInt();
        int suma = 0;
        String[] arr = new String[tam];
        int[] newArr = new int[tam];
        arr = CargarArray.loadedArr(arr);
        System.out.println("Su array: ");
        // String array to Int array:
        for(int i = 0; i < arr.length; i += 1){
            newArr[i] = Integer.parseInt(arr[i]);
            System.out.print("[" + newArr[i] + "] ");
        }
        for(int i = 0; i < newArr.length; i += 1){
            suma = suma + newArr[i];
        }
        System.out.println("\nSumatoria:  " + suma);
    }
}
