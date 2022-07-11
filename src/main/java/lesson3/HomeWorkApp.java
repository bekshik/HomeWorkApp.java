package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {



    public static void main(String[] args) {

       integerArrayOne();
       integerArrayTwo();
       integerArrayThree();
       squareTwoDimensionalIntegerArrayFour();
       lenInitialValueFive();

    }





    private static void integerArrayOne() {
        int [] data = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < data.length; i++) {

            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
        }

        System.out.println(Arrays.toString(data));
    }

    private static void integerArrayTwo() {
        int [] data = new int [100];

        int n = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = n++;
        }

        System.out.println(Arrays.toString(data));
    }
    private static void integerArrayThree() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < data.length; i++) {
           int newdata = data[i];

            if (newdata < 6) {
               data[i] = newdata * 2;

            }
        }
        System.out.println(Arrays.toString(data));
    }



    public static void squareTwoDimensionalIntegerArrayFour() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i == j){
                    array[i][j] = 1;
                }
                System.out.printf("%2d ",array[i][j]);
            }
            System.out.println();
        }

    }


    private static void lenInitialValueFive() {
        int[] newData = getNewData(4, 123);
        System.out.println(Arrays.toString(newData));
    }


    private static int [] getNewData(int len, int initialValue){
        int[] data = new int[len];
        Arrays.fill(data, initialValue);
        return data;
    }
}
