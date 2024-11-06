package ru.Dudin.math;
/*
public class Fraction extends Number {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) intValue();
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Fraction that = (Fraction) obj; // Приведение типа
        return this.numerator == that.numerator && this.denominator == that.denominator; // Сравнение числителей и знаменателей
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(numerator);
        result = 31 * result + Integer.hashCode(denominator);
        return result;
    }
}
*/
public class Fraction implements Cloneable {
    private int numerator; // Числитель
    private int denominator; // Знаменатель

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Геттеры
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Переопределение метода clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Вызываем метод clone() родительского класса
        return super.clone();
    }

    // Метод для отображения дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Пример использования
    public static void main(String[] args) {
        try {
            Fraction original = new Fraction(3, 4);
            Fraction cloned = (Fraction) original.clone();

            System.out.println("Оригинальная дробь: " + original);
            System.out.println("Клонированная дробь: " + cloned);

            // Проверка, что это разные объекты
            System.out.println("Это разные объекты? " + (original != cloned));
            // Проверка, что значения полей одинаковые
            System.out.println("Значения полей одинаковые? " + (original.getNumerator() == cloned.getNumerator() && original.getDenominator() == cloned.getDenominator()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
