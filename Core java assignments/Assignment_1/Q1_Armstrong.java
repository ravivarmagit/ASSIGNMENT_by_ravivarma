import java.util.Scanner;

public class Question_1 {
    public class main {
        public static void main(String[] args){

            int result = 0, rem, check ;   

            Scanner input = new Scanner(System.in);

            System.out.println("Finding the Armstrong Number");
            System.out.print("Enter the number: ");

            int num = input.nextInt(); 
            check = num;

            int length = (int) (Math.log10(num) + 1); 

            while(num != 0){
                rem = num % 10;
                result += Math.pow(rem, length);
                num /= 10;
            }
            if(result == check){
                System.out.println("The number entered is Armstrong Number");
            }
            else{
                System.out.println("The number entered is not Armstrong Number");
            }

        }
}
