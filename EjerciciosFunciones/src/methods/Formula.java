package methods;

public class Formula {
    public static int conver_CaF(int c){
        return (c * 9 / 5) + 32;
    }
    public static int Conver_FaC(int f){
        return (f - 32) * 5/9;
    }
    public static boolean esBisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0);
    }
    public static boolean esPrimo(int p,int i){
        return p % i == 0;
    }
}
