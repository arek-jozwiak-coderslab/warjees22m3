package pl.coderslab.regex;

public class Main2 {

    static boolean verifyPassword(String password){

        String s1 = "[_a-zA-Z0-9-]{10,15}";

        if(!password.matches(s1)){
            return false;
        }

        return true;
    }
}
