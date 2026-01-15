package BasicJava;

import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введи возраст ");
        int age = scanner.nextInt();

        switch (age) {
            case 1:
                System.out.println("Вы только родились");
                break;
            case 2:
                System.out.println("Вы чуть взрослее стали");
                break;
            case 3:
                System.out.println("Сегодня вам три годика");
                break;
            case 4:
                System.out.println("Четыре, норм число");
                break;
            case 5:
                System.out.println("что нибудь");
                break;
            case 6:
                System.out.println("Шесть лет");
                break;
            case 7:
                System.out.println("Семерочка");
                break;
            case 8:
                System.out.println("А вот уже и восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
                System.out.println("Кто ты такой");
        }

        // Просто эксперимент с тернарным оператором //
        System.out.println("Введите число от 1 до 25");
        int y = scanner.nextInt();
        int x = (y > 10) ? 1 : 25;
        System.out.println(x);


    }
}
