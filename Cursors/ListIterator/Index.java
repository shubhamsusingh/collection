import java.util.LinkedList;
import java.util.ListIterator;

public class Index {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Shubham");
        ll.add("Joy");
        ll.add("Riya");
        ll.add("Harry");
        System.out.println(ll);
        ListIterator<String> Li = ll.listIterator();
        while (Li.hasNext()) {
            String s = Li.next();
            if (s.equals("Shubham")) {
                Li.remove();
            }
            if (s.equals("Joy")) {
                Li.add("Rahul");
            }
            if (s.equals("Riya")) {
                Li.add("Virat");
            }
            if (s.equals("Riya") && Li.hasPrevious()) {
                String prev = Li.previous(); // Access the previous element
                System.out.println("Previous element to 'Riya': " + prev);
                // Move the iterator back to the current position
                Li.next();
                System.out.println(Li.hasNext());
            }
        }
        System.out.println(ll);
    }
}
