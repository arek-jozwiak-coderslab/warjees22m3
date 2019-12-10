package pl.coderslab.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    static boolean verifyEmail(String email) {
        String emailRegex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";

        List<String> strings = new ArrayList<>();
        strings.removeIf(s -> s.startsWith("a"));
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

//        return email.matches(emailRegex);
    }

    public static void main(String[] args) {
        String goodEmail = "ee@wp.pl";
        String badEmail = "ee@wppl";
        System.out.println(verifyEmail(goodEmail));
        System.out.println(verifyEmail(badEmail));

    }
}
