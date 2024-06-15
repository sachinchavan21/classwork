package ClassPractice;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String input = "Hello World";
String result ="";
        for (int i=0;i<input.length();i++){
            char ch =input.charAt(i);
            if (result.indexOf(ch)==-1){
                result = result+ch;

            }

        }
        System.out.println(result);
    }
}
