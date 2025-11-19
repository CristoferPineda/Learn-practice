public class ConditionalIf {

    public static void main (String[] args){
        // If es un condicional que sirve para ejecutar un bloque de codigo solo si este es verdedaro
        int temperaturaActual = 28;
        int limiteParaAC = 25;

        System.out.println("Temperatura actual: " + temperaturaActual + "°C");

        // El condicional IF: verifica si la temperatura es MAYOR al límite
        //Comparacion , si la conparacion resulta False no imprime nada de este bloque
        if (temperaturaActual > limiteParaAC) {
            // Este bloque se ejecuta porque 28 es mayor que 25 (TRUE)
            System.out.println("¡Alerta! La temperatura excede el límite.");
            System.out.println("Encendiendo el aire acondicionado.");
        }

        System.out.println("---");
        System.out.println("Fin del programa de monitoreo.");
    }
}
