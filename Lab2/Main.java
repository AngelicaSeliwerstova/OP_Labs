import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("Размер массива не может быть отрицательным");
        }

        int[] array = new int[n];
        int[] abundant = new int[n];
        int[] other = new int[n];
        int abundantCount = 0;
        int otherCount = 0;

        // Разделяем введённые числа на избыточные и остальные.
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value <= 0) {
                throw new IllegalArgumentException("Элементы массива должны быть натуральными числами");
            }
            array[i] = value;

            if (isAbundant(value)) {
                abundant[abundantCount++] = value;
            } else {
                other[otherCount++] = value;
            }
        }

        // Обе группы сортируем по возрастанию; вторую запишем в обратном порядке.
        Arrays.sort(abundant, 0, abundantCount);
        Arrays.sort(other, 0, otherCount);

        int index = 0;
        for (int i = 0; i < abundantCount; i++) {
            array[index++] = abundant[i];
        }
        for (int i = otherCount - 1; i >= 0; i--) {
            array[index++] = other[i];
        }

        System.out.println("Упорядоченный массив: " + Arrays.toString(array));
        System.out.println("Количество избыточных чисел: " + abundantCount);

        // После перестановки первые abundantCount элементов являются избыточными.
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                words.append(' ');
            }
            words.append(i < abundantCount ? "Избыточных" : "nananan");
        }
        System.out.println("Массив словами: " + words);

        // Заменяем каждый элемент массива количеством его положительных делителей.
        for (int i = 0; i < n; i++) {
            array[i] = countDivisors(array[i]);
        }
        System.out.println("Количество делителей каждого элемента: " + Arrays.toString(array));
    }

    private static boolean isAbundant(int number) {
        if (number == 1) {
            return false;
        }

        // Делители перебираются парами: divisor и number / divisor.
        long sum = 1;
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
                int pairedDivisor = number / divisor;
                if (pairedDivisor != divisor) {
                    sum += pairedDivisor;
                }
            }
        }
        return sum > number;
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int divisor = 1; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                count += divisor == number / divisor ? 1 : 2;
            }
        }
        return count;
    }
}
