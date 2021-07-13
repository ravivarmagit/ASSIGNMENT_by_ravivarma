import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Name {
    public static void main(String[] args) {

            HashSet<String> h = new HashSet();
            h.add("arun");
            h.add("bala");
            h.add("cavin");
            h.add("deva");
            h.add("eranga");

            Iterator<String> i = h.iterator();
            while(i.hasNext())
            {
                System.out.println("Hash Set :"+i.next());
            }

    }
    {
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("arun");
        lh.add("bala");
        lh.add("cavin");
        lh.add("deva");
        lh.add("eranga");

        Iterator<String> j = lh.iterator();
        while(j.hasNext())
        {
            System.out.println("Linked Hash Set :"+j.next());
        }

    }
}
