import java.util.Scanner;

public class Question_2 {
    public class main {
        public static void main(String[] args){

            int i ,num, result = 0, rem, check ;

            Scanner input = new Scanner(System.in);

            System.out.println("Finding the Armstrong Number");
            System.out.print("Enter the start number: ");
            int start = input.nextInt();
            System.out.print("Enter the end number: ");
            int end = input.nextInt();
            for(i = start; i <= end; i++ ) {
                num = i;
                while (i != 0) {
                    rem = i % 10;
                    result += Math.pow(rem, 3);
                    i /= 10;
                }
                if (result == num) {
                    System.out.println("The number entered is Armstrong Number");
                }

            }
            }

        }
}
