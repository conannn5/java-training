package BasicJava;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] words = {"Привет","как дела?","что делаешь?","когда домой?","как живешь?","устал?","нет","да"};
        for (String string: words) {
            System.out.println(string);
        }
    int[] numbers = {1,34,45,65,76,55};
        int sum = 0;
        for (int x:numbers) {
            sum= sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
