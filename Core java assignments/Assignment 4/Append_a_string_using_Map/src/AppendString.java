import java.util.HashMap;
import java.util.Map;

public class AppendString {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        hm.put("ravi","R");
        hm.put("arya","A");
        hm.put("cavin","C");
        hm.put("eranga","E");

        for(HashMap.Entry<String,String> hme : hm.entrySet())
        {
            String s1 = hme.getKey();
            String s2 = hme.getValue();
            sb.append(s1).append(s2);
        }
        System.out.println(sb);
    }
}
