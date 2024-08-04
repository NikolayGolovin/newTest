import java.util.function.*;

public class Calculator {
    // Статическая переменная типа Supplier для получения экземпляра Calculator
    static Supplier<Calculator> instance = Calculator::new;

    // Операции над двумя числами
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Обработка исключения для деления на ноль
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return x / y;
    };

    // Операции над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Определение, является ли число положительным
    Predicate<Integer> isPositive = x -> x > 0;

    // Вывод числа в консоль
    Consumer<Integer> println = System.out::println;
}