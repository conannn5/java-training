package Сycles;

public  class WhileLoops {
    public static void main(String [] args) {
        int value = 0;

        // Цикл выполняется до тех пор, пока, условие в () истинно (true)
        while (value < 20) {
            System.out.println("Hello "+value);
            value = value+1;
        }
    }
}
