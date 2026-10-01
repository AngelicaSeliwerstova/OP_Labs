import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();

        if (x < a) {
            System.out.println(1);
        } else if (x < b) {
            System.out.println(2);
        } else if (x < c) {
            System.out.println(3);
        } else if (x < d) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}
