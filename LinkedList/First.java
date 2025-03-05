import java.util.*;

public class First {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();
        // Add:-
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("Linked List " + ll);
        ll1.add(11);
        ll1.add(12);
        ll1.add(13);
        System.out.println("Linked List1 " + ll1);
        ll.addFirst(0);
        ll.addLast(4);
        ll.addAll(ll1);
        System.out.println(ll);

        // Get:-
        System.out.println("This is my original data " + ll);
        int idx5 = ll.get(5);
        System.out.println(idx5);
        int first = ll.getFirst();
        System.out.println(first);
        int last = ll.getLast();
        System.out.println(last);

        // remove:-
        System.out.println("this is my original data before removed " + ll);
        ll.remove();// this will remove the first index data
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        ll.remove((Integer) 13); //it will remove first occurence of data
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.removeLastOccurrence(2);
        System.out.println(ll);
        // Size
        int size = ll.size();
        System.out.println("this is the size of my ll = " + size);

    }
}
