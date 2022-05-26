import java.util.Scanner;

public class util {

public static void main(String[] args) {

    try (Scanner sc = new Scanner (System.in)) {
        System.out.println("enetr weight range1.greater than 90 2.less than 30 3.between 45-60");
        int s =sc.nextInt();
        switch (s){
            case 1:
            System.out.println("your fat");
            break;
            case 2:
            System.out.print("thin");
            break;
            case 3:System.out.println("your healthy");
                
                break;
                }
    }
        }
    }
            
