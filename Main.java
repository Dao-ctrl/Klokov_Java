
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1. Сравнение и арифметические операции
        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        scanner.nextLine();

        // Задача 2. Сравнение строк
        System.out.print("Введите строку a: ");
        String stringA = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String stringB = scanner.nextLine();

        if (stringA.equals(stringB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Задача 3. Вывод чётных чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}