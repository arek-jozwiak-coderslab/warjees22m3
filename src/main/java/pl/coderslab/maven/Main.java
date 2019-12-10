package pl.coderslab.maven;

import org.apache.commons.lang3.StringUtils;

public class Main {


    public static void main(String[] args) {
        String asd = StringUtils.reverse("a s d");
        System.out.println(StringUtils.deleteWhitespace(asd));
    }
}
