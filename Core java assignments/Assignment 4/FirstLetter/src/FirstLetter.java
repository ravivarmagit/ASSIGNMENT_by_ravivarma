import java.util.ArrayList;
import java.util.function.Consumer;

public class FirstLetter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        list.add("Reven");
        list.add("elango");
        list.add("arasu");
        list.add("cadaban");
        list.add("tony");
        list.add("ion");
        list.add("oracle");
        list.add("nun");

        Consumer<String> first = i -> s.append(i.charAt(0));

        for(String a : list){
            first.accept(a);
        }
        System.out.println("String:" +s );
    }
}
