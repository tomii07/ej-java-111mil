package prueba;

import estructura.Persona;

public class EjercicioObjeto {
    public static void main(String[] args) {
        Persona tomas = new Persona();
        tomas.setNombre("Tomás");
        tomas.setEdad(19);
        Persona raquel = new Persona();
        raquel.setNombre("Raquel");
        raquel.setEdad(19);
        Persona matias = new Persona();
        matias.setNombre("Matias");
        matias.setEdad(21);

        String nom1 = tomas.getNombre();
        String nom2 = raquel.getNombre();
        int edad1 = tomas.getEdad();
        int edad2 = raquel.getEdad();

        // Ejercicio 1: Cargar los datos de 2 personas y imprimir cual es mas grande.
        System.out.println("Datos Persona N°1: ");
        System.out.println("Nombre: " + nom1);
        System.out.println("Edad: " + edad1);

        System.out.println("Datos Persona N°2: ");
        System.out.println("Nombre: " + nom2);
        System.out.println("Edad: " + edad2);

        if (edad1 > edad2) {
            System.out.println(nom1 + " es mas grande!");
        } else if(edad2 > edad1) {
            System.out.println(nom2 + " es mas grande!");
        } else {
            System.out.println("Tienen la misma edad!");
        }

        System.out.println("\n");
        //------------------------------------//
        System.out.println("\n");

        // Ejercicios 2: Imprimir de un array de personas la mas grande de edad.
        Persona[] personas = new Persona[3];
        Persona max;
        personas[0] = tomas;
        personas[1] = raquel;
        personas[2] = matias;

        max = tomas;

        for(int i = 0; i < 3; i += 1){
            if (personas[i].getEdad() > max.getEdad()){
                max = personas[i];
            }
        }
        System.out.println(max.getNombre() + " es el mas grande con " + max.getEdad() + " anios.");
    }
}
