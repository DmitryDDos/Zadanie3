package ru.Dudin.names;
public class Name {
    private final String firstName; // Личное имя
    private final String lastName; // Фамилия
    private final String patronymic; // Отчество

    // Конструктор для создания имени с личным именем
    public Name(String firstName) {
        validateName(firstName);
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }

    // Конструктор для создания имени с личным именем и фамилией
    public Name(String firstName, String lastName) {
        validateName(firstName);
        validateName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = null;
    }

    // Конструктор для создания полного имени
    public Name(String firstName, String lastName, String patronymic) {
        validateName(firstName);
        validateName(lastName);
        validateName(patronymic);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    // Метод для проверки имени
    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или пустой строкой.");
        }
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