package arrays;

import methods.CargarArray;

import java.util.Scanner;

public class Buscar {
    private static String valEncontrado(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un elemento a buscar en su array: ");
        String nroABuscar = sc.next();
        for(int i = 0; i < arr.length; i += 1){
            if(arr[i].equals(nroABuscar)){
                return Integer.toString(i);
            }
        }
        return "-1";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamañaño de su array: ");
        int tam = sc.nextInt();
        String[] arr = new String[tam];
        arr = CargarArray.loadedArr(arr);
        String encontrado = valEncontrado(arr);
        if(encontrado.equals("-1")){
            System.out.println("El valor buscado no esta en su array...");
        } else {
            System.out.println("El valor buscado está en su array en la posicion: " + encontrado);
        }
    }
}
