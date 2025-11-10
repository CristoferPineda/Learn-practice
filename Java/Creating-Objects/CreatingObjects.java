
// Clase externa principal. El nombre del archivo debe coincidir con esta clase.
public class CreatingObjects {

    // Clase anidada 'WeekDay'. La hacemos 'static' porque no depende de una instancia de 'CreatingObjects'.
    // Esta clase define la plantilla y las características (campos/atributos) de nuestros objetos.
    public static class WeekDay {
        // Atributos (características) del objeto
        int number;   // Número de día de la semana
        String name;  // Nombre de día de la semana

        // CONSTRUCTOR: Es un método especial que se llama al usar 'new'.
        // Su propósito es inicializar los atributos del nuevo objeto.
        public WeekDay(int number, String name) {
            this.number = number; // Asigna el valor pasado al atributo 'number' del objeto
            this.name = name;     // Asigna el valor pasado al atributo 'name' del objeto
        }
    }

    // El método 'main' es el punto de inicio de la ejecución del programa.
    public static void main(String[] args) {
        // Dentro de nuestra clase main, creamos e instanciamos los objetos:

        // Sintaxis correcta para instanciar y usar el CONSTRUCTOR:
        // NombreClase NombreVariable = new NombreClase(ArgumentosDelConstructor);

        // Objeto 1: Usamos el constructor para inicializar 'day1' con (1, "Monday")
        WeekDay day1 = new WeekDay(1, "Monday");

        //Impresion en consola
        System.out.println("Día de la semana: " + day1.name);
        System.out.println("Número de día: " + day1.number);

        // Objeto 2: Usamos el constructor para inicializar 'day2' con (2, "Tuesday")
        WeekDay day2 = new WeekDay(2, "Tuesday");

        System.out.println("\nDía de la semana: " + day2.name);
        System.out.println("Número de día: " + day2.number);
    }
}

