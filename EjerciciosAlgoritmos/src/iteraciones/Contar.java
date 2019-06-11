package iteraciones;

import formulas.Formulas;

public class Contar {
    public static void main(String[] args){
        int a = 1;
        while(!(Formulas.esIgual(a,0))){
            System.out.print(a);
            a+=1;
        }
    }
}
