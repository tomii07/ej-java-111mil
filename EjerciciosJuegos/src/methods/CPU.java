package methods;

public class CPU {
    public static String cpu(){
        int rand = (int) (Math.random() * 3);
        if(rand == 0){return "piedra";}
        else if(rand == 1){return "papel";}
        else {return "tijera";}
    }
}
