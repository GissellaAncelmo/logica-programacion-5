import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> diccionario = crearDiccionario();


        System.out.println("🎉 ¡Bienvenido al juego de traducción Español-Inglés!");
        System.out.println("👉 Te mostraré 5 palabras en español y tú debes escribir su traducción al inglés.\n");


        List<String> palabrasSeleccionadas = seleccionarPalabrasAzar(diccionario, 5);


        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;


        for (int i = 0; i < palabrasSeleccionadas.size(); i++) {
            String palabraEspanol = palabrasSeleccionadas.get(i); // Ej: "gato"
            String traduccionCorrecta = diccionario.get(palabraEspanol); // Ej: "cat"


            System.out.print("Pregunta " + (i + 1) + ": ¿Cómo se dice '" + palabraEspanol + "' en inglés? ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();


            if (respuestaUsuario.equals(traduccionCorrecta.toLowerCase())) {
                System.out.println("¡Correcto! ✓\n");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta + " ✗\n");
                respuestasIncorrectas++;
            }
        }


        mostrarResultados(respuestasCorrectas, respuestasIncorrectas);

        scanner.close();
    }


    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregamos palabras al diccionario
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("libro", "book");
        diccionario.put("escuela", "school");
        diccionario.put("familia", "family");
        diccionario.put("amigo", "friend");
        diccionario.put("tiempo", "time");
        diccionario.put("dinero", "money");
        diccionario.put("trabajo", "work");
        diccionario.put("coche", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("música", "music");
        diccionario.put("película", "movie");
        diccionario.put("compu", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");

        return diccionario;
    }

    // r palabras al azar
    public static List<String> seleccionarPalabrasAzar(HashMap<String, String> diccionario, int cantidad) {
        List<String> todasLasPalabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(todasLasPalabras);

        return todasLasPalabras.subList(0, cantidad);
    }


    public static void mostrarResultados(int correctas, int incorrectas) {
        System.out.println("=== RESULTADOS FINALES ===");
        System.out.println("✅ Correctas: " + correctas);
        System.out.println("❌ Incorrectas: " + incorrectas);
        System.out.println("📋 Total de preguntas: " + (correctas + incorrectas));

    }


    }
}