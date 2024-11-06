package ru.Dudin.math;

public class power {
    public static double power1(String xStr, String yStr){
        double x = Double.parseDouble(xStr); // Преобразуем строку х в число
        double y = Double.parseDouble(yStr); // Преобразуем строку y в число
        return Math.pow(x,y);
    }
}
