package methods;

public class Game {
    public static boolean game(String user, String cpu){
        return (user.equals("piedra") && cpu.equals("tijera")) || (user.equals("tijera") && cpu.equals("papel")) || (user.equals("papel") && cpu.equals("piedra"));
    }
    public static boolean tie(String user, String cpu){
        return user.equals(cpu);
    }
    public static String resultado(String user, String cpu){
        if((user.equals("piedra") && cpu.equals("tijera")) || (cpu.equals("piedra") && user.equals("tijera"))){
            return "PIEDRA APLASTA TIJERA";
        } else if((user.equals("tijera") && cpu.equals("papel")) || (cpu.equals("tijera") && user.equals("papel"))){
            return "TIJERA CORTA PAPEL";
        } else{
            return "PAPEL ENVUELVE PIEDRA";
        }
    }
}
