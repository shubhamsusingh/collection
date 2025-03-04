import java.util.*;
public class First{
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.addLast(12);
        al.addFirst(0);
        System.out.println(al);
        al.set(3, 11);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.removeFirst();
        System.out.println(al);
    }
}