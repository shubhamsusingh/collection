
// Limitations of Enumeration:
//  Enumeration Concept is Applicable Only for Legacy Classes and it is Not a Universal Cursor.
//  By using Enumeration we can Perform Read Operation and we can't Perform Remove Operation.
import java.util.Enumeration;
import java.util.Vector;

public class First {
  public static void main(String[] args) {
    Vector<Integer> v=new Vector<>();
    v.addElement(1);
    v.addElement(2);
    v.addElement(3);
    v.addElement(4);
    v.addElement(5);
    v.addElement(6);
    v.addElement(7);
    v.addElement(8);
    v.addElement(9);
    v.addElement(10);
    System.out.println(v);
    Enumeration<Integer> E=v.elements();
    while (E.hasMoreElements()) {
        Integer i=(Integer)E.nextElement();
        if (i%2==0) {
            System.out.println(i); 
        }    
    }
    System.out.println(v);
  }  
}
