package BasicJava;

public class Break_Continue {
    public static void main(String [] args) {
        int i = 0;
        while (true) {
            if (i == 40) {
                break;
            }
            i++;
        }
        System.out.println("Вы вышли из цикла на " + i);


        for (int x = 0; x <= 100; x++) {
            if(x%3 ==0) {
                System.out.println("Деление без остатка на три " + x);
            }

        }
    }
}
