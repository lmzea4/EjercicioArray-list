import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        ArrayList<String> commonElements = new ArrayList<>();
        for (String repetido : list1) {
            if (list2.contains(repetido)) {
                commonElements.add(repetido);

            }
        }
        System.out.println(" Lista de elementos comunes: " + commonElements);
    }
}

