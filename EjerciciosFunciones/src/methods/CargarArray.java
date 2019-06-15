package methods;

import java.util.Scanner;

public class CargarArray {
    public static String[] loadedArr(String[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length;i += 1){
            System.out.print("Ingrese elemento: ");
            String elem = sc.next();
            arr[i] = elem;
        }
        return arr;
    }
}
