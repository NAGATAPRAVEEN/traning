import java.util.Scanner;

public class Nearestprimenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter  the value");
            int  n = sc.nextInt();

            for(int x=n; ; x++) {
                if(x>n)
                {
                    boolean status = true;
                    for (int y=2;y<x;y++) {
                        if(x%y==0) {
                            status = false;
                        }

                    }
                    if(status && x>1) {
                        System.out.println(x);break;
                    }

                }
            }
        }
    }
}

