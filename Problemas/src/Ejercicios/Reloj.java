package Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reloj {
    public static void main(String[] args) throws InterruptedException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(;;) {
            Date date = new Date();
            System.out.println(formatter.format(date));
            TimeUnit.SECONDS.sleep(1);
        }
    }
}