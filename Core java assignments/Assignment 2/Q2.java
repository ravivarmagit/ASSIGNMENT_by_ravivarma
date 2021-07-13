public class Employee {

    String empname;
    String desg;
    int salary;
    int extrawage;
    int totalsal;

    public int totalsalary(){
        ///////empty //////
        return 0;
    }
}

public class Manager extends Employee {
    public Manager(String blake, String manager, int i, int i1) {
        //super();
        this.empname=blake;
        this.desg=manager;
        this.salary=i;
        this.extrawage =i1;

        super.totalsal += i+i1;
    }

    @Override
    public int totalsalary() {
        return totalsal;
    }
}

public class Labour extends Employee{
    public Labour(String rey, String labour, int i, int i1) {
        this.empname=rey;
        this.desg=labour;
        this.salary=i;
        this.extrawage =i1;
        super.totalsal += i+i1;
    }

    @Override
    public int totalsalary() {
        return totalsal;
    }
}
public class Main {
    public static void main(String[] args) {

        Manager obj = new Manager("blake", "manager", 14000, 5000);
        Labour obj1 = new Labour("rey", "labour", 30000, 5000);


        System.out.println("The Total salary is" +(obj.totalsalary() + obj1.totalsalary()));
    }
}
