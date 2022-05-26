import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
    
        List<String> arrayList = new ArrayList<>();

        arrayList.add("candy");
        arrayList.add("lucy");
        arrayList.add("tommy");
        arrayList.add("leo");
        arrayList.set(4, "tom");

        arrayList.forEach(a->{
            System.out.println(a);
        });
    }
            
}





