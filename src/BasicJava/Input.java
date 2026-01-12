package BasicJava;

import java.lang.annotation.AnnotationFormatError;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое:");
        String task1 = scanner.nextLine();
        System.out.print("Введите делитель: ");
        String task2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(task1); // запомни и не забывай
            int num2 = Integer.parseInt(task2); // запомни и не забывай
            System.out.print("Ваш ответ: "+ num1/num2);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.print("Делить на ноль нельзя");
        } catch (NumberFormatException e) {
            System.out.println("Попробуй еще раз");
        }

    }
}
