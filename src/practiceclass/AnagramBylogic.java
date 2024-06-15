package practiceclass;

import java.util.Arrays;

public class AnagramBylogic {
    public static void main(String[] args) {
        String ip1 ="silent";
        String ip2 = "lisften";
        boolean validanagram = isanagram(ip1,ip2);
        if (validanagram){
            System.out.println("These words are anagram");
        }
        else {
            System.out.println("these are not anagram words");
        }
    }
    public static boolean isanagram(String str, String str2){
//str="";
//str2="";

        if (str.length()!=str2.length())
        {
            return false;
        }
        char [] ana1 = str.toCharArray();
        Arrays.sort(ana1);
        char [] ana2 = str2.toCharArray();
        Arrays.sort(ana2);

        for (int i=0;i<str.length();i++){
                if (ana1[i]!=ana2[i]){
                    return false;

                }
            }




  return true;
    }


}
