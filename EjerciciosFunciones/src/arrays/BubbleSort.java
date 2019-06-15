package arrays;

import methods.CargarArray;
import java.util.Scanner;

public class BubbleSort {
    private static int[] bubblesort(int[] arr){
        int aux = 0;
       for(int i = 0; i < arr.length - 1; i += 1){
           for(int j = 1; j < arr.length - i; j += 1){
               if(arr[j - 1] > arr[j]){
                    aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
               }
           }
       }
       return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamañaño de su array: ");
        int tam = sc.nextInt();
        String[] arr = new String[tam];
        int[] newArr = new int[tam];
        arr = CargarArray.loadedArr(arr);
        System.out.println("Su array: ");
        // String array to Int array:
        for(int i = 0; i < arr.length; i += 1){
            newArr[i] = Integer.parseInt(arr[i]);
            System.out.print("[" + newArr[i] + "] ");
        }
        System.out.println("\nSu array ordenado: ");
        for(int i = 0; i < newArr.length; i += 1) {
            System.out.print("[" + bubblesort(newArr)[i] + "] ");
        }
    }
}
