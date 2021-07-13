import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseNumber {
    public static void main(String[] args) {
        ArrayList<String> N = new ArrayList<String>();
                N.add("a");
                N.add("b");
                N.add("c");
                N.add("d");
                N.add("e");
        ListIterator<String> i = N.listIterator(N.size());

        while(i.hasPrevious()){
            System.out.println(i.previous());
        }

    }
}
