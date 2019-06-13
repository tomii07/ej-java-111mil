package numeros;

import java.util.Scanner;

public class DecimalABinario {
    private static String binaryConver(int dec){
        String bin = "";
        while(dec > 0) {
            if (dec % 2 == 0) {
                bin = "0" + bin;
            } else {
                bin = "1" + bin;
            }
            dec = (int) dec / 2;
        }
        return bin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Conversion de Decimal a Binario");
        System.out.print("Ingrese un numero: ");
        int dec = sc.nextInt();
        if(dec == 0){
            System.out.println(dec +
                    "d ---> " +
                    "0b"
            );
        } else {
            System.out.println(dec +
                    "d ---> "
                    + binaryConver(dec) +
                    "b"
            );
        }
    }
}
