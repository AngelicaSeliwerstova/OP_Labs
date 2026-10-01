import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte x = in.nextByte();
        byte a = in.nextByte();
        byte b = in.nextByte();
        byte c = in.nextByte();
        byte d = in.nextByte();

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
