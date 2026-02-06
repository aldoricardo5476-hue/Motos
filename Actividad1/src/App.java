public class App {
    class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
    public static void main(String[] args) throws Exception {
        int a = 5;
        double b = 10.5;
        String c = "Hola, Mundo!";
        int[] arr = {1, 2, 3, 4, 5};
        Persona p = new App().new Persona("Aldo", 21);

        System.out.println("Entero: " + a +
        ", Doble: " + b + ", Cadena: " + c+
        ", Arreglo: " + java.util.Arrays.toString(arr) 
        + ", Persona: {Nombre: " + p.nombre + ", Edad: " + p.edad + "}");
    }
}
