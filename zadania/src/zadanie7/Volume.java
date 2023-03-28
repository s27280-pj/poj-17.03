package zadanie7;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double r, h, V;
        final double PI = 3.14159265359;

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj promień podstawy walca: ");
        r = input.nextDouble();
        System.out.print("Podaj wysokość walca: ");
        h = input.nextDouble();

        V = PI * r * r * h;

        System.out.println("Objętość walca o promieniu " + r + " i wysokości " + h + " wynosi " + V);
    }
}
