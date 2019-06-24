package estructura;

public class Persona {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) { // set: establece valor
        this.nombre = nombre;
    }

    public String getNombre() { // get: lee el valor
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
