package zadanie8;

public class TableOfTruth {

    public static void main(String[] args) {

        boolean[] values = { true, false };

        System.out.printf("%-6s%-6s%-6s%-6s%-6s\n", "p", "q", "and", "or", "xor");

        for (boolean p : values) {
            for (boolean q : values) {
                System.out.printf("%-6s%-6s", p, q);
                System.out.printf("%-6s%-6s%-6s\n", p && q, p || q, p ^ q);
            }
            System.out.println();
        }

        System.out.println("\nnot(p)");

        for (boolean p : values) {
            System.out.printf("%-6s%-6s\n", p, !p);
        }
    }
}
