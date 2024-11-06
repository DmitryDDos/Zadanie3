# Zadanie3
// Вырезанное из Main
 // Создание имен
                    /*
                    Name name1 = new Name(null, "Клеопатра", null);
                    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                    Name name3 = new Name("Маяковский", "Владимир", null);

                    System.out.println(name1);
                    System.out.println(name2);
                    System.out.println(name3);
                    break;
                    */
                    
                    /*
                    Name cleopatra = new Name("Клеопатра");
                    Name pushkin = new Name("Александр", "Пушкин", "Сергеевич");
                    Name mayakovsky = new Name("Владимир", "Маяковский");
                    Name christopher = new Name("Христофор", "Бонифатьевич");

                    // Выводим имена
                    System.out.println(cleopatra); // Клеопатра
                    System.out.println(pushkin); // Александр Пушкин Сергеевич
                    System.out.println(mayakovsky); // Владимир Маяковский
                    System.out.println(christopher); // Христофор Бонифатьевич }
                    break;
                    */

/*
                    Fraction f1 = new Fraction(1, 3);
                    Fraction f2 = new Fraction(2, 3);
                    Fraction f3 = new Fraction(1, 4);
                    Fraction f4 = new Fraction(5, 1);

                    Fraction sumResult = f1.sum(f2); // 1/3 + 2/3 = 1/1
                    Fraction minusResult = f1.minus(f3); // 1/3 - 1/4 = 1/12
                    Fraction multiplyResult = f1.multiply(f2); // 1/3 * 2/3 = 2/9
                    Fraction divideResult = f1.divide(f2); // 1/3 / 2/3 = 1/2

                    // Вывод результатов
                    System.out.println(f1 + " + " + f2 + " = " + sumResult);
                    System.out.println(f1 + " - " + f3 + " = " + minusResult);
                    System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
                    System.out.println(f1 + " / " + f2 + " = " + divideResult);

                    // Выполнение задачи
                    f1.sum(f2).divide(f3).minus1(5);
                    Fraction taskResult = f1.sum(f2).divide(f3).minus1(5);
                    System.out.println("Результат f1.sum(f2).div(f3).minus(5) = " + taskResult);
                    break;
                     */

/*
                    // Создаем дроби
                    Fraction f1 = new Fraction(1, 3);
                    Fraction f2 = new Fraction(2, 3);
                    Fraction f3 = new Fraction(1, 4);
                    Fraction f4 = new Fraction(5, 1);
                    Fraction f5 = new Fraction(-1, 2); // Отрицательная дробь
                    Fraction f6 = new Fraction(3, -4); // Знаменатель отрицательный

                    // Вычисляем результаты
                    Fraction sumResult = f1.sum(f2); // 1/3 + 2/3 = 1/1
                    Fraction minusResult = f1.minus(f3); // 1/3 - 1/4 = 1/12
                    Fraction multiplyResult = f1.multiply(f2); // 1/3 * 2/3 = 2/9
                    Fraction divideResult = f1.divide(f2); // 1/3 / 2/3 = 1/2

                    // Вывод результатов
                    System.out.println(f1 + " + " + f2 + " = " + sumResult);
                    System.out.println(f1 + " - " + f3 + " = " + minusResult);
                    System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
                    System.out.println(f1 + " / " + f2 + " = " + divideResult);

                    // Выполнение задачи
                    Fraction taskResult = f1.sum(f2).divide(f3).minus(5);
                    System.out.println("Результат f1.sum(f2).divide(f3).minus(5) = " + taskResult);

                    // Проверка работы с отрицательными дробями
                    System.out.println("Отрицательная дробь: " + f5); // -1/2
                    System.out.println("Дробь с отрицательным знаменателем: " + f6); // 3/4
                    break;
                    */

/*
                    // Создаем дробь 1/2
                    Fraction fraction1 = new Fraction(1, 2);
                    System.out.println("Первая дробь: " + fraction1); // Вывод: 1/2

                    // Создаем дробь 3/4
                    Fraction fraction2 = new Fraction(3, 4);
                    System.out.println("Вторая дробь: " + fraction2); // Вывод: 3/4

                    // Складываем дроби
                    Fraction sum = fraction1.add(fraction2);
                    System.out.println("Сумма: " + sum); // Вывод: 10/8 (или 5/4 после упрощения)

                    // Изменяем числитель и знаменатель первой дроби
                    fraction1.setNumerator(2);
                    fraction1.setDenominator(3);
                    System.out.println("Измененная первая дробь: " + fraction1); // Вывод: 2/3

                    // Умножаем измененную дробь на вторую
                    Fraction product = fraction1.multiply(fraction2);
                    System.out.println("Произведение: " + product); // Вывод: 6/12 (или 1/2 после упрощения)
                    break;
                    */

