package arrayPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        arrayList.add(0, 10); // O(n)
        long end = System.nanoTime();
        System.out.println("ArrayList insert at start: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(0, 10); // O(1)
        end = System.nanoTime();
        System.out.println("LinkedList insert at start: " + (end - start) + " ns");
    }
}

