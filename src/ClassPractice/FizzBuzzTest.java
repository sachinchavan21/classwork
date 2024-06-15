package ClassPractice;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        System.out.println("Enter number to check FizzBuzz Number");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number%3==0 && number%5==0){
            System.out.println(number+" It is a FizzBuzz Number");
        }

        else if (number%3==0){
            System.out.println(number+" It is a Fizz Number");
        }

        else if (number%5==0){
            System.out.println(number+" It is a Buzz Number");
        }
        else {
            System.out.println(number+" It is Normal Number");
        }
    }
}
