import java.util.ArrayList;

public class EjercicioDiez {
    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Zorro");
        animales.add("Tigre");
        animales.add("Leon");

        String animalBuscar = "Zorro";

        if (animales.contains(animalBuscar)) {
            System.out.println("El animal \"" + animalBuscar + "\" está en la lista.");
        }else {

            System.out.println("El animal \"" + animalBuscar + "\" no está en la lista.");

        }


    }
}
