package practiceclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checkemailregex {

    public static void main(String[] args) {
        String email = "sachin@example.com";

        String emailregex ="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailregex);
        Matcher mat = pat.matcher(email);

        if (mat.matches()){
            System.out.println("valid mail");
        }
        else {
            System.out.println("Invalid mail");
        }
    }
}
