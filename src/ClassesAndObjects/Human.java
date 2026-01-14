package ClassesAndObjects;

import java.util.ArrayList;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;

    public Human(String name, String surname, int age, int weight, int height) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setWeight(weight, age);
        setHeight(height, age);

    }

    public Human() {
    }

    //////////// позже добавить еще проверок в сеттеры////////////

    void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("'Имя' обязательное поле для заполнения");
        }else if (name.length() < 3) {
            System.out.println("'Имя' должно быть минимум три знака");
        } else if (name.contains(" ")) {
            System.out.println("'имя' не должно содержать пробелов");
        } else {
            this.name = name;
        }
    }

    void setSurname(String surname) {
        if (surname.isEmpty()) {
            System.out.println("'Фамилия' обязательное поле для заполнения");
        }else if (surname.length()<4) {
            System.out.println("'Фамилия' должна состоять из минимум 4 знаков");
        }else if (surname.contains(" ")) {
            System.out.println("'Фамилия' не должна содержать пробелов");
        }else {
            this.surname = surname;
        }
    }

    void setAge(int age) {
        if (age <=0) {
            System.out.println("Ошибка, возраст не должен быть отрицательным или равным нулю");
        }else {
            this.age = age;
        }
    }

    void setWeight(int weight, int age ) {
        if (weight <=0) {
            System.out.println("'Вес' не может равняться или быть меньше нуля");
        }else if (age >= 20 && weight >= 40 ) {
            System.out.println("Для возраста больше 20 лет вес не должен быть таким маленьким"); // сомнительная проверка
        }else {
            this.weight = weight;
        }
    }

    void setHeight(int height, int age) {
        if (height<=0) {
            System.out.println("'Рост' не может быть отрицательным или ровняться нулю");
        }else if (age <=10 && height < 60) {
            System.out.println("В таком возрасте рост не может быть ниже 60см");  // сомнительная проверка
        }else {
            this.height = height;
        }
    }

    String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public ArrayList listOfPersons () {
        ArrayList  persons = new ArrayList<>();
        persons.add(getName());
        persons.add(getSurname());
        persons.add(age);
        persons.add(weight);
        persons.add(height);

        return persons;
    }
}
