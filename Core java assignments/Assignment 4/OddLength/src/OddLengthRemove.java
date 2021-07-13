import java.util.ArrayList;

public class OddLengthRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ravi");
        list.add("ilango");
        list.add("vadivel");
        list.add("hussain");

        list.removeIf((i) ->((i.length())%2 != 0));
        System.out.println(list);
    }
}
