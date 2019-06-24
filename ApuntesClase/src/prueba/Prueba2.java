package prueba;

import estructura.Persona;

public class Prueba2 {
    public static void main(String[] args) {
        // POJO : Plain Old Java Object

        Persona pepe = new Persona();

        pepe.setNombre("pepe");
        pepe.setEdad(19);

        System.out.println(pepe.getNombre());
    }
}
