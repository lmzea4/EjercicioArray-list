import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EjercicioNueve {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Arroz");
        palabras.add("Carro");
        palabras.add("Pan");
        palabras.add("Arroz");
        palabras.add("Cereza");
        palabras.add("Carro");
        palabras.add("Pan");
        palabras.add("Arroz");
        palabras.add("Equipo");
        palabras.add("Raton");
        palabras.add("Cereza");

        HashMap<String, Integer> contador =new HashMap<>();

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        // Imprimir el conteo de cada palabra
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {

            System.out.println("La palabra \"" + entry.getKey() + "\" aparece " + entry.getValue() + " veces.");
        }



    }
}
