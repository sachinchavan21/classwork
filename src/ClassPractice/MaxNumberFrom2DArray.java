package ClassPractice;

import java.util.Arrays;

public class MaxNumberFrom2DArray {

    public static void main(String[] args) {
        int [][] arr ={

                {12, 64,8},
                {34,78,98},
                {43,63,11}
        };

        int max =arr [0][0];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){

                if (arr[i][j]>max){
                    max = arr[i][j];



                }

                if (arr[i][j]==8){
                    System.out.println("This array contains given value that is 8");
                }
            }
        }

        System.out.println("Max Value from array is "+max);


    }
}
