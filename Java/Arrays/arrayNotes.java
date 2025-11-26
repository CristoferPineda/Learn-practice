public class arrayNotes {

    public static void main(String[] args){
        // --- FORMA 1: Inicialización Explícita (Por Pasos) ---

        // Declaración y Creación: Se especifica el tipo y el tamaño (4 elementos)
        // La memoria se asigna, y los valores iniciales son 0.
        int[] edadesEstudiantes = new int[4];

        System.out.println("--- Array Explícito (edadesEstudiantes) ---");

        //Asignación de valores elemento por elemento usando el índice
        edadesEstudiantes[0] = 18; // El primer estudiante
        edadesEstudiantes[1] = 20; // El segundo estudiante
        edadesEstudiantes[2] = 19; // El tercer estudiante
        edadesEstudiantes[3] = 21; // El cuarto estudiante

        // Acceder a un elemento y mostrarlo
        System.out.println("La edad del primer estudiante es: " + edadesEstudiantes[0]); // Output: 18

        // Mostrar el tamaño (length)
        System.out.println("Tamaño del array edadesEstudiantes: " + edadesEstudiantes.length); // Output: 4

        System.out.println("------------------------------------------");

        // --- FORMA 2: Forma implicita o Inicialización Concisa (Literal)

        // Declaración y Creación/Inicialización:
        // Java infiere el tipo (String) y el tamaño (3) contando los elementos.
        String[] diasDeSemana = {"Lunes", "Martes", "Miércoles"};

        //

        System.out.println("--- Array Conciso (diasDeSemana) ---");

        // Acceder a un elemento y mostrarlo
        System.out.println("El tercer día de la semana (índice 2) es: " + diasDeSemana[2]); // Output: Miércoles

        // Mostrar el tamaño (length)
        System.out.println("Tamaño del array diasDeSemana: " + diasDeSemana.length); // Output: 3

        System.out.println("------------------------------------------");

        // Ejemplo de uso de bucle for-each para el array conciso
        System.out.println("Recorriendo los días con un bucle for-each:");
        for (String dia : diasDeSemana) {
            System.out.println("Día: " + dia);
        }
    }
}

