package BasicJava;

public class Arrays {
    public static void main(String [] args) {
        int [] numbers = new int[10];
        /* Способ инициализировать массив(вручную, такое себе)
        numbers[0] = 1 ;
        numbers[1] = 2 ;
        numbers[2] = 1 ;
        numbers[3] = 1 ;
        numbers[4] = 1 ;
        numbers[5] = 1 ;
        numbers[6] = 1 ;
        numbers[7] = 1 ;
        numbers[8] = 1 ;
        numbers[9] = 1 ;
         */
        for (int i = 0; i<numbers.length; i++) { // Инициализация с помощью цикла
            numbers[i] = i+100;
        }
        for (int i = 0; i<numbers.length; i++) { // вывод на экран
            System.out.println(numbers[i]);
        }

        System.out.println();
        int [] num = {1,3,5,6,7,2,4,6,3,4,6,457,3,3,45};
        for(int i = 0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
