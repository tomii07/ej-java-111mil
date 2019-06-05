package iteraciones;

import java.util.Scanner;

public class ContarConPaso {
    public static void main(String[] args){
        Scanner paso = new Scanner(System.in);

        int comienzo = 1;

        System.out.println("Ingrese un numero para contar con paso: ");
        int nro = paso.nextInt();

        while(nro != 0){
            System.out.println(comienzo);
            comienzo = comienzo + nro;
        }
        paso.close();
    }
}
