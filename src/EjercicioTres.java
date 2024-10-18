import java.util.ArrayList;

public class EjercicioTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                evenNumbers.add(numero);
            }
        }

        System.out.println("Lista numeros: " + numeros);
        System.out.println(" Lista números pares: " + evenNumbers);

    }
}