/*
                    // Создаем дробь 1/2
                    Fraction fraction1 = new Fraction(1, 2);
                    System.out.println("Первая дробь: " + fraction1); // Вывод: 1/2

                    // Создаем дробь 3/4
                    Fraction fraction2 = new Fraction(3, 4);
                    System.out.println("Вторая дробь: " + fraction2); // Вывод: 3/4

                    // Складываем дроби
                    Fraction sum = fraction1.add(fraction2);
                    System.out.println("Сумма: " + sum); // Вывод: 10/8 (или 5/4 после упрощения)

                    // Изменяем числитель и знаменатель первой дроби
                    fraction1.setNumerator(2);
                    fraction1.setDenominator(3);
                    System.out.println("Измененная первая дробь: " + fraction1); // Вывод: 2/3

                    // Умножаем измененную дробь на вторую
                    Fraction product = fraction1.multiply(fraction2);
                    System.out.println("Произведение: " + product); // Вывод: 6/12 (или 1/2 после упрощения)

                    // Используем методы класса Number
                    System.out.println("Целочисленное значение дроби 1/3: " + fraction1.intValue()); // Вывод: 0
                    System.out.println("Двойное значение дроби 1/3: " + fraction1.doubleValue()); // Вывод: 0.666...
                    break;
                    */

// Вырезанное из Fraction
/*
public class Fraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
        throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
    }
        this.numerator = numerator;
        this.denominator = denominator;
    simplify(); // Упрощение дроби при создании
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {// Обеспечиваем, чтобы знаменатель был положительным
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для вычисления НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод сложения
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод вычитания
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод умножения
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
    }

    // Метод деления
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для сложения дроби и целого числа
    public Fraction sum1(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    // Метод для вычитания дроби и целого числа
    public Fraction minus1(int integer) {
        return this.minus(new Fraction(integer, 1));
    }

    // Метод для умножения дроби на целое число
    public Fraction multiply1(int integer) {
        return new Fraction(this.numerator * integer, this.denominator);
    }

    // Метод для деления дроби на целое число
    public Fraction divide1(int integer) {
        if (integer == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        return new Fraction(this.numerator, this.denominator * integer);
    }
}

 */

/*
public class Fraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) { // Если знаменатель отрицательный, меняем знак
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Упрощение дроби при создании
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    // Метод для вычисления НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод сложения
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод вычитания
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод умножения
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод деления
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для сложения дроби и целого числа
    public Fraction sum(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    // Метод для вычитания дроби и целого числа
    public Fraction minus(int integer) {
        return this.minus(new Fraction(integer, 1));
    }

    // Метод для умножения дроби на целое число
    public Fraction multiply(int integer) {
        return new Fraction(this.numerator * integer, this.denominator);
    }

    // Метод для деления дроби на целое число
    public Fraction divide(int integer) {
        if (integer == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        return new Fraction(this.numerator, this.denominator * integer);
    }
}
 */

/*
public class Fraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор для создания дроби
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Упрощаем дробь при создании
    }

    // Метод для упрощения дроби
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { // Обеспечиваем положительный знаменатель
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для вычисления НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Метод для получения числителя
    public int getNumerator() {
        return numerator;
    }

    // Метод для получения знаменателя
    public int getDenominator() {
        return denominator;
    }

    // Метод для изменения числителя
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce(); // Упрощаем дробь после изменения
    }

    // Метод для изменения знаменателя
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.denominator = denominator;
        reduce(); // Упрощаем дробь после изменения
    }

    // Метод для сложения дробей
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для вычитания дробей
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для умножения дробей
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для деления дробей
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
*/

/*
public class Fraction extends Number {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор для создания дроби
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Упрощаем дробь при создании
    }

    // Метод для упрощения дроби
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) { // Обеспечиваем положительный знаменатель
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Метод для вычисления НОД
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Методы для получения числителя и знаменателя
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Метод для изменения числителя
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce(); // Упрощаем дробь после изменения
    }

    // Метод для изменения знаменателя
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.denominator = denominator;
        reduce(); // Упрощаем дробь после изменения
    }

    // Методы арифметических операций
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Переопределяем методы класса Number
    @Override
    public int intValue() {
        return numerator / denominator; // Целочисленное значение дроби
    }

    @Override
    public long longValue() {
        return (long) intValue(); // Долгое целое значение
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator; // Вещественное значение
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator; // Двойное вещественное значение
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
*/

// Вырезанное из Name
/*
public class Name { // 1 версия кода
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(middleName);
        }
        return sb.toString();
    }
}
*/

/*
public class Name { // 2 версия кода
    private String firstName; // Личное имя
    private String lastName; // Фамилия
    private String patronymic; // Отчество

    // Конструктор для создания имени с личным именем
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Конструктор для создания имени с личным именем и фамилией
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Конструктор для создания полного имени
    public Name(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder fullName = new StringBuilder(firstName);
        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(" ").append(lastName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(" ").append(patronymic);
        }
        return fullName.toString();
    }
}

 */


