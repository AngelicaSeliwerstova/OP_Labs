import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();

        byte result;

        if (x < a) {
            result = 1;
        } else if (x < b) {
            result = 2;
        } else if (x < c) {
            result = 3;
        } else if (x < d) {
            result = 4;
        } else {
            result = 5;
        }

        System.out.println(result);
    }
}
