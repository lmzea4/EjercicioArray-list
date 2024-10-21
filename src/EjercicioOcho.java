import java.util.ArrayList;
import java.util.Collections;

public class EjercicioOcho {
    public static void main(String[] args) {

        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");

        System.out.println( " Dias de la semana " + dias);

        Collections.reverse(dias);

        System.out.println(" Dias de la semana invertidos " + dias);


    }
}
