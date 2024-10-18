import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numero.add(i);
        }
        Integer[] array = new Integer[numero.size()];
        array = numero.toArray(array);

        System.out.println(" Contenido de la lista de numeros:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}