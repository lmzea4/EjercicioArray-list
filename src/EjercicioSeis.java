import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjercicioSeis {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Bogota");
        ciudades.add("Paris");
        ciudades.add("Lima");
        ciudades.add("Madrid");
        ciudades.add("Cucuta");
        System.out.println(" Lista original de ciudades " + ciudades);

        Collections.shuffle(ciudades);
        System.out.println(" Lista de ciudades modificada " + ciudades);
    }
}
