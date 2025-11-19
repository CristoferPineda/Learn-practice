public class ConditionalIfElse {

    public static void main(String[] args){

        //The if-else function is "flow control structure"
        int temperaturaActual = 20;
        int limiteParaAC = 25;

        System.out.println("Temperatura actual: " + temperaturaActual + "°C");

        // El condicional IF-ELSE:
        // 1. Verifica si la temperatura es MAYOR al límite (20 > 25)
        if (temperaturaActual > limiteParaAC) {
            // Este bloque se ejecuta SI la condición es VERDADERA.
            System.out.println("¡Alerta! La temperatura excede el límite.");
            System.out.println("Encendiendo el aire acondicionado.");

        } else {
            // Este bloque se ejecuta SI la condición es FALSA.
            System.out.println("La temperatura está dentro del rango seguro.");
            System.out.println("El aire acondicionado permanece apagado.");
        }

        System.out.println("---");
        System.out.println("Fin del programa de monitoreo.");
    }
}
