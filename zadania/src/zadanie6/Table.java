package zadanie6;

public class Table {
    public static void main(String[] args) {
        int[][] tablica = new int[3][3];

        // Wypełnianie tablicy wartościami
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = i + j;
            }
        }

        // Wyświetlanie tablicy przed zamianą wierszy
        System.out.println("Tablica przed zamianą wierszy:");
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

        // Zamiana wierszy
        int[] temp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = temp;

        // Wyświetlanie tablicy po zamianie wierszy
        System.out.println("Tablica po zamianie wierszy:");
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}

