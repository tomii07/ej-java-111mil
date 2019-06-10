package prueba;

//PARA HACER ESTO TIENE QUE SER CLASE PUBLICA SI O SI!!!
//import Apuntes.SubProcesos;

public class Prueba {
    public static void main(String[] args){
        System.out.println(
                // O ES LO MISMO DIRECTAMENTE DECLARARLO ASI:
                // NO CONVIENE POR QUE ES MAS FACIL DIRECTAMENTE IMPORTARLO ARRIBA DE LAS FUNCIONES ASI EL CODIGO ES MAS LEGIBLE.
                Apuntes.SubProcesos.esPar(32)
        );
    }
}
