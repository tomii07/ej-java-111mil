package iteraciones;

import formulas.Formulas;

import java.util.Scanner;

public class ContarConPaso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int paso = 1;
        System.out.println("Ingrese un numero para contar con paso: ");
        int nro = sc.nextInt();

        while(!(Formulas.esIgual(nro,0))){
            System.out.println(paso);
            paso += nro;
        }
        sc.close();
    }
}