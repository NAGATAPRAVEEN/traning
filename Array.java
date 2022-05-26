import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int size=1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter size of Array");
            size = scanner .nextInt();
            int a[]=new int [size];

            for( int i=0; i<size; i++)
            {
                a[i] = scanner .nextInt();
            }
            System.out.println("printed array elements");
            for(int i=0; i<size; i++)
            {
                System.out.println(a[i]+"");
   }
        } 
    

} 

}