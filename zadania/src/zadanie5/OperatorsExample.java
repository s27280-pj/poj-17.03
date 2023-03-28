package zadanie5;

public class OperatorsExample {
    public static void main(String[] args) {

        // Przykłady operatorów inkrementacji i dekrementacji
        int x = 5;
        System.out.println("Wartość x przed inkrementacją: " + x);

        x++; // operator inkrementacji
        System.out.println("Wartość x po inkrementacji: " + x);

        x--; // operator dekrementacji
        System.out.println("Wartość x po dekrementacji: " + x);

        // Przykłady operatorów arytmetycznych

        int a = 10;
        int b = 3;

        int wynik = a + b; // operator dodawania
        System.out.println("a + b = " + wynik);

        wynik = a - b; // operator odejmowania
        System.out.println("a - b = " + wynik);

        wynik = a * b; // operator mnożenia
        System.out.println("a * b = " + wynik);

        double wynik_dzielenia = (double) a / b; // operator dzielenia
        System.out.println("a / b = " + wynik_dzielenia);

        wynik = a % b; // operator modulo (reszta z dzielenia)
        System.out.println("a % b = " + wynik);

        // Przykłady operatorów relacyjnych
        int c = 7;
        int d = 5;

        boolean czy_rowne = (c == d); // operator równości
        System.out.println("c == d: " + czy_rowne);

        boolean czy_nierowne = (c != d); // operator nierówności
        System.out.println("c != d: " + czy_nierowne);

        boolean czy_wieksze = (c > d); // operator większości
        System.out.println("c > d: " + czy_wieksze);

        boolean czy_mniejsze = (c < d); // operator mniejszości
        System.out.println("c < d: " + czy_mniejsze);

        boolean czy_wieksze_rowne = (c >= d); // operator większy lub równy
        System.out.println("c >= d: " + czy_wieksze_rowne);

        boolean czy_mniejsze_rowne = (c <= d); // operator mniejszy lub równy
        System.out.println("c <= d: " + czy_mniejsze_rowne);
    }
}

