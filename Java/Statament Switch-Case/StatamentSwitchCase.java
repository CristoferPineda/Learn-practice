public class StatamentSwitchCase {

    public static void main(String[] args){
        // La variable a evaluar. Usaremos un número para representar el día (1=Lunes, 7=Domingo).
        int diaDeLaSemana = 3;

        System.out.println("Día seleccionado: " + diaDeLaSemana);
        System.out.print("Resultado: ");

        // El SWITCH evalúa la variable 'diaDeLaSemana'
        switch (diaDeLaSemana) {

            case 1:
                System.out.println("¡Es Lunes! A empezar la semana.");
                break;

            case 2:
                System.out.println("¡Es Martes! Mitad de camino.");
                break;

            case 3: // Este es el caso que coincide con el valor 3
                System.out.println("¡Es Miércoles! Día clave.");
                break;

            case 4 , 5: //Podemos agrupar casos utilizando una "," cualquiera de los dos case ejecuta el bloque de codigo
                System.out.println("Día laboral.");
                break;

            case 6:
            case 7:// Podemos agrupar casos si queremos el mismo resultado , cualquiera de los dos case ejecuta el bloque de codigo
                System.out.println("¡Es Fin de Semana! A descansar.");
                break;

            default:
                System.out.println("Número de día inválido.");
                break;
        }

        System.out.println("---");
        System.out.println("Fin del programa de días.");


        //Switch case using arrow statatement
        //Se usa de la misma manera , simplemente este no necesita agregar breaks
        String fruta = "Manzana";

        System.out.println("Fruta: " + fruta);
        System.out.print("Sabor: ");

        // Usamos String en el switch, con sintaxis moderna de flecha
        switch (fruta) {
            // Se agrupan Pera y Manzana con coma, y el -> indica el código a ejecutar
            case "Pera", "Manzana" ->
                    System.out.println("Dulce y crujiente.");

            case "Limón", "Naranja" ->
                    System.out.println("Cítrico y ácido.");

            case "Plátano" ->
                    System.out.println("Suave y cremoso.");

            // El default también usa la flecha
            default ->
                    System.out.println("Sabor desconocido.");
        }
    }
}
