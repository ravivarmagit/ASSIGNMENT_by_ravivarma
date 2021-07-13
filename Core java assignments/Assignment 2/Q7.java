public abstract class dessertitem {
    public static int getCost(int item) {
        return 0;
    }
}



public class owner extends dessertitem {
    public static void update(){
        System.out.println("Cart updated");
    }
}


public class customer extends dessertitem{
public static int c;
    public static int getCost(int item) {
        if (item == 1)
        {c=60;}
        else if (item == 2)
        {c= 0;}
        else if (item == 3)
        {c=80;}
        return c;
    }
}




import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner desert = new Scanner(System.in);

        System.out.println("Enter 1 for customer or 2 for owner: ");
        int number = desert.nextInt();
        if(number == 1) {
            System.out.print("Enter 1 for andy or 2 for cookie or 3 for icecream to purchase");
            int item = desert.nextInt();
            System.out.println("The cost of the item is rs"+customer.getCost(item));
        }
         else if(number == 2) {
             owner.update();
        }
        }
}
