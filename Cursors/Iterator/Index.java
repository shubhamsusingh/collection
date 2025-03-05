import java.util.ArrayList;
import java.util.Iterator;

public class Index {
   public static void main(String[] args) {
    ArrayList<Integer> Ar=new ArrayList<>();
    Ar.add(1);
    Ar.add(2);
    Ar.add(3);
    Ar.add(4);
    Ar.add(5);
    Ar.add(6);
    Ar.add(7);
    Ar.add(8);
    Ar.add(9);
    Ar.add(10);
    Ar.addFirst(0);
    Ar.addLast(11);
    System.out.println(Ar);
    Iterator<Integer> i=Ar.iterator();
    while (i.hasNext()) {
        Integer data=(Integer)i.next();
        if (data%2==0) {
            System.out.println(data);
        }else{
            i.remove();
        }
    }
    System.out.println(Ar);
    

   } 
}
