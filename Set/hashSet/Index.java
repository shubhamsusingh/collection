import java.util.HashSet;

public class Index {
    public static void main(String[] args) {
        HashSet<Integer> sh = new HashSet<>();
        sh.add(1);
        sh.add(2);
        sh.add(3);
        sh.add(4);
        sh.add(5);
        sh.remove(2);
        System.out.println(sh.add(3));
        System.out.println(sh);
    }

}
