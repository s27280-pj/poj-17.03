package zadanie9;

import java.io.IOException;

public class Game{

    public static void main(String[] args) throws IOException {

        char litera = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Odgadnij ją: ");

        char wybor = (char) System.in.read();

        if (wybor == litera) {
            System.out.println("Dobrze!");
        } else {
            System.out.println("Źle!");
            if (wybor < litera) {
                System.out.println("Trafiłeś zbyt nisko.");
            } else {
                System.out.println("Trafiłeś zbyt wysoko.");
            }
        }
    }
}

