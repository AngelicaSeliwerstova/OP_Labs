import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);

        // Считываем точку X и точки A, B, C, D
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // Определяем номер участка
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
