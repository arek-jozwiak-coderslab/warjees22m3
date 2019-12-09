package pl.coderslab;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Warszawa", 2000000);
        newMap.put("Sikórz", 300);
        newMap.put("Płock", 20000);

        Set<String> strings = newMap.keySet();
        for (String string : strings) {
            System.out.print("key: ");
            System.out.print(string);
            System.out.print(" value: ");
            System.out.println(newMap.get(string));
        }
    }
}
