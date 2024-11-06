package ru.Dudin.main;

import java.util.Scanner;
import ru.Dudin.employees.*;
import ru.Dudin.math.*;
import ru.Dudin.realestate.*;
import ru.Dudin.names.*;
import ru.Dudin.secrets.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие для тестирования:");
            System.out.println("1 - Тестирование класса Name");
            System.out.println("2 - Тестирование класса House");
            System.out.println("3 - Тестирование класса Employee и Department");
            System.out.println("4 - Тестирование класса Fraction");
            System.out.println("5 - Тестирование класса Secret");
            System.out.println("6 - Возведение в степень");
            System.out.println("0 - Выход");
            System.out.println(" ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return; // Завершение программы

                    case 1:
                        demonstrateName();
                        System.out.println(" ");
                        break;

                    case 2:
                        demonstrateHouse();
                        System.out.println(" ");
                        break;

                    case 3:
                        demonstrateEmployee();
                        System.out.println(" ");
                        break;

                    case 4:
                        demonstrateFractions();
                        System.out.println(" ");
                        break;

                    case 5:
                        demonstrateSecret();
                        System.out.println(" ");
                        break;

                    case 6:
                        CalculatePower(scanner);
                        break;

                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите действие от 0 до 6.");
                }
            }
            else {
                // Если ввод не является целым числом, выводим сообщение и очищаем ввод
                System.out.println("Пожалуйста, введите целое число.");
                scanner.next(); // Очищаем неверный ввод
            }
        }
    }

    public static void CalculatePower(Scanner scanner) {
        System.out.print("Введите х: ");
        String xStr = scanner.nextLine().replace(",",".");
        System.out.print("Введите y: ");
        String yStr = scanner.nextLine().replace(",",".");
        try{
            double res = power.power1(xStr, yStr);
            System.out.println("Результат: " + res);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка. Введите корректные целые значения.");
        }
        catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void demonstrateName() {
        try {
            Name name1 = new Name("Иван");
            System.out.println(name1); // Вывод: Иван

            Name name2 = new Name("Иван", "Иванов");
            System.out.println(name2); // Вывод: Иван Иванов

            Name name3 = new Name("Иван", "Иванов", "Иванович");
            System.out.println(name3); // Вывод: Иван Иванов Иванович

            // Попытка создать имя с пустой строкой (должно выбросить исключение)
            Name name4 = new Name("", "Петров"); // Исключение
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Вывод: Имя не может быть null или пустой строкой.
        }
    }

    private static void demonstrateHouse() {
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1.getDescription()); // Дом с 1 этажом
        System.out.println(house2.getDescription()); // Дом с 5 этажами
        System.out.println(house3.getDescription()); // Дом с 23 этажами
    }

    private static void demonstrateEmployee() {
        Department itDepartment = new Department("IT", null); // Создаем отдел IT
        Employee petrov = new Employee("Петров", itDepartment);
        Employee kozlov = new Employee("Козлов", itDepartment);
        Employee sidorov = new Employee("Сидоров", itDepartment);

        itDepartment.setHead(kozlov);

        System.out.println(petrov); // Петров работает в отделе IT, начальник которого Козлов
        System.out.println(kozlov); // Козлов начальник отдела IT
        System.out.println(sidorov); // Сидоров работает в отделе IT, начальник которого Козлов
    }

    private static void demonstrateFractions() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction fraction3 = new Fraction(2, 4); // Эквивалентная дробь

        System.out.println("fraction1.equals(fraction2): " + fraction1.equals(fraction2)); // true
        System.out.println("fraction1.equals(fraction3): " + fraction1.equals(fraction3)); // true
        System.out.println("fraction1.equals(new Fraction(1, 3)): " + fraction1.equals(new Fraction(1, 3))); // false
    }

    private static void demonstrateSecret() {
        Secret secret1 = new Secret("Иван", "Это мой секрет.");
        System.out.println(secret1); // Вывод: Иван: это секрет!

        Secret secret2 = new Secret(secret1, "Петр");
        System.out.println(secret2); // Вывод: Петр: это секрет!

        System.out.println("Текущий хранитель: " + secret2.getCurrentKeeper()); // Вывод: Текущий хранитель: Петр
        System.out.println("Количество людей, узнавших секрет: " + secret2.getNumberOfPeopleWhoHeard()); // Вывод: 1
    }
}
