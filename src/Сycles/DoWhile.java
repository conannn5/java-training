package Сycles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args) {
        int value;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 10 чтоб завершить программу");
            value = scanner.nextInt();

        }while (value != 10);
        System.out.println("Вы все сделали правильно");
    }
}
