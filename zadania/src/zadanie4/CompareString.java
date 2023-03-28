package zadanie4;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Podaj piewsze zdanie/słowo: ");
        String str1 = s.nextLine();

        System.out.println("Podaj drugie zdanie/słowo: ");
        String str2 = s.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