// Вырезанный сам класс Main (рабочий)
package ru.Dudin.main;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Выберите действие от 0 до 6: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next(); // Очистка ввода
            }
            int d = scanner.nextInt();
            if (d < 0 || d > 6) {
                System.out.println("Введено неверное значение!");
                continue;
            }
            switch (d) {
                case 0: // Остановка программы
                    System.out.println("Программа остановлена.");
                    return;

                case 1:

                    try {
                        Name name1 = new Name("Иван"); // Личное имя
                        System.out.println(name1); // Вывод: Иван

                        Name name2 = new Name("Иван", "Иванов"); // Личное имя и фамилия
                        System.out.println(name2); // Вывод: Иван Иванов

                        Name name3 = new Name("Иван", "Иванов", "Иванович"); // Полное имя
                        System.out.println(name3); // Вывод: Иван Иванов Иванович

                        // Попытка создать имя с пустой строкой (должно выбросить исключение)
                        Name name4 = new Name("", "Петров"); // Исключение
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage()); // Вывод: Имя не может быть null или пустой строкой.
                    }

                    try {
                        // Попытка создать имя с null значением (должно выбросить исключение)
                        Name name5 = new Name(null, "Сидоров"); // Исключение
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage()); // Вывод: Имя не может быть null или пустой строкой.
                    }
                    break;

                case 2:
                    // Создание домов
                    House house1 = new House(1);
                    House house2 = new House(5);
                    House house3 = new House(23);

                    System.out.println(house1.getDescription());
                    System.out.println(house2.getDescription());
                    System.out.println(house3.getDescription());
                    break;

                case 3:
                    Department itDepartment = new Department("IT", null); //Создаем отдел IT (сначала создаем отдел без начальника)
                    // Создаем сотрудников
                    Employee petrov = new Employee("Петров", itDepartment);
                    Employee kozlov = new Employee("Козлов", itDepartment);
                    Employee sidorov = new Employee("Сидоров", itDepartment);

                    // Назначаем Козлова начальником IT отдела
                    itDepartment.setHead(kozlov);

                    System.out.println(petrov); // Петров работает в отделе IT, начальник которого Козлов
                    System.out.println(kozlov); // Козлов начальник отдела IT
                    System.out.println(sidorov); // Сидоров работает в отделе IT, начальник которого Козлов

                    // Получаем список всех сотрудников отдела, имея ссылку на одного из них
                    List<Employee> colleagues = petrov.getColleagues();
                    System.out.println("Сотрудники отдела " + itDepartment.getName() + ":");
                    for (Employee colleague : colleagues) {
                        System.out.println(colleague.getName());
                    }
                    break;

                case 4:
                    Fraction fraction1 = new Fraction(1, 2);
                    Fraction fraction2 = new Fraction(1, 2);
                    Fraction fraction3 = new Fraction(2, 4); // Эквивалентная дробь

                    System.out.println("fraction1.equals(fraction2): " + fraction1.equals(fraction2)); // true
                    System.out.println("fraction1.equals(fraction3): " + fraction1.equals(fraction3)); // true
                    System.out.println("fraction1.equals(new Fraction(1, 3)): " + fraction1.equals(new Fraction(1, 3))); // false
                    break;

                case 5:
                    // Создаем первый секрет
                    Secret secret1 = new Secret("Иван", "Это мой секрет.");
                    System.out.println(secret1); // Вывод: Иван: это секрет!

                    // Передаем секрет другому хранителю
                    Secret secret2 = new Secret(secret1, "Петр");
                    System.out.println(secret2); // Вывод: Петр: это секрет!

                    // Проверяем текущего хранителя
                    System.out.println("Текущий хранитель: " + secret2.getCurrentKeeper()); // Вывод: Текущий хранитель: Петр

                    // Проверяем количество людей, которые узнали секрет
                    System.out.println("Количество людей, узнавших секрет: " + secret2.getNumberOfPeopleWhoHeard()); // Вывод: 1

                    // Получаем имя предыдущего хранителя
                    System.out.println("Предыдущий хранитель: " + secret2.getNthKeeper(-1)); // Вывод: Предыдущий хранитель: Иван

                    // Получаем разницу в длине текста секрета с предыдущим хранителем
                    System.out.println("Разница в длине текста: " + secret2.getDifferenceInTextLength(-1)); // Вывод: Разница в длине текста: X (где X - разница)
                    break;

                case 6:
                    // Выполняем сложения
                    double result1 = sum(2, new SumFraction(3, 5), 2.3);
                    System.out.println("2 + 3/5 + 2.3 = " + result1); // Вывод: 4.3

                    double result2 = sum(3.6, new SumFraction(49, 12), 3, new SumFraction(3, 2));
                    System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2); // Вывод: 10.6

                    double result3 = sum(new SumFraction(1, 3), 1);
                    System.out.println("1/3 + 1 = " + result3); // Вывод: 1.333...
                    break;
            }
        }
    }

    public static double sum(Number... values) { // метод sum к case 6
        double total = 0.0;
        for (Number value : values) {
            total += value.doubleValue(); // Преобразуем каждое значение в double и добавляем к сумме
        }
        return total;
    }
}
