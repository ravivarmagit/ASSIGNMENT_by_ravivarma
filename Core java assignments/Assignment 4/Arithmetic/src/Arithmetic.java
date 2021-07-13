public class Arithmetic {
    public static void main(String[] args) {

      ArithLambda add = (int a, int b) -> a+b;
        System.out.println(add.arith(4,6));
        ArithLambda sub = (a,b) -> a-b;
        System.out.println(sub.arith(6,5));
        ArithLambda mul = (a,b) -> a*b;
        System.out.println(mul.arith(5,3));
        ArithLambda div = (a,b) -> a/b;
        System.out.println(div.arith(6,2))  ;

        }
    interface ArithLambda {
        int arith(int a, int b);
    }
}
