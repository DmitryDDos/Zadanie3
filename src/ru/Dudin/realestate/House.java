package ru.Dudin.realestate;
public class House {
    private int floors;

    public House(int floors) {
        this.floors = floors;
        if (floors < 0 ){
            System.out.print("Заданный этаж меньше нуля. Конвертация");
            this.floors = -floors;
        }
    }

    public String getDescription() {
        String floorWord;
        if (floors % 10 == 1) {
            floorWord = "этажом";
        } else {
            floorWord = "этажами";
        }
        return "Дом с " + floors + " " + floorWord;
    }
}