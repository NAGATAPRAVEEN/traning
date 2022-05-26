import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sortingstring {
 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
     System.out.println("Enter the string: ");
     String s = sc.nextLine();
     List<Integer> list = new ArrayList<>();
     for(int i = 0;i<s.length();i++){
         int m = s.charAt(i);
         list.add(m);
     }
     Collections.sort(list);

     String newsString="";
     for(int i = (list.size()-1); i >=0;i--) {
         newsString+=(char)(int)list.get(i);
     }

     System.out.println(newsString);
    }

}

    