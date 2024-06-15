package ClassPractice;

public class SBReversestr {

    public static String sbrev(String input){
        String rstr ="";

        StringBuilder sb = new StringBuilder(input);
        rstr= sb.reverse().toString();
        return rstr;
    }

    public static void main(String[] args) {
        String input1 ="I would love to play";
       String reverse = sbrev(input1);
        System.out.println(reverse);
    }
}
