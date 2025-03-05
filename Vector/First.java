
import java.util.Vector;

public class First {
   public static void main(String[] args) {
    Vector<Integer> vc=new Vector<>();
    Vector<Integer> vc1=new Vector<>();
    vc.add(1);
    vc.add(2);
    vc.add(3);
    vc.add(4);
    System.out.println(vc);
    vc.addFirst(0);
    vc.addLast(5);
    System.out.println(vc);
    vc.add(4, 2);//this will add at that element at that particular index And previous element will swip one idex right side
    System.out.println(vc);
    vc1.add(10);
    vc1.add(11);
    vc1.add(12);
    System.out.println("This is second Vector = "+vc1);
    vc.addAll(vc1);
    System.out.println(vc);

    //Get:-
    System.out.println("Now i Performing Get"+vc);
    int idx2=vc.get(2);
    System.out.println(idx2);
    int first=vc.getFirst();
    System.out.println(first);
    int last=vc.getLast();
    System.out.println(last);

    //remove:-
    System.out.println("Now i Performing Remove"+vc);
    vc.remove(2);
    System.out.println(vc);
    vc.remove((Integer)5);
    System.out.println(vc);
    vc.removeFirst();
    vc.removeLast();
    System.out.println(vc);
    vc.removeAll(vc1);
    System.out.println(vc);


   } 
}
