

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class UpperCase {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("mani", "vel", "raja", "joseph"));
        System.out.println(list);
        list.replaceAll(new MyOperator());
        System.out.println(list);
    }
}

class MyOperator implements UnaryOperator<String>
{
    public String apply(String t){
    return t.toUpperCase();
}
}
