public class Order {
    public static void main(String[] args) {

        priceLambda my= str ->{
            if(str>10000)
                return "The order status is accepted and completed";
            else
                return"The order status is not accepted";
        };
        System.out.println(my.price(15000));
        System.out.println(my.price(9000));
        System.out.println(my.price(2000));
        System.out.println(my.price(12000));
    }
    interface priceLambda{
        String price(int str);
    }
}
