import java.util.Stack;

public class First {
   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    int idx= st.peek();
    System.out.println(idx);
    int idxPop=st.pop();
    System.out.println(st);
    System.out.println(idxPop);
    //Below Add work because stack in collection is chield classs of vector thats why it add element at particular index otherwise stack not allow to add particular index it alway posible to add on top 
    st.add(5); 
    st.add(1, 6);
    System.out.println(st);
   } 
}
