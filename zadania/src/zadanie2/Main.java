package zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String name = s.nextLine();

        System.out.println("Podaj nazwisko:");
        String lastName = s.nextLine();

        System.out.println("Podaj grupę:");
        int group = s.nextInt();
        s.nextLine();

        System.out.println("Podaj kierunek studiów:");
        String field = s.nextLine();

        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Grupa: " + group);
        System.out.println("Kierunek studiów: " + field);
    }
}
