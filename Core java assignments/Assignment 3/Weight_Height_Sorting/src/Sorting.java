
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<Person>(new Comparable());
        Person obj = new Person(50, 6, "rey");
        Person obj1 = new Person(45, 7, "blake");
        Person obj2 = new Person(50, 5, "jene");

        personSet.add(obj);
        personSet.add(obj1);
        personSet.add(obj2);

        for(Person per : personSet) {
            per.display();

        }
    }
}