package ClassesAndObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Human human = new Human();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите необходимые данные или '-' чтобы выйти");
            String input = scanner.nextLine();
            if (input.equals("-")) {
                return false;
            }
        }

        Human human = new Human ("Павел","Опра",23,80,180);
        Human human1 = new Musician ("Павел","Опра",23,80,180, "Плотник");
        System.out.println(human.getString());
        System.out.println(human1.getString());


    }
}
