import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Fruit> myFruitList = Arrays.asList(
                new Fruit("Apple",68,90,"Red"),
                new Fruit("Orange", 80,120,"Orange"),
                new Fruit("Banana", 72,40,"Yellow"),
                 new Fruit("papaya",120,35,"yellow"),
                new Fruit("Strawberry",95,95,"red") );
        System.out.println("-----  calories  <  100  sorted  in descending order of calories-----");

        List<Fruit> result = myFruitList.stream().filter(s -> s.getCalories()<100).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if (o2.getCalories()>o1.getCalories()) return 1;
                else return -1;
            }
        }).collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println("-------------- colorwise list of fruit names------------------");

        List<Fruit> result1 = myFruitList.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if (o1.getColor().equals(o2.getColor())) return -1;
                else return 1;
            }
        }).collect(Collectors.toList());
        result1.forEach(System.out::println);

        System.out.println("-------------- Red colour fruit sorted as their price------------------");

        List<Fruit> result2 = myFruitList.stream().filter(b->b.getColor().equals("red")).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.getPrice()> o2.getPrice()) return 1;
                else return -1;
            }
        }).collect(Collectors.toList());
        result2.forEach(System.out::println);

        System.out.println("-------------- News------------------");

        System.out.println("-------------- Maximum NewsId commented------------------");

        List<News> mynewsList = Arrays.asList(new News(111, "Shweta ", "Aarti" , "Its a breaking news about budget" )
                , new News(112, "Aarti" , "Shweta", "This news relates buisness, politics, sports and the budget")
                , new News(113, "Girish" , "Kirti" , "That's a great news.." )
                , new News(111, "Shweta" , "Nikita" , "It's very shocking" )
                , new News(111, "Shweta" , "Shweta" , "What will be the budget ")
                , new News(116, "Kirti" , "Girish" , "I don't know about this budget article..")
        );

        Integer result3 = mynewsList.stream().collect(Collectors.groupingBy(News::getNewsId,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println("News id with maximum comments : "+result3);

        System.out.println("-------------- Number of times the word Budget arrives------------------");

        long result4 = mynewsList.stream().filter(s->s.getComment().contains("budget")).count();
        System.out.println("the number of times the word budget arives : "+result4);

        System.out.println("-------------- user who posted maximum number of comments------------------");

        String result5 = mynewsList.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("the user who posted maximum number of comments: "+result5 );

        System.out.println("-------------- Display comments------------------");

        Map result6 = mynewsList.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
        System.out.println(result6);

        System.out.println("-------------- TRANSACTION------------------");

        List<Transaction> mytransaction = Arrays.asList(
                new Transaction(new Trader("Ravi","Delhi"),2012,100000),
                new Transaction(new Trader("Vijay","Bangalore"),2010,2500000),
                new Transaction(new Trader("Chal","Pune"),2011,300000),
                new Transaction(new Trader("Sofia","Pune"),2021,500000),
                new Transaction(new Trader("Maddy","Delhi"),2011,60000)
        );

        System.out.println("-------------- transaction in the year 2011 and sorted------------------");

        List<Transaction> result7 = mytransaction.stream().filter(c->(c.getYear())==2011).sorted(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                if(o1.getValue()>o2.getValue()) return 1;
                else return -1;
            }
        }).collect(Collectors.toList());
        System.out.println(result7);

        System.out.println("-------------- Transaction values from all Traders in delhi------------------");

        List<Transaction> result8 = mytransaction.stream()
                .filter(c->c.getTrader().getCity().equals("Delhi"))
                .collect(Collectors.toList());
        System.out.println("All transactions values from the traders: "+result8);


        System.out.println("-------------- highest Value of all transaction------------------");
        Integer result9 = mytransaction.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey()).get().getKey();;

        System.out.println("Highest value of the transaction: "+result9);

        System.out.println("-------------- Smallest value of all transasctions------------------");

        List<Transaction> result10 = mytransaction.stream().
                min(Comparator.comparing(Transaction::getValue))
                .stream()
                .collect(Collectors.toList());
        System.out.println(result10);

        System.out.println("-------------- TRADERS------------------");

        List<Trader> mylistoftraders = Arrays.asList(

                new Trader("Reka", "Chennai"),
                new Trader("Sam", "Trivandrum"),
                new Trader("Kevin", "Pune"),
                new Trader("Kavi", "Pondicherry"),
                new Trader("Abi", "Pune"),
                new Trader("Jai", "Bangalore"),
                new Trader("Lilly","Indore")

        );

        System.out.println("-------------- All traders from pune and sorted------------------");

        List result11 = mylistoftraders.stream()
                .filter(s->s.getCity().equals("Pune"))
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Traders from Pune and sort them by name: "+result11);

        System.out.println("-------------- Name sorted Alphabetically------------------");

         mylistoftraders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-------------- Lives in indore------------------");

        Optional<Trader> result12 = mylistoftraders.stream().filter(s->s.getCity().equals("Indore")).findAny();
        System.out.println(result12);



    }
}
