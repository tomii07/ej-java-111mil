package funciones;

public class Formulas {
    public static boolean perteneceAlCirculo(int x, int y, int t){
        return Math.pow(x,2) + Math.pow(y,2) <= Math.pow(t,2);
    }
}
