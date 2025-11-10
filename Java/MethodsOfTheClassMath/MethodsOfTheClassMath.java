public class MethodsOfTheClassMath {
    /**
     * La clase Math proporciona métodos para realizar funciones matemáticas básicas
     * como exponenciales, logaritmos, raíces cuadradas y funciones trigonométricas.
     * Es una clase estática, por lo que se llama directamente: Math.metodo().
     */
    public static void main(String[] args) {
        // 1. Constantes
        System.out.println("\n[1. Constantes]");
        System.out.println("PI: " + Math.PI); // Arroja directamente el valor de pi 3.14159...
        System.out.println("E: " + Math.E);  // Arroja directamente el valor de euler 2.71828...

        // 2. Métodos Básicos
        System.out.println("\n[2. Métodos Básicos]");
        // abs: valor absoluto (módulo)
        int modulo = Math.abs(-4);// es como |-4| en algebra , all positiv
        System.out.println("Math.abs(-4): " + modulo); // Salida: 4

        // Comparar tamano de los numeros
        int maximo = Math.max(3, 4); //Compara los numeros y retorna el mayor
        int minimo = Math.min(1, 2); //Compara los numeros y returna el mayor
        System.out.println("Math.max(3, 4): " + maximo); // Salida: 4
        System.out.println("Math.min(1, 2): " + minimo); // Salida: 1

        // 3. Funciones Trigonométricas (Aceptan radianes)
        System.out.println("\n[3. Funciones Trigonométricas]");
        // toRadians y toDegrees: conversión
        double grados = 1.0;
        double radianesDeUnGrado = Math.toRadians(grados);
        System.out.println(grados + " grados a radianes: " + radianesDeUnGrado);
        System.out.println("Math.toDegrees(1) radian: " + Math.toDegrees(1)); // 57.29...

        // sin, cos, tan: seno, coseno, tangente
        System.out.println("Math.sin(0): " + Math.sin(0)); // Salida: 0.0
        System.out.println("Math.cos(0): " + Math.cos(0)); // Salida: 1.0
        System.out.println("Math.tan(0): " + Math.tan(0)); // Salida: 0.0

        // 4. Métodos para Potencias y Raíces
        System.out.println("\n[4. Potencias y Raíces]");
        // exp: e elevado a x
        System.out.println("Math.exp(1) (e^1): " + Math.exp(1)); // Salida: Math.E

        // log: logaritmo natural (base e)
        System.out.println("Math.log(Math.E): " + Math.log(Math.E)); // Salida: 1.0

        // log10: logaritmo base 10
        System.out.println("Math.log10(100): " + Math.log10(100)); // Salida: 2.0

        // sqrt: raíz cuadrada
        System.out.println("Math.sqrt(16): " + Math.sqrt(16)); // Salida: 4.0

        // cbrt: raíz cúbica
        System.out.println("Math.cbrt(-8): " + Math.cbrt(-8)); // Salida: -2.0

        // pow: base elevado a exponente
        double potencia = Math.pow(2, 4); // 2 elevado a 4
        System.out.println("Math.pow(2, 4): " + potencia); // Salida: 16.0

        // 5. Métodos de Redondeo
        System.out.println("\n[5. Métodos de Redondeo]");
        // ceil: redondeo hacia arriba (devuelve double)
        double techo = Math.ceil(3.3);
        System.out.println("Math.ceil(3.3): " + techo); // Salida: 4.0

        // floor: redondeo hacia abajo (devuelve double)
        double piso = Math.floor(5.7);
        System.out.println("Math.floor(5.7): " + piso); // Salida: 5.0

        // round: redondeo estándar (devuelve long o int)
        //hacia arriba si es >=0.5 , hacia abajo si es <=0.4
        long redondeo1 = Math.round(5.8);//Redondeo hacia arriba
        long redondeo2 = Math.round(5.2);//redondeo hacia abajo
        System.out.println("Math.round(5.8): " + redondeo1); // Salida: 6
        System.out.println("Math.round(5.2): " + redondeo2); // Salida: 5

        // 6. Valores Aleatorios
        System.out.println("\n[6. Valores Aleatorios]");
        // random: devuelve un double en el rango [0.0, 1.0)
        double aleatorio = Math.random();
        System.out.println("Math.random(): " + aleatorio); // Salida: un valor entre 0 y 1

        // Ejemplo práctico: obtener un número aleatorio entre 1 y 10 (incluidos)
        int numAleatorio = (int) (Math.random() * 10) + 1;//Importante sumar 1 al maximo de numero qe quieres que genere aleatorio
        System.out.println("Número aleatorio entre 1 y 10: " + numAleatorio);
    }


    }

