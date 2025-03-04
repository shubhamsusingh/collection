import java.util.*;

public class First {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        // Add:-
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.addFirst(0);
        al.addLast(6);
        System.out.println(al);
        al1.add(1);
        al1.add(6);
        al1.add(7);
        System.out.println(al1);
        al.addAll(al1);
        System.out.println(al);
        System.out.println("Add all Colletion on Specific Index");
        al.addAll(3, al1);
        System.out.println(al);

        // Get:-
        System.out.println("get Data");
        int idx2 = al.get(2);
        System.out.println(idx2);
        int first = al.getFirst();
        System.out.println("This is first Index Data " + first);
        int last = al.getLast();
        System.out.println("This is Last Index Data " + last);

        // remove:-
        System.out.println("Original Before remove" + al);
        System.out.println("Remove");
        al.remove(6);
        System.out.println(al);
        al.remove((Integer) 6);
        System.out.println(al);
        al.removeFirst();
        al.removeLast();
        System.out.println(al);
        al.removeAll(al1);
        System.out.println(al);
    }
}