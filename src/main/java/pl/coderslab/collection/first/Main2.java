package pl.coderslab.collection.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 2000; i++) {
            integers.add(i);
        }

        for (int i = 0; i < integers.size(); i++) {

            integers.remove(i);

        }


        removeDivider(integers, 3);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static void removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }

    }

}
