package zadanie10;

public class Powers {

    public static void main(String[] args) {

        for (int i = 0; i <= 14; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
