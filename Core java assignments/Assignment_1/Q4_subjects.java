ackage com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sub1,sub2,sub3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Marks of First subject: ");
        sub1 = input.nextInt();

        System.out.print("Enter the Marks of Second subject: ");
        sub2 = input.nextInt();

        System.out.print("Enter the Marks of Third subject: ");
        sub3= input.nextInt();


        if((sub1>60)&&(sub2>60)&&(sub3>60)){
            System.out.println("Result: PASS");
        }
        else if((sub1>60)&&(sub2>60)&&(sub3<60) ||
                (sub1>60)&&(sub2<60)&&(sub3>60) ||
                (sub1<60)&&(sub2>60)&&(sub3>60)){
            System.out.println("Result: PROMOTED");
        }
        else if((sub1>60)&&(sub2<60)&&(sub3<60) ||
                (sub1<60)&&(sub2>60)&&(sub3<60) ||
                (sub1<60)&&(sub2>60)&&(sub3>60) ||
                (sub1<60)&&(sub2<60)&&(sub3<60)){
            System.out.println("Result: FAIL");
        }
    }
}
