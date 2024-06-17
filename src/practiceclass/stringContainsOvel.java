package practiceclass;

public class stringContainsOvel {


    public static void main(String[] args) {
        String str = "Sachin";
String str1 = str.toLowerCase();
        char [] arr = str1.toCharArray();
        for (int i=0;i<str.length();i++){
            if (arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u'){
                System.out.println("String contains Vowel which is: "+arr[i]);
                break;}
//            }else {
//                System.out.println("String contains Consanant which is: "+arr[i]);
//            }
        }


    }}

