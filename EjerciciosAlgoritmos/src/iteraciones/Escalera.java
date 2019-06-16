package iteraciones;

import formulas.Formulas;

import java.util.Scanner;

public class Escalera {
    private static void stairDraw(int pisos, int i, int j, String spaces, String stair, int aux){
        while(!(Formulas.esMenor(pisos,i))) {
            if(Formulas.sonIguales(pisos-1,aux)){
                System.out.println(" __");
                System.out.print("│");
            } else{
                System.out.print("│");
            }
                if(j == pisos){
                    while(!(Formulas.sonIguales(j,0))) {
                        System.out.print("__");
                        j -= 1;
                    }
                }else {
                    while (!(Formulas.sonIguales(j,0))) {
                        System.out.print(spaces);
                        j -= 1;
                    }
                }
            if (!(Formulas.esMenor(aux,1))) {
                System.out.println(stair + " Piso N° " + aux);
            } else {
                System.out.println("|" + " Planta Baja");
            }
            aux--; // aux= Numero de piso de mayor a menor
            i += 1; // i = Cantidad de filas
            j += i; // j = Cantidad de espacios por fila
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL PROGRAMA ESCALERA!");
        System.out.print("Ingrese la cantidad de pisos que va a tener su escalera: ");
        int pisos = sc.nextInt();
        int i = 1;
        int j = 1;
        int aux = pisos;
        pisos += 1;
        String spaces = "  ";
        String stair = "|_";
        if(Formulas.esMenor(pisos,1))
            System.out.println("Numero ingresado invalido...");
        else
            stairDraw(pisos,i,j,spaces,stair,aux);
        sc.close();
    }
}


