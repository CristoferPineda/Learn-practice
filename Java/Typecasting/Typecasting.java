public class Typecasting {
    public static void main (String[] args){
        //Typecast it's the proces to convert one type of data on anotherone (Data Int)
        /**Flujo de datos (integer) menor a mayor
         * byte -> short -> chart -> int -> long -> float -> double
         */

        //Implicit Typecasting or Widening casting (Ampliacion)
        //Convierte tipo de datos con tamano mas pequeno a uno mas "grande"
        int numerador = 1;
        int denominador = 3;

        // Wideing Casting para obtener el resultado decimal , se convierte de int a double
        double resultadoDouble = (double) numerador / denominador;
                           //(NuevoTipoDato) Variable o datos a convertir
        System.out.println("Resultado de la división (Widening): " + resultadoDouble);//Retun 0.33333...

        //Explicit Typecasting/Narrowing casting (Estrechamiento)
        //Convierte tipos de datos con un tamano mas grande a uno mas "pequeno"
        double valorDecimal = 0.3333333333333333;

        // Narrowing Casting para forzar un int
        int resultadoInt = (int) valorDecimal;
        //TipoDatoDestino NomVarDestino = (TipoDatoDestino)VarOrigen
        System.out.println("Resultado del casting (Narrowing): " + resultadoInt);//Return 0
    }
}
