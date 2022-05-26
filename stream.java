import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
         list .add(2);
         list.add(28);
         list.add(38);
         list.add(67);

         //print even (sorted)->0,2

         //1st method

         System.out.println("Even numbers");
         //collections.sort(lists);
         for (int e : list) {
             if(e % 2 == 0){
                 System.out.println(e);

    }


}
System.out.println("\n2)Even Numbers :-");
//2nd method 
list .stream().filter(e -> (e % 2==0)).sorted()
.collect(Collectors.toMap(e -> e+"meow",Function.identity()))
.forEach((k,v) -> System.out.println("key : " + k +", Value:"+ v));

    }


}










