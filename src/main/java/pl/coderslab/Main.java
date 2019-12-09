package pl.coderslab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        List<Integer> integers = new ArrayList<>();

        for (Integer integer : integers) {

        }

        Iterator<Integer> iterator = integers.iterator();
        integers.listIterator(12);

        List someList = new ArrayList();
        someList.add("asda");
        someList.add(123);
        someList.add(new Main());


//        integers.
        strings.add("asdasd");
        int size = strings.size();
        System.out.println(size);

    }

}
