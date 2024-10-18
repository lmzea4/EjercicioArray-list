import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // bucle for para imprimir cada número
        System.out.println(" Bucle for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // bucle for-each para imprimir los mismos números
        System.out.println(" Bucle for-each:");
        for (int number : numbers) {
            System.out.println(number);
        }


        // bucle while para imprimir los números en orden inverso
        System.out.println(" Bucle while (orden inverso):");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }

    }
}
