package ClassPractice;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        System.out.println("Enter year to check whether it is leap or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean leapyear = false;
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            leapyear=true;
        }
        if (leapyear){
            System.out.println("This is leap year "+year);
        }
        else {System.out.println("It is not leap year "+year);
    }}

}
