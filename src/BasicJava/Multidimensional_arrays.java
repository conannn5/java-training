package BasicJava;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int [] num1= {1,2,3,4,5};  // просто пример одномерного массива

        int[][]num2 = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

    for (int i =0; i<num2.length; i++) {             //вывод на экран двумерного массива
        for(int j= 0; j<num2[i].length;j++) {
            System.out.printf("%4d",num2[num2.length-1-j][i]);  //поворот по часовой на 90
                                                      // %4d вывод каждого числа будет занимать четыре знака (правый край)
        }                                            // %-4d левый край
        System.out.println();
    }
    }
}
