package Apuntes;

public class SubProcesos {
    //METODOS PISADOS: Metodos con mismo nombre pero distintos argumentos.
    private static boolean esPar(byte c){
        return esPar((int)c);
    }
    public static boolean esPar(int b){
        return b % 2 == 0;
    }
    public static boolean esPar(long a){
        return a % 2 == 0;
    }


}
