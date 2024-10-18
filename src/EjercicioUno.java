import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {
        String nombre = "Apple";
        String nombre1 = "Banana";
        String nombre2 ="Cherry";
        List<String> listFruits = new ArrayList<>();
        listFruits.add(nombre);
        listFruits.add(nombre1);
        listFruits.add(nombre2);

        System.out.println(listFruits);
        System.out.println(listFruits.size());
        listFruits.remove(1);
        System.out.println(listFruits);
        listFruits.add(2,"Orange");
        System.out.println(listFruits);
    }



}
