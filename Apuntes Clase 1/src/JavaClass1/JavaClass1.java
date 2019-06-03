package JavaClass1;
import java.util.Scanner;
public class JavaClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hola ");
        String nombre = sc.next();
        System.out.println("Hola, " + nombre);
        sc.close();


    }
}
