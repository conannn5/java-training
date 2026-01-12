package BasicJava;

public class If {
    public static void main(String [] args) {
        // Условный оператор if //
        int myInt = 10;
        if (myInt == 2) {
            System.out.println("твое значение два");
        }else if (myInt == 4) {
            System.out.println("Твое значение четыре");
        }else if (myInt == 6) {
            System.out.println("Твое значение шесть");
        }else if (myInt == 8) {
            System.out.println("Твое значение восемь");
        } else if (myInt ==10) {
            System.out.println("Твое значение десять");
        }else {
            System.out.println("А ты точно то что нужно вводишь???");
        }
    }
}
