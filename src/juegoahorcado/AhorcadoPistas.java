package juegoahorcado;

public class AhorcadoPistas {
    public void jugar() {
        boolean seguirJugando = true;
        Scanner scanner = new Scanner(System.in);

        String[] palabras = {
                "Polimorfismo", "java", "clase", "constructor", "programacion",
                "algoritmo", "desarrollo", "sistema", "variable", "metodos",
                "compilador", "depuracion", "consola", "arrays", "interfaz",
                "servidor", "cliente", "base", "datos", "listas",
                "estructuras", "git", "comando", "optimizacion", "geekipedia"
        };

        String[] pistas = {
                "Es un principio de OOP", "Lenguaje de programación", "Parte de una clase", "Especial de un método",
                "Actividad de escribir código", "Conjunto de instrucciones", "Proceso de creación de software",
                "Conjunto de componentes", "Elemento de almacenamiento de datos", "Funciones de una clase",
                "Traduce código fuente a binario", "Proceso de eliminación de errores", "Interfaz de texto", "Colección de elementos",
                "Contrato en OOP", "Computadora que proporciona servicios", "Computadora que recibe servicios",
                "Almacenamiento organizado de datos", "Unidades de información", "Colección de elementos en orden",
                "Formas de organización de datos", "Sistema de control de versiones", "Instrucción para el sistema",
                "Proceso de hacer más eficiente", "Sitio de tecnología"
        };

        Random random = new Random();

        while (seguirJugando) {
            // Variables o Atributos reiniciados
            int intentosMaximos = 5;
            int intentoActual = 0;
            boolean palabraAdivinada = false;
            boolean pistaSolicitada = false;

            int indicePalabra = random.nextInt(palabras.length);
            String palabraSecreta = palabras[indicePalabra];
            String pista = pistas[indicePalabra];
            char[] letrasAdivinadas = new char[palabraSecreta.length()];

            // Pintar los guiones bajos
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                letrasAdivinadas[i] = '_';
            }

            // Determinar si ya se adivinó o se exceden intentos máximos
            while (!palabraAdivinada && intentoActual < intentosMaximos) {
                System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
                System.out.println("Introduce una letra o escribe 'hint' para una pista:");

                String entrada = scanner.next().toLowerCase();

                if (entrada.equals("hint") && !pistaSolicitada) {
                    System.out.println("Pista: " + pista);
                    pistaSolicitada = true;
                    continue;
                } else if (entrada.equals("hint")) {
                    System.out.println("Ya has solicitado la pista.");
                    continue;
                } else if (entrada.length() != 1) {
                    System.out.println("Por favor, introduce una sola letra.");
                    continue;
                }

                char letra = entrada.charAt(0);

                boolean letraCorrecta = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (!letraCorrecta) {
                    intentoActual++;
                    System.out.println("Letra incorrecta! Te quedan: " + (intentosMaximos - intentoActual) + " intentos.");
                }

                if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    palabraAdivinada = true;
                    System.out.println("¡Felicidades, has ganado! La palabra era: " + palabraSecreta);
                }
            }

            if (!palabraAdivinada) {
                System.out.println("Ya no te quedan intentos. Game Over. La palabra era: " + palabraSecreta);
            }

            // Preguntar si desea jugar de nuevo
            System.out.println("\n¿Quieres jugar de nuevo? (si/no)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("no")) {
                seguirJugando = false;
            }
        }

        scanner.close();
        System.out.println("Gracias por jugar!");
    }
}
