package practiceclass;

public class ReverseStringSB {
public static String reverseusingsb(String input){

    StringBuffer sb = new StringBuffer(input);
    String rstr =sb.reverse().toString();
//    System.out.println(sb);
    return rstr;

}
    public static void main(String[] args) {
        String ip = "sachin is going to be an Automation test Engineer";
        String reverb =reverseusingsb(ip);
        System.out.println(reverb);
    }
}
