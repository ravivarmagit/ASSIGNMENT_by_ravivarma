import java.util.Comparator;
public class Comparable implements Comparator <Person> {
    public int compare(Person a,Person b){
        if(a.getWeight()>b.getWeight()) { return 1; }
        else if(a.getWeight() < b.getWeight()) { return -1; }
        else {
            if(a.getHeight() > b.getWeight()) { return 1; }
            else if(a.getHeight() < b.getHeight()) { return -1; }
            else { return 0; }
        }
    }
}
