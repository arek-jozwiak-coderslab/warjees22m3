package pl.coderslab.collection.second;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    private static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals(EXIT_COMMAND)) {
                break;
            } else {
                strings.add(s);
                count++;
            }
        }
        System.out.println("Podanych napisów: ," + count +
                " Rozmiar kolekcji: " + strings.size());
    }
}
