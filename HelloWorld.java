import java.util.Scanner;

/**
 * @file HelloWorld.java
 * @brief Программа, которая выводит "Hello World" и перемножает два введённых числа.
 *
 * Этот файл содержит класс HelloWorld с функцией main, которая выводит "Hello World",
 * запрашивает у пользователя ввод двух чисел, перемножает их и выводит результат.
 */

/**
 * @brief Основной класс программы HelloWorld.
 *
 * Этот класс содержит единственный метод main, который выполняет основную
 * логику программы: выводит сообщение, запрашивает ввод чисел, выполняет
 * вычисления и выводит результат.
 */
public class HelloWorld {

    /**
     * @brief Главная функция программы.
     *
     * Эта функция выполняет следующие шаги:
     * - Выводит сообщение "Hello World" на консоль.
     * - Создаёт объект Scanner для считывания ввода пользователя.
     * - Запрашивает у пользователя ввод первого числа.
     * - Запрашивает у пользователя ввод второго числа.
     * - Перемножает введённые числа.
     * - Выводит результат умножения на консоль.
     * - Закрывает объект Scanner.
     *
     * @param args Массив строк, содержащий аргументы командной строки.
     */
    public static void main(String[] args) {
        // Выводим "Hello World"
        System.out.println("Hello World");

        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод первого числа
        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        // Запрашиваем у пользователя ввод второго числа
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        // Перемножаем два числа
        double result = firstNumber * secondNumber;

        // Выводим результат
        System.out.println("Результат умножения: " + result);

        // Закрываем сканер
        scanner.close();
    }
}
