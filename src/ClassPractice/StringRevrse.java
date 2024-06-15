package ClassPractice;

public class StringRevrse {

    public static  String reversestr(String str){
         //str ="";
        String rstr ="";
char ch;
        for (int i=0;i<str.length();i++){
             ch = str.charAt(i);
            rstr = ch + rstr;
            //System.out.println(rstr);
        }
return rstr;
    }
    public static void main(String[] args) {

        String input = "sachin";
        //StringRevrse rs = new StringRevrse();
      String result = reversestr(input);
        System.out.println(result);

    }
}
