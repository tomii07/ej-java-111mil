package funciones;

public class Formulas {
    public static boolean perteneceAlCirculo(int x, int y, int t){
        return Math.pow(x,2) + Math.pow(y,2) <= Math.pow(t,2);
    }
    public static boolean esPar(int a){
        return a % 2 == 0;
    }
    public static boolean esIgual(int a, int b){
        return (b == a);
    }
    public static boolean esMenor(int a, int b){
        return a < b;
    }
    public static boolean esMayor(int a, int b){
        return a > b;
    }
}
