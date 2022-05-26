import java .util.Scanner;

public class arushi {
    public static void main(String[] args) {
        System.out.println("Enter the name");
        try (Scanner sc = new Scanner(System.in)) {
            String Name = sc.nextLine();
             System.out.println("Enter the age");
             int age = sc.nextInt();

             if (age>=18) {

                System.out.println(Name+ "is an adult");
             }
             else
             {
                 System.out.println(Name+ "is not an adult");

             }
        }

         



        }
    }
