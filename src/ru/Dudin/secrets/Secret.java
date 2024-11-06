package ru.Dudin.secrets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Secret {
    private final String text; // Текст секрета
    private final String keeperName; // Имя хранителя секрета
    private final List<String> previousKeepers; // Список предыдущих хранителей

    // Конструктор для создания нового секрета
    public Secret(String keeperName, String text) {
        this.keeperName = keeperName;
        this.text = text;
        this.previousKeepers = new ArrayList<>();
    }

    // Конструктор для передачи секрета другому хранителю
    public Secret(Secret otherSecret, String newKeeperName) {
        this.keeperName = newKeeperName;
        this.text = addRandomCharacters(otherSecret.text);
        this.previousKeepers = new ArrayList<>(otherSecret.previousKeepers);
        previousKeepers.add(otherSecret.keeperName);
        System.out.println(otherSecret.keeperName + " сказал что " + otherSecret.text);
    }

    // Метод для добавления случайных символов к тексту
    private String addRandomCharacters(String originalText) {
        int n = Math.max(0, originalText.length() / 10); // 10% от размера текста
        Random random = new Random();
        StringBuilder modifiedText = new StringBuilder(originalText);

        for (int i = 0; i < n; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Генерация случайного символа
            int randomPosition = random.nextInt(modifiedText.length() + 1);
            modifiedText.insert(randomPosition, randomChar);
        }

        return modifiedText.toString();
    }

    // Метод для получения строкового представления секрета
    @Override
    public String toString() {
        return keeperName + ": это секрет!";
    }

    // Метод для получения имени текущего хранителя
    public String getCurrentKeeper() {
        return keeperName;
    }

    // Метод для получения количества людей, которые узнали секрет
    public int getNumberOfPeopleWhoHeard() {
        return previousKeepers.size();
    }

    // Метод для получения имени N-го человека
    public String getNthKeeper(int n) {
        int index = previousKeepers.size() + n;
        if (index < 0 || index >= previousKeepers.size()) {
            throw new IndexOutOfBoundsException("Нет такого хранителя.");
        }
        return previousKeepers.get(index);
    }

    // Метод для получения разницы в количестве символов текста секрета с N-ым человеком
    public int getDifferenceInTextLength(int n) {
        int index = previousKeepers.size() + n;
        if (index < 0 || index >= previousKeepers.size()) {
            throw new IndexOutOfBoundsException("Нет такого хранителя.");
        }
        return text.length() - previousKeepers.get(index).length();
    }
}
