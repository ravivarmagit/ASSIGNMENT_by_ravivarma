import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {
    private static HashMap<Object, Object> mytable;

    public static <set> void main(String[] args) {

        Map<Employee, Department> empdep = new Hashtable<>();

        Employee e1 = new Employee(001, "rey", 9000);
        Employee e2 = new Employee(002, "black", 10000);
        Employee e3 = new Employee(003, "jene", 11000);

        Department d1 = new Department("IT", "chennai");
        Department d2 = new Department("FINANCE", "mumbai");

        empdep.put(e1, d1);
        empdep.put(e2, d2);
        empdep.put(e3, d1);

        System.out.println(empdep.size());
        Set<Map.Entry<Employee, Department>> entrySet = empdep.entrySet();
        for (Map.Entry<Employee, Department> entry : entrySet) {
            Employee employee = entry.getKey();
            Department department = entry.getValue();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }
}
