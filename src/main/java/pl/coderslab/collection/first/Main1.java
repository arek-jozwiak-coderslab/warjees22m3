package pl.coderslab.collection.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        //1
        List<Integer> elements = new ArrayList<>();
        //2
        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }
        //3
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("i = "+i +" : " +elements.get(i));
        }
        //4
        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //5
        for (Iterator<Integer> iterator1 = elements.iterator();
             iterator1.hasNext(); ) {
            System.out.println(iterator1.next());
        }
        //6
        for (Integer element : elements) {
            System.out.println(element);
        }

    }
}
