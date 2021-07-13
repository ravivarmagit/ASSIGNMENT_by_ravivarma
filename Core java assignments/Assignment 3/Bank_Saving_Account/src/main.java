import java.util.HashSet;
import java.util.TreeSet;

public class main { public static void main(String[] args)
{
    //HashSet<SavingsAccount> myset = new HashSet<SavingsAccount>();
    TreeSet<SavingsAccount> myset = new TreeSet<SavingsAccount>();
    SavingsAccount s1=new SavingsAccount(50000, 712, "Rey", true);
    SavingsAccount s2=new SavingsAccount(25000, 232, "Ravi", true);
    SavingsAccount s3=new SavingsAccount(15000, 567, "vicky", false);
    s3.updateBalance(0,600);
    myset.add(s1);
    myset.add(s2);
    myset.add(s3);
    myset.add(s2);

    //List list = new ArrayList(myset);
    //Collections.sort(list);
    System.out.println(myset);
    for(SavingsAccount s:myset)
    {
        System.out.println("Account id: " + s.acc_id +" Account Holder Name: "+s.accHolderName+ " Balance: "+ s.acc_balance);
    }
}

}

